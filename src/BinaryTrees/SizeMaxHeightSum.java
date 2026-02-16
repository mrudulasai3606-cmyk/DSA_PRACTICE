package BinaryTrees;

public class SizeMaxHeightSum {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }

    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int heigth(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(heigth(root.left),heigth(root.right));
    }
    public static int max(Node root){
        if(root==null) return 0;
        int a = root.val;;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static void main(String[] args) {
       Node root = new Node(10);
       Node a = new Node(20);
      Node b = new Node(30);
        root.left = a;
        root.right = b;
        Node c = new Node(40);
        Node d = new Node(50);
        a.left = c;
        b.right = d;
       int s = sum(root);
        System.out.println(s);
        System.out.println(max(root));
        System.out.println(heigth(root));
        System.out.println(size(root));
    }
}
