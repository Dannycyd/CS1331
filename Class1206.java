public class Class1206 {
    public static void main(String[] args)
    {
        String myString = "33333";
        myString.replace("3", "e");
        System.out.println(myString);

        String fruit1 = "Pear";
        String fruit2 = "Pear";
        String fruit3 = new String("Pear");
        System.out.println(fruit1 == fruit2);
        System.out.println(fruit2 == fruit3);
        System.out.println(fruit2.equals(fruit3));
    }
}
