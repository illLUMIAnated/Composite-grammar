import java.util.*;
import java.lang.*;
import java.io.*;
class Test {
        public static void main(String[] args) 

        {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the number you want to check:");
            int n = sc.nextInt();
            if(n > 0)
            {
              System.out.println("The given number "+n+" is Positive");

            }
            else if(n < 0)
            {

                System.out.println("The given number "+n+" is Negative");

            }

            else

            {

                System.out.println("The given number "+n+" is neither Positive nor Negative ");

            }

        }
}