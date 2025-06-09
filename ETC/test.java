import java.util.*;
import java.io.*;
import java.lang.*;

public class test {

    class Edge implements Comparable<Edge> {
        int n;
        int m;
        int weight;

        Edge(int n, int m, int weight) {
            this.n = n;
            this.m = n;
            this.weight = n;
        }


        @Override
        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }

    public static void main(String args[]) throws IOException {
        String a = "";

        System.out.println(a.isEmpty());

    }
}
