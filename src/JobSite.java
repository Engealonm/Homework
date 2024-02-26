import java.util.List;
import java.util.ArrayList;

public class JobSite implements Observable{
    List<String>vacancies = new ArrayList<>();
    List<Observer>subcribers = new ArrayList<>();
    public void addvacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }
    public void removevacancy(String vacancy){
        this.vacancies.remove(vacancy);
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
            observer.updates(this.vacancies);
        }

    }

}
