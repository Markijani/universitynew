package us.kvitko.universityapp.entity;

public class Student implements Teachable, PresenceUniversity {

    private University university;

    public Student() {
        this.university = new University();
        university.setName("UCLA");
        university.setStudent("Bernice");
    }

    public String getName() {
        return university.getName();
    }

    public String getStudent() {
        return university.getStudent();
    }


    @Override
    public void takeExam() {
        System.out.println("Student" + " " + getStudent() + " " + "is taking an exam");
    }

    @Override
    public void goUniversity() {
        System.out.println(getStudent() + " " + " is going to the" + " " + getName());
    }

}
