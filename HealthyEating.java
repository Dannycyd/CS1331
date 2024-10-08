public class HealthyEating {
    public static void main(String[] args) {
        Food[] meal1 = mealPrep(20);
        Food[] meal2 = mealPrep(20);
        mealAnalyzer(meal1);
        mealAnalyzer(meal2);
        healthyChoice(meal1, meal2);

        // ---------------------- meal1 healthier ------------------------
        meal1 = followRecipe("VEGETABLE VEGETABLE VEGETABLE VEGETABLE VEGETABLE");
        meal2 = followRecipe("DAIRY GRAIN PROTEIN FRUIT VEGETABLE");
        healthyChoice(meal1, meal2);
        // ---------------------- meal2 healthier ------------------------
        meal1 = followRecipe("JUNK_FOOD JUNK_FOOD JUNK_FOOD JUNK_FOOD JUNK_FOOD");
        meal2 = followRecipe("DAIRY GRAIN PROTEIN FRUIT VEGETABLE");
        healthyChoice(meal1, meal2);
        // ---------------------- same score ------------------------
        meal1 = followRecipe("JUNK_FOOD DAIRY GRAIN PROTEIN FRUIT VEGETABLE");
        meal2 = followRecipe("JUNK_FOOD DAIRY GRAIN PROTEIN FRUIT VEGETABLE");
        healthyChoice(meal1, meal2);
    }

    public static Food[] mealPrep(int numFoods) {
        Food[] foodArray = new Food[numFoods];
        for (int i = 0; i < foodArray.length; i++) {
            foodArray[i] = Food.values()[(int) (Math.random() * Food.values().length)]; }
        return foodArray;
    }

    public static Food[] followRecipe(String recipe) {
        String[] recipeStrList = recipe.split(" ");
        Food[] recipeFoodList = new Food[recipeStrList.length];
        for (int i = 0; i < recipeStrList.length; i++) {
            recipeFoodList[i] = Food.valueOf(recipeStrList[i]);
        }
        return recipeFoodList;
    }

    public static void mealAnalyzer(Food[] foodArray) {
        int[] numCount = new int[Food.values().length];
        System.out.println("The following types of food are in your meal:");
        for (Food a : foodArray) {
            numCount[a.ordinal()]++; }
        for (Food a : Food.values()) {
            System.out.println(a.name() + " " + numCount[a.ordinal()]); }
    }

    public static void healthyChoice(Food[] meal1, Food[] meal2) {
        int sum1 = 0, sum2 = 0;
        for (Food a : meal1) {
            sum1 += a.ordinal(); }
        for (Food b: meal2) {
            sum2 += b.ordinal(); }

        if (sum1 > sum2) {
            System.out.printf("The first meal is the healthier choice with a score of %d.\n", sum1);
        } else if (sum2 > sum1) {
            System.out.printf("The second meal is the healthier choice with a score of %d.\n", sum2);
        } else {
            System.out.printf("The two meals are equally healthy with scores of %d.\n", sum1);
        }
    }
}
