/**
 * Created by mangguo on 2016/4/25.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreateObserver();
        Observer observer1 = new TwoObserver();
        subject.add(observer);
        subject.add(observer1);
        subject.remove(observer);
        subject.nodify("message");
    }
}
