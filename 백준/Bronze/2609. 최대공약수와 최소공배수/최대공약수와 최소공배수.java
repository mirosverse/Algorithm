import java.util.*;

class Main {
	static public void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getGcd(a,b));
        System.out.println(getLcm(a,b));
    }


    public static int getGcd(int a, int b){
        if (b==0){
            return a;
        }

        return getGcd(b, a % b);
    }

    public static int getLcm(int a, int b){
        return a * b / getGcd(a, b);
    }
}
