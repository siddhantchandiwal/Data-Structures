package ds.reverseString;

public class App {

    public static void main(String[] args){
        ReverseString rs = new ReverseString(10);
        System.out.println(reverseString("Siddhant"));
    }

    public static String reverseString(String str){
        int stackSize = str.length();
        ReverseString rs = new ReverseString(stackSize);

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            rs.push(ch);
        }

        String result = "";
        while(!rs.isEmpty()){
            char ch = rs.pop();
            result = result+ch;
        }
        return result;
    }
}
