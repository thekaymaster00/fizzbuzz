package Main;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int fizz, buzz;


        do {
            System.out.print("Enter a Fizz number between 1-100: ");
            fizz = keyboard.nextInt();
            if (fizz < 1 || fizz > 100)
            {
                System.out.println("Invalid! (Out of range)");
            }

        } while (fizz < 1 || fizz > 100);

        do {
            System.out.print("Enter a buzz number between 1-100: ");
            buzz = keyboard.nextInt();
            if (buzz < 1 || buzz > 100)
            {
                System.out.println("Invalid! (Out of range)");
            }

        } while (buzz < 1 || buzz > 100 || buzz == fizz);


        for (int i = 1; i < 101; i++)
        {
            if (i % buzz == 0 && i % fizz == 0)
            {
                System.out.println("FizzBuzz");
                continue;
            }
            else if (i % fizz == 0)
            {
                System.out.println("Fizz");
                continue;
            }
            else if (i % buzz == 0)
            {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
            }

        }

    }