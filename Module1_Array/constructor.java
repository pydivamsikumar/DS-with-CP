class student {
    String name;
    int age;


    student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        student b = new student("vamsi", 19);
        System.out.println(b.name);
        System.out.println(b.age);
    }
}
