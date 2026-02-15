package BinaryTrees;




public class BTimpl {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
         display(root.left);
         display(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static void d(Node root){
        if(root==null) return ;
        System.out.print(root.val+" -> ");
        if(root.left!=null) System.out.print(root.left.val+" ");
        if(root.right!=null) System.out.print(root.right.val+" ");
        System.out.println();
        d(root.left);
        d(root.right);
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
        display(root);
        System.out.println();
        System.out.println(sum(root));
        d(root);
    }
}
