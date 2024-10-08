public class TipHelper {
    /* Hi, my name is Yanda Chen, and you can call me Danny!
    *  I wish people know that I like sleeping
    * */

    public static void main(String[] args)
    {
        double tipPercentage = 0.15;
        double mealTotal = 20.179;
        int numberItemsOrdered = 3;
        String customerName = "Jacob";
        double totalTip = tipPercentage * mealTotal;
        double tipTrunc = (int)(totalTip * 100) / 100.0;
        double totalAmountPaid = tipTrunc + mealTotal;
        double totalTrunc = (int)(totalAmountPaid * 100) / 100.0;
        System.out.println("The total tip was $" + tipTrunc);
        System.out.println(customerName + " owes a total of $" + totalTrunc);
    }
}
