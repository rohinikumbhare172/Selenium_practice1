package JAVA_Practice_Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class HackerRank_loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++)
        {
            System.out.println(N+ " X " +i+ " = "+ (N*i));
        }
     
        bufferedReader.close();
    }
}
 

