/**
 * Created by mangguo on 2016/4/25.
 */
public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void nodify(String str);
}
