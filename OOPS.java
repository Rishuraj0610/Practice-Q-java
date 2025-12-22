class Student {
    String name;
    int age;
   
    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
 }
 
 
 public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Raju";
        s1.age = 23;
        s1.getInfo();
 
 
        Student s2 = new Student();
        s2.name = "Erupt ";
        s2.age = 27;
        s2.getInfo();
    }
 }
 

