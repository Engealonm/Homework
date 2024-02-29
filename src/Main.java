
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Youtube_channels new_channel = new Youtube_channels();
        new_channel.addchannel("nurzatguides");
        new_channel.addchannel("Rusgametactics");
        Observer Firstsubcriber = new Subcriber("Miko");
        Observer Secondsubcriber = new Subcriber("Aiko");
        new_channel.register(Firstsubcriber);
        new_channel.register(Secondsubcriber);
        new_channel.addchannel("Padlo play");


    }
}
