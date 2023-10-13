package day40_Week08_Review.scrumTask;

import java.util.ArrayList;

public class ScrumTeam {

    public String PO, BA, SM;

    public ArrayList<Developer> devList = new ArrayList<>();

    public ArrayList<Tester> testerList = new ArrayList<>();

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addDeveloper(Developer developer) {
        devList.add(developer);
    }

    public void addTester(Tester tester) {
       testerList.add(tester);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", devList=" + devList +
                ", testerList=" + testerList +
                '}';
    }
}
