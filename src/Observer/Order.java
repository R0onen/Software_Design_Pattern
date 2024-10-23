package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements  Subject{
    private List<Observer> observers;
    private  String status;
    public Order() {
        observers = new ArrayList<Observer>();
    }
    public void SetStatus(String status) {
        this.status = status;
        notifyObservers();
    }
    public String getStatus(){
        return status;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
