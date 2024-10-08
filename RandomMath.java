import java.util.Random;
import java.util.Scanner;

public class RandomMath {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("1, Powers of a Number\n" +
                "2, Random Positive Integer with Maximum\n" +
                "3, Area of Random Circle\n" +
                "4, Area of Random Square\n" +
                "What would you like to do?");

        while(!scan.hasNextInt()) {
            System.out.println("Invalid user input, type a number 1-4.");
            scan.next();
        }
        int userInput = scan.nextInt();


        switch(userInput)
        {
            case 1: //1, Powers of a Number
                System.out.println("What number would you like to calculate powers of? ");
                userInput = scan.nextInt();
                int exponent = 0;
                int powerNum = (int) Math.pow(userInput, exponent);
                do{
                    if(userInput == -1)
                    {
                        System.out.println("-1 raised to 0 is 1\n" +
                                "-1 raised to odd powers greater than 0 is -1\n" +
                                "-1 raised to even powers greater than 0 is 1");
                        break;
                    }
                    else if(userInput == 0)
                    {
                        System.out.println("0 raised to the 0 is 1\n" + "0 raised to powers greater than 0 is 0");
                        break;
                    }
                    else if(userInput == 1)
                    {
                        System.out.println("1 raised to ANY power is still 1");
                        break;
                    }
                    else
                    {
                        System.out.println( userInput + " raised to the " + exponent + " is " + powerNum +".");
                        ++exponent;
                        powerNum = (int) Math.pow(userInput, exponent);
                    }
                } while(Math.abs(powerNum) < 100);
                break;

            case 2: //2, Random Positive Integer with Maximum
                System.out.println("What is the max value you want your random number to be? ");
                userInput = scan.nextInt();
                if(userInput < 0)
                {
                    System.out.println("User input must be positive and non-zero.");
                }
                else
                {
                    int randomNumber = rand.nextInt(userInput) + 1; // [0, userInput) -> [1, userInput]
                    System.out.println("Your random number is " + randomNumber + ".");
                }
                break;

            case 3: //3, Area of Random Circle
                int circleRadius = rand.nextInt(101); // [0, 101)
                double circleArea = Math.PI * Math.pow(circleRadius, 2);
                System.out.printf("A circle of radius %d has an area of %.2f.\n", circleRadius, circleArea);
                break;

            case 4:
                int sideLength = (int)(Math.random() * 101); // [0, 101) -> [0, 100]
                int squareArea = (int) Math.pow(sideLength,2);
                System.out.printf("A square of side length %d has an area of %d.\n", sideLength, squareArea);
                break;
        }
    }
}
