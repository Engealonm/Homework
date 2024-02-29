import java.util.List;
import java.util.ArrayList;

public class Youtube_channels implements Observable{
    List<String>channels = new ArrayList<>();
    List<Observer>subcribers = new ArrayList<>();
    public void addchannel(String channel){
        this.channels.add(channel);
        notifyObservers();
    }
    public void removechannel(String channel){
        this.channels.remove(channel);
        notifyObservers();
    }
    public void register(Observer observer){
        this.subcribers.add(observer);

    }
    public void remove(Observer observer){
        this.subcribers.remove(observer);

    }
    public void notifyObservers(){
        for(Observer observer : subcribers){
            observer.updates(this.channels);
        }

    }

}
