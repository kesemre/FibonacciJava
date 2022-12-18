import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,tempNum=0,rangeNum;
        Scanner input = new Scanner(System.in);
        rangeNum = input.nextInt();
        for(int i = 1;i<=rangeNum;i++){
            System.out.print(n1+" ");
            tempNum = n1+n2;
            n1=n2;
            n2=tempNum;

        }

    }
}