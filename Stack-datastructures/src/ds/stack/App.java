package ds.stack;

public class App {

    public static void main(String [] args){
        Stack s = new Stack(10);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);
        s.push(100);
        s.push(100);
        s.push(100);



        while(!s.isEmpty()){
            Long  value = s.pop();
            System.out.println("Stack popping now " +value);
        }
    }
}
