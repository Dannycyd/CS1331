public class Commands {
    public static void main(String[] args)
    {
        for (String s: args)
        {
            System.out.println(s);
        }

        String a = "bumble";
        String b = "bees";
        b.toUpperCase();
        a = b;
        b = a + b.charAt(2);
        System.out.println(b);
    }
}
