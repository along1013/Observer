/**
 * Created by mangguo on 2016/4/25.
 */
public class ConcreateObserver implements Observer {
    public void update(String str) {
        System.out.printf(str);
    }
}
