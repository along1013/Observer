import java.util.ArrayList;
import java.util.List;

/**
 * Created by mangguo on 2016/4/25.
 */
public class ConcreteSubject implements Subject {

    private final List<Observer> observers = new ArrayList<Observer>();
    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void nodify(String str) {
        for(Observer observer:observers){
            observer.update(str);
        }
    }
}
