import java.util.*;
import java.io.*;

class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] level = new int[31];
        for (int i=0;i<n;i++){
            level[Integer.parseInt(br.readLine())]++;
        }

        int del = (int)Math.round( n * 0.15);

        int sub = del;
        int index = 0;
        while(sub != 0){
            if( level[index] < sub ){
                sub -= level[index];
                level[index++]=0;
                continue;
            } 
            level[index++] -= sub;
            sub = 0;
        }

        index = 30;
        sub = del;
        while (sub != 0){
            if( level[index] < sub ){
                sub -= level[index];
                level[index--]=0;
                continue;
            } 
            level[index--] -= sub;
            sub = 0;
            if (index==-1) break;        
        }

        int sum = 0;
        for (int i=0; i<=30; i++){
            sum+= level[i]*i;
        }

        System.out.println(Math.round((float)sum/(n-del*2)));
    }
}
