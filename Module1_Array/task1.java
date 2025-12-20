class Main {
    public static void main(String[] args) {
        
        // static D& I
        int[]n={10,20,30,40};
        System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[2]);
        System.out.println(n[3]);
        System.out.println(n.length);
        
        for(int i=0; i<n.length; i++){
            System.out.println("at index "+ i + " is " + n[i]);
        }
        // static D& I we are using new key word
        int[] n1= new int[] {1,2,3,4};
        
        for(int i=0; i<n1.length; i++){
            System.out.println("at index "+ i + " is " + n1[i]);
        }
        
        String[] names =new String[] {"jeet","raj","ram"};
        for(int i=0; i<names.length; i++){
            System.out.println("at index "+ i + " is " + names[i]);
        }
        
        // Dynamic Allocation
        int[] n3= new int[10];
        n3[0]=200;
        n3[9]=2000;
        
        for(int i=0; i<n3.length; i++){
            System.out.println("at index "+ i + " is " + n3[i]);
        }
        
        
        
        
    }
}
