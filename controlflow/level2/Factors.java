import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for (int i = 1; i < num + 1; i++){
            if(num % i == 0){
                System.out.println(i+ " is the factor of "+ num + " ");
            }
        }
    }
}