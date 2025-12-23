public class Student{
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name of the Student :" + name);
        System.out.println("Age of the Student :" + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Rishu Raj" ,19);
        s1.displayInfo();
    }
}