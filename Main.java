package kz.aitu.week1;



public class task1   {

    public static void main(String[] args) throws  {
        int N;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        fun1(N);
    }

    static int n = 1;

    static void fun1(int N) {
        if (n <= N) {
            System.out.println(n);
            n++;
            fun2(N);
        } else {
            return;
        }
    }

    static void fun2(int N) {
        if (n <= N) {
            System.out.println(n);
            n++;
            fun1(N);
        } else {
            return;
        }
    }
}

