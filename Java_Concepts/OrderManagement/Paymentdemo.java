package Java_Concepts.OrderManagement;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PaymentService {

	 static class User{
	  private String userid;
	  private String name;
	  private String email;
	  User(String userid , String name , String email){
		  this.userid=userid;
		  this.name=name;
		  this.email=email;
	  }
	 }
	 
	 static class PaymentRequest{
		 private String orderid;
		 private double amount;
		 private User user;
		 PaymentRequest(String orderid , double amount , User user){
			 this.orderid=orderid;
			 this.amount=amount;
			 this.user=user;
		 }
	 }
		 
	 
	 
	 static class PaymentResponse{
		 private Status paystatus;
		 private String Transid;
		 private String orderid;
		 private User user;
		 PaymentResponse(Status paystatus , String Transid , String orderid , User user){
			 this.paystatus=paystatus;
			 this.Transid=Transid;
			 this.orderid=orderid;
			 this.user=user;
		 }
	 }
	 enum Status{
		 SUCCESS,
		 FAILED,
		 PENDING
	 }
		 
	 
	 static class PaymentProcessService{
		 private PaymentResponse process(PaymentRequest request) {
			 if(request.amount<=0) 
				 throw new IllegalArgumentException("ïnvalid amount");
		 
			 return new PaymentResponse(Status.SUCCESS,UUID.randomUUID().toString(),request.orderid,request.user);
		 }
	 }
	 static class OrderService{
		 private void prepareOrder(PaymentResponse res) {
			 if(res.paystatus==Status.FAILED) {
				 System.out.println("Dont prpeare orde");
			 }
			 System.out.println("prepare order for " + res.Transid);
		 }
		 
	 }
	 static class EmailServices{
		 private void sendEmail(PaymentResponse res) {
		 if(res.paystatus==Status.FAILED) {
			 System.out.println("email payment failure");
		 }
		 System.out.println("Email succes payment");
	 }
	 }
	 //Orchestrator
	 static class PaymentOrchestrator{
		 private ExecutorService paymentexe ;
		 private ExecutorService bagexe;
		 PaymentProcessService payservice= new PaymentProcessService();
		 OrderService order= new OrderService();
		 EmailServices email= new EmailServices();
		 
		 PaymentOrchestrator(){
			 paymentexe = Executors.newFixedThreadPool(2);
			 bagexe = Executors.newFixedThreadPool(2);
		 }
		 private CompletableFuture<String> process(PaymentRequest req) {
			 return CompletableFuture.supplyAsync(() -> payservice.process(req), paymentexe)
				 .thenCompose(payResult -> {
					 if (payResult.paystatus == Status.FAILED) {
						 CompletableFuture<String> failed = new CompletableFuture<>();
						 failed.completeExceptionally(new RuntimeException("Payment failed"));
						 return failed;
					 }
					 return CompletableFuture.supplyAsync(() -> {
						 order.prepareOrder(payResult);
						 email.sendEmail(payResult);
						 return payResult.Transid;
					 }, bagexe);
				 });
                }
            }
}
	 