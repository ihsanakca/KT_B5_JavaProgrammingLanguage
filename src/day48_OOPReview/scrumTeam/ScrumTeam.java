package day48_OOPReview.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductManager PM;

    public BusinessAnalyst BA;

    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();

    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductManager PM, BusinessAnalyst BA, ScrumMaster SM, ArrayList<Tester> testers, ArrayList<Developer> developers) {
        this.PM = PM;
        this.BA = BA;
        this.SM = SM;
        this.testers = testers;
        this.developers = developers;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addTester(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }


    public void addDeveloper(Developer developers) {
        this.developers.addAll(Arrays.asList(developers));
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PM=" + PM +
                ", BA=" + BA +
                ", SM=" + SM +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
