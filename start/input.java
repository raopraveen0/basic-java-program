package start;
import java.util.Scanner;

class input {

    long sum(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        long a = sc.nextLong();
        System.out.println("Enter your second number: ");
        long b = sc.nextLong();
        long c = a+b;
        System.out.println("your sum is = "+c);
        return 0;
    }
    
    public static void main(String[] args) {
        input object = new input();
        object.sum();

    }
}