
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Youtube_channel jobSite = new Youtube_channel();
        jobSite.addchannel("First Java position");
        jobSite.addchannel("Second Java position");
        Observer Firstsubcriber = new Subcriber("Miko");
        Observer Secondsubcriber = new Subcriber("Aiko");
        jobSite.register(Firstsubcriber);
        jobSite.register(Secondsubcriber);
        jobSite.addchannel("Third Java Position");
        jobSite.removechannel("First Java position");

    }
}
