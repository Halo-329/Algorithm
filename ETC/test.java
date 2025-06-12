import java.util.*;
import java.io.*;
import java.lang.*;

public class test {

//    static double GetDistance(P4386.Node a, P4386.Node b) {
//        return Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
//    }


    static double getDistance(P1774.Node v1, P1774.Node v2) {
        int x = v1.x - v2.x;
        int y = v1.y - v2.y;

        double pow_x = Math.pow(x, 2);
        double pow_y = Math.pow(y, 2);

        return Math.sqrt(pow_x + pow_y);
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        P4386.Node n1 = new P4386.Node(a, b);
        P4386.Node n2 = new P4386.Node(c, d);

        System.out.println(P4386.GetDistance(n1, n2));
    }
}
