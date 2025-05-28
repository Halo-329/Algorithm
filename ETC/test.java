import java.util.*;
import java.io.*;
import java.lang.*;

public class test {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        bw.write(st.nextToken());

        bw.flush();
        bw.close();

    }
}
