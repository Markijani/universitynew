package us.kvitko.universityapp._main;

import us.kvitko.universityapp.entity.Student;
import us.kvitko.universityapp.entity.Teacher;
import us.kvitko.universityapp.service.UniversityService;

public class _Main {

    public static void main(String[] args) {
        Student student = new Student("Bernice");
        Teacher teacher = new Teacher("Igasaki");
        UniversityService universityService = new UniversityService();
        universityService.learn(student);
        universityService.study(teacher);
        universityService.presence(student);
        universityService.presence(teacher);
    }
}
