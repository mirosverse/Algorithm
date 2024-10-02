import java.util.*;
import java.io.*;

class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Queue<Document> queue = new LinkedList<>();

            int[] priority = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i<n; i++){
                queue.offer(new Document(i, priority[i]));
            }

            Arrays.sort(priority);

            int count = 0;
            while(true){
                Document cur = queue.poll();
                if (cur.priority == priority[n-count-1]) {
                    count++;
                    if (cur.location == m) break;
                    continue;
                }
                queue.offer(cur);
            }
            System.out.println(count);
        }
    }
}

class Document {
    int location;
    int priority;

    public Document(int location, int priority){
        this.location = location;
        this.priority = priority;
    }
}