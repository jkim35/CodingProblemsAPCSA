import java.util.Scanner;
public class stone {
    public static void main (String[]args){
        Scanner finder = new Scanner(System.in);
        System.out.print("Give me an integer: ");
        int number = finder.nextInt();
        while(number != 1){
            number = stone.hailstone(number);
            System.out.print(number + " ");
        }
        
    }
    public static int hailstone(int number){
        if (number%2 == 0){
            number /= 2;
        }else{
            number = (number*3)+1;
        }
        return number;
    }
}
