package codeforces;

import java.util.ArrayList;
import java.util.List;

public class Asteroidcollisons {
    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> al = new ArrayList<>();
        int j = 0;
        for(int i=0; i<asteroids.length; i++){
            if(asteroids[j] > 0 && asteroids[i]<0){
                al.add(Math.abs(asteroids[j] > Math.abs(asteroids[i])?asteroids[j]:asteroids[i]));
            }
            else if(j == 0){
                al.add(asteroids[j]);
            }
            al.add(asteroids[i]);
        }
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {5,10,-5};
        int[] result = asteroidCollision(arr);
        
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
 