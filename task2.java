package kz.aitu.week1;

public class task2 {
    public static void main(String[] args){
        System.out.println(findmax());
    }

    public static int findmax(){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        if(n==0) return 0;

        int m = findmax();
        if(m >= n) return m;
        return n;
    }
}
