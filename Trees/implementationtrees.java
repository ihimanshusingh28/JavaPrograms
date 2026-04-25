package Trees;
//Basic implementation of trees in java
import java.util.*;
import java.util.ArrayList;

class TreeNode<T> {
    T data;
    List<TreeNode<T>> children;
    
    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
    
    public void addChild(TreeNode<T> child) {
        children.add(child);
    }
}


public class implementationtrees {
    static void insert(TreeNode<Integer> root, int data) {
        if (root == null) {
            return;
        }
        TreeNode<Integer> newNode = new TreeNode<>(data);
        root.addChild(newNode);
    }
    
}
