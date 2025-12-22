class student{
    String name;
    int age;
    
    void getName(){
    System.out.println(name);   
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        //UDT
        //int a=4;
        student a=new student();
        a.name="Ram";
        a.age=30;
        System.out.println(a.name);
        System.out.println(a.age);
        a.getName();
    }
}
