package ds.queue;

public class App {
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.insert(20);
        q.insert(40);
        q.insert(60);
        q.insert(80);
        q.insert(100);
        q.insert(120);
        q.insert(130);
        q.insert(140);
        q.insert(150);

        q.show();
    }
}
