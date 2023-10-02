package us.kvitko.universityapp.entity;

public class Student implements Teachable, PresenceUniversity {

    private String name;
    private University university;
    private Teacher teacher;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void takeExam() {
        System.out.println("Student" + " " + name + " " + "is taking an exam");
    }

    @Override
    public void goUniversity() {
        System.out.println(name + " " + " is going to the university");
    }
}
