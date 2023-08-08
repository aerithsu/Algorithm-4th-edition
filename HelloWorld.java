import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// ctrl shift f9 ctrl shift f10
public class HelloWorld {
    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        double d = 3.14159;
        StdOut.printf("%.3f",d);
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty()){
            sum+=StdIn.readDouble();
            cnt++;
        }
        double avg = sum/cnt;
        StdOut.printf("Average is %.5f",avg);
    }
    public static void test2(){
        String s;
        while (!(s = StdIn.readLine()).isEmpty()){
            StdOut.println(s);
        }
    }
}
