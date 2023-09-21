package us.kvitko.universityapp.entity;

public class Teacher implements Teach, PresenceUniversity {
    private University university;

    public Teacher () {
        this.university = new University();
        university.setStudent("Bernice");
        university.setTeacher("Igasaki");
        university.setName("UCLA");
    }

    public String getStudent() {
        return university.getStudent();
    }

    public String getTeacher() {
        return university.getTeacher();
    }

    public String getName() {
        return university.getName();
    }


    @Override
    public void giveExam() {
        System.out.println("Teacher" + " " + getTeacher() + " " + "gives the examination paper to student" + " " + getStudent());
    }

    @Override
    public void goUniversity() {
        System.out.println("Teacher" + " " + getTeacher() + " " + "is at the" + " " + getName());

    }

}
