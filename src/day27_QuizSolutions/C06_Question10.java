package day27_QuizSolutions;

public class C06_Question10 {

        public static void main(String[] args)
        {
            String song = "good";
            String talk = "feel";
            String feel = "walk";
            getOutput(talk, "song", feel);
        }
        public static void getOutput(String hear, String good, String song)
        {
            good = "" + song + " " + hear + " " + good;
            System.out.println("to " + hear + " the " + song + " is " + good);
        }

    }



