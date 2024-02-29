import java.util.List;
public class Subcriber implements Observer{
    String name;
    public Subcriber(String name){
        this.name = name;
    }
    public void updates(List<String> channels){
        System.out.println("Dear"+name+"\nWe have changes\n"+channels);
    }
}
