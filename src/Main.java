
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        jobSite.addvacancy("First Java position");
        jobSite.addvacancy("Second Java position");
        Observer Firstsubcriber = new Subcriber("Miko");
        Observer Secondsubcriber = new Subcriber("Aiko");
        jobSite.register(Firstsubcriber);
        jobSite.register(Secondsubcriber);
        jobSite.addvacancy("Third Java Position");
        jobSite.removevacancy("First Java position");

    }
}
