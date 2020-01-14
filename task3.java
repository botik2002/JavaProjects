package kz.aitu.week1;



public class task3 {
    public static void main(String[] args){
        findTwoMaxes(0,0);
    }

    public static void findTwoMaxes(int max1, int max2){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        if(n != 0){
            if(max1 < n){
                findTwoMaxes(n, max1);
            }else if(max2 < n){
                findTwoMaxes(max1, n);
            }else findTwoMaxes(max1, max2);
        }else{
            System.out.println(max2);
        }
    }
}