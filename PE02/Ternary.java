public class Ternary {

    public static void main(String[] args)
    {
        int initialNum = 100;
        String answer = "";
        int zeroCount = 0, oneCount = 0, twoCount = 0;
        int currentNum = initialNum;
        while(currentNum != 0)
        {
            int digit = currentNum % 3;
            if(digit == 0)
            {
                ++zeroCount;
            }
            else if(digit == 1)
            {
                ++oneCount;
            }
            else
            {
                ++twoCount;
            }
            answer = digit + answer;
            currentNum /= 3;
        }

        System.out.println("Decimal representation: "+ initialNum);
        System.out.println("Ternary representation: "+ answer);
        System.out.println(zeroCount + " zeros, " + oneCount + " ones, and " + twoCount + " twos");
        int digitSum = zeroCount * 0 + oneCount * 1 + twoCount * 2;

        switch(digitSum % 5)
        {
            case 0:
                System.out.println("The ternary digits sum to a multiple of 5!");
                break;
            case 1:
                System.out.println("The ternary digits almost summed to a multiple of 5!");
                break;
            case 4:
                System.out.println("So close!");
                break;
            default:
                System.out.println("Nope!");
        }

        System.out.printf( (zeroCount > oneCount) && (zeroCount > twoCount) ? "Zero is the most used digit." :
                "Zero is not the most used digit.");
    }
}
