import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Get the number fom the user
        System.out.print("\nEnter a number to convert it into binary: ");
        int num = input.nextInt();

        // Call the function
        decimalToBinary(num);
    }

    public static void decimalToBinary(int num)
    {
        if (num == 0)
        {
            return;
        }

        else
        {
            decimalToBinary(num/2);
            System.out.print(num%2);
        }
    }
}
