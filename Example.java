public class Example {
    private int[] data;
    public Example(int[] values) {
        data = values;
    }
    public static void main (String[] args) {
        Example ex1 = new Example(new int[]{1,2,3});
        Example ex2 = new Example(ex1.data);
        ex1.data[0] = 9;
        ex2.data[1] = 6;
        for(int a : ex1.data)
        {
            System.out.print(a);
        }
        System.out.println();

        for(int a : ex2.data)
        {
            System.out.print(a);
        }
        System.out.println();

    }
}