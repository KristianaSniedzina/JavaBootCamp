package sef.FinalActivity;

public class Employee {
    //Attributes
     String name;
     int age;
     String title;
     String company;
     double salary;

    //Behavior
    public static void main(String[] arg){
        Employee e1 = new Employee();
        e1.setName("Kristiana");
        e1.setAge(21);
        e1.setTitle("developer");
        e1.setCompany("Accenture");
        e1.setSalary(789.5);
        e1.displayinformation();

        Employee e2 = new Employee();
        e2.setName("Linda");
        e2.setAge(27);
        e2.setTitle("developer");
        e2.setCompany("Accenture");
        e2.setSalary(895.0);
        e2.displayinformation();

        Employee e3 = new Employee();
        e3.setName("Mark");
        e3.setAge(31);
        e3.setTitle("quality engineer");
        e3.setCompany("Accenture");
        e3.setSalary(1000.5);
        e3.displayinformation();
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setTitle (String title) { this.title = title; }
    public void setCompany (String company) { this.company = company; }
    public void setSalary (double salary) { this.salary = salary; }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getTitle() { return title; }
    public String getCompany() { return company; }
    public double getSalary() { return salary; }



    void displayinformation(){
        System.out.println("My name is " + name + " and I am " + age + " years old. I work as " + title + " in " + company);
    }
}























        //        setName(name);
//        setAge(age);
//    }
//    //set get name
//    public final void setName(String name){
//        if(name == null){
//            throw new IllegalArgumentException("Name cannot be null!");
//        }
//        this.name = name;
//    }
//    public  String getName(){ return name; }
//
//    //set get age
//    public final void setAge(int age){
//        if(age < 0){
//            throw new IllegalArgumentException("Age cannot be negative!");
//        }
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//
//
//    public void myMethod(){
//
//    }
//}
