public class Test {
    public static void main(String[] args)
    {
        System.out.println("Hello, World");
        System.out.println(8 * 4 + 2 / 2);
        System.out.println((8 + 4) * 2 / 3);
        System.out.println(8 + 4 * 2 / 3);
        System.out.println(10 * 5 % 2);
        //---------------
        int res1, res2;
        int num = 5;
        res1 = num++; // first assign, then ++
        System.out.println(res1);
        System.out.println(num);
        num = 5;
        res2 = ++num; // first run ++, then assign
        System.out.println(res2);

        int x = 10;
        System.out.println();
        System.out.println(x + --x + x++);
        System.out.println(x);

        System.out.println();
        System.out.println(x + --x + --x + --x);
        System.out.println(x);

        int revenue = 300;

        if (revenue > 50) {
            if (revenue < 100)
                System.out.println("Revenue is greater than 50");
            System.out.println("If block!");
        }
        else if (revenue > 100) {
            System.out.println("Revenue is greater 100");
            System.out.println("Else-if block!");
        }
        else {
            System.out.println("We have revenue!");
            System.out.println("Else block!");
        }


    }
}
