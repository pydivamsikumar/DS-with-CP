// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] n={10,20,30,40};
        System.out.println(n[0]); //zeroth index -> 1st element of array
        System.out.println(n[1]);
        System.out.println(n[2]);
        System.out.println(n[3]);
        System.out.println (n.length+"total elements in array");// total elements in array
        
        //why we are repeating ourselves 
        for(int i=0;i<n.length;i++){
         System.out.println("index " +i+" element is"+n[i]); 
        }
    }
}code
