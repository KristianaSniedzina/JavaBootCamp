package sef.FinalActivity;

public class Students extends Person {

    public String schoolName;

    public static void main(String[] arg) {

        Students n1 = new Students();
        n1.setSchoolName("University of Latvia");
        n1.introduce();

        Students n2 = new Students();
        n2.setSchoolName("Stradins University");
        n2.introduce();
//        Person p1 = new Person();
//        p1.getFirstName();
//        p1.getSecondName();
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public String getSchoolName(){
        return schoolName;
    }

    public void introduce(){

        System.out.println("I am studying in " + schoolName);
    }

}

