package us.kvitko.universityapp.entity;

public class Teacher implements Teach, PresenceUniversity {

    private String name;
    private University university;
    private Student student;

    public Teacher(String name) {
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void giveExam() {
        System.out.println("Teacher" + " " + name + " " + "gives the examination paper to a student");
    }

    @Override
    public void goUniversity() {
        System.out.println("Teacher" + " " + name + " " + "is at the university");
    }
}

