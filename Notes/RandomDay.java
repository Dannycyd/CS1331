public class RandomDay {
    public static void main(String[] args)
    {
        Day today = Day.MONDAY;
        System.out.println(today.name());
        System.out.println(today.ordinal());



        switch(today){
            case SATURDAY:
            case SUNDAY:
                System.out.println("It is Weekend!");
                break;
            default:
                System.out.println("It is Week Days!");
        }

        int[] myArray = new int[100];
        for(int i = 0; i < myArray.length; i++)
        {
            myArray[i] = (int) (1000 * Math.random()); // 0 - 999
        }

        int largest = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i = 0; i < myArray.length; i++)
        {
            if (myArray[i] > largest)
            {
                second_large = largest;
                largest = myArray[i];
            }
            else if(myArray[i] > second_large)
            {
                second_large = myArray[i];
            }
        }
        System.out.println(largest);
        System.out.println(second_large);

        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6}
        };
        int sum =0;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
        }

        for(int[] i : arr)
        {
            for(int j : i)
            {
                sum += j;
            }
        }
        System.out.println(sum);

        System.out.println(Colors.BLUE);
        Colors myColor = Colors.RED;
        System.out.println(myColor.name());

        String a, b, c, d, e;
        a = "Computer Science";
        b = new String("1331");
        c = a.replace('C', 'd');
        d = a.substring(0,3);
        e = a.substring(a.length()-7, a.length()-4);
        System.out.println(a + " - " + b);
        System.out.println(c + " - " + b);
        System.out.println(d + e + " - " + b);




    }
}
