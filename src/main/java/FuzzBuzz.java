/**
 * Created by tjdai on 2017/3/16.
 */
public class FuzzBuzz {
    public String BeenCalled(int number) {

        if (number <= 0) {
            return "Invalid";
        }

        if (0 == number % 3 && 0 == number % 5) {
            return "FuzzBuzz";
        }

        if (0 == number % 3) {
            return "Fuzz";
        }

        if (0 == number % 5) {
            return "Buzz";
        }

        return "" + number;
    }
}
