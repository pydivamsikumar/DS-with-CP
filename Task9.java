
class Node{
   private int data;
    Node next;
    Node(int a){
        data=a;
        next=null;
        
    }
    public void getdata(){
        System.out.println(data);
    }
    public void getref(){
        System.out.println(next);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("vamsi kumar");
        Node a =new Node(100);
        
        Node  b=new Node(200);
        a.getdata();
        a.getref();
        
        a.next=b;
        
        a.getref();
        System.out.println(a);
        System.out.println(b);
    }
}
