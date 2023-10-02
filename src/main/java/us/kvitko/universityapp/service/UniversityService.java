package us.kvitko.universityapp.service;

import us.kvitko.universityapp.entity.*;

public class UniversityService {

    public void study(Teach teach) {
        teach.giveExam();
    }

    public void learn(Teachable teachable) {
        teachable.takeExam();
    }

    public void presence(PresenceUniversity presenceUniversity) {
        presenceUniversity.goUniversity();
    }
}
