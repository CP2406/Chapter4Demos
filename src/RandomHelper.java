import java.util.Random;

public class RandomHelper {

    /**
     * Generate a random number in the range min to max inclusive.
     * The range must be valid.
     *
     * @param min the smallest possible value
     * @param max the largest possible value
     * @return a random value in the range [min,max]
     */
    public static int nextInt(int min, int max) {
        if (min >= max) {
            var message = String.format("the range [%d,%d] is invalid", min, max);
            throw new IllegalArgumentException(message);
        }
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }
}

