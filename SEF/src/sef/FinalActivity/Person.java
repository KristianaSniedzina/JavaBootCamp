package sef.FinalActivity;

public class Person {
        //Attributes
        public String firstName;
        public String secondName;
        public Integer age;

        //Behavior
    public static void main(String[] args){
         Person p1 = new Person();
         p1.setFirstName("Alex");
         p1.setSecondName("Karev");
         p1.setAge(27);
         p1.introduce();

         Person p2 = new Person();
         p2.setFirstName("Viki");
         p2.setSecondName("Bloom");
         p2.setAge(21);
         p2.introduce();
    }

    public void setFirstName(String firstName){
         this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setSecondName (String secondName){
        this.secondName = secondName;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public  void introduce(){
        System.out.println("My name is " + firstName + " " + secondName + " and I am " + age + " years old!");
    }
}
