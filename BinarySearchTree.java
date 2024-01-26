import java.util.Scanner;
// import javax.xml.crypto.Data;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    //constructor
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BinarySearchTree {
    TreeNode root;
    //constructor for parameter=>bst
    public BinarySearchTree(int rootData){
        root=new TreeNode(rootData);
    }
    //Method for invoke inserting Bst
    public void insert(int data){
        root=insertVal(root,data);
    }
    //method for same invoke but for value allocatoin
    private TreeNode insertVal(TreeNode root,int data){
        if(root==null){
            root=new TreeNode(data);
            return root;
        }
        //nested if()
        if(data < root.data){
            root.left=insertVal(root.left, data);
        }else{
            root.right=insertVal(root.right, data);
        }
        return root;
    } 
    //Traversal start()
    public void InOrderTrversal(){
        InOrderTrversal(root);
    }
    //Method BT
    private void InOrderTrversal(TreeNode root){
        if(root!= null){
            InOrderTrversal(root.left);
            System.out.println(root.data+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Root value");
        int rootValue=sc.nextInt();
        BinarySearchTree bst =new BinarySearchTree(rootValue);
        System.out.println("Enter the number of node:");
        int numNode=sc.nextInt();
        //forloop
        for(int i=0;i<numNode;i++){
            System.out.println("Enter the element:"+(i+1)+": ");
            int nodeValue=sc.nextInt();
            bst.insert(nodeValue);
        }
        System.out.println("Inorder Traversal: ");
        bst.InOrderTrversal();
    }
}
