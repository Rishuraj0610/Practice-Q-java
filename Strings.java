//import java.util,*;
/*public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TARA");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'k');
        sb.delete(0,1);
        //sb.insert(4,'S');
        System.out.println(sb);
    }
}*/
public class Strings{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for(int i = 0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        
        }
        System.out.println(sb);
    }
}
