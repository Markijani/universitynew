package us.kvitko.universityapp.servise;

import us.kvitko.universityapp.entity.PresenceUniversity;
import us.kvitko.universityapp.entity.Teach;
import us.kvitko.universityapp.entity.Teachable;

public class UniversityService {
    public static void study (Teach teach) {
        teach.giveExam();
    }

    public static void learn(Teachable teachable) {
        teachable.takeExam();
    }

    public static void presence(PresenceUniversity presenceUniversity) {
        presenceUniversity.goUniversity();
    }
}
