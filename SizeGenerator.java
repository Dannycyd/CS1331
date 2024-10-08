import java.util.Random;

public class SizeGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        TShirtSizes[] sizes = TShirtSizes.values();
        TShirtSizes randomSize = sizes[random.nextInt(sizes.length)];

        System.out.println("Random T-shirt size: " + randomSize);

    }
}
