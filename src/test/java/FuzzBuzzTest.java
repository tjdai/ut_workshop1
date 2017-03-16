import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by tjdai on 2017/3/16.
 */
public class FuzzBuzzTest {

    @Test
    public void CalledTest() {
        FuzzBuzz FuzzBuzzObj1 = new FuzzBuzz();

        assertThat(FuzzBuzzObj1.BeenCalled(1)).isEqualTo("1");
        assertThat(FuzzBuzzObj1.BeenCalled(3)).isEqualTo("Fuzz");
        assertThat(FuzzBuzzObj1.BeenCalled(5)).isEqualTo("Buzz");
        assertThat(FuzzBuzzObj1.BeenCalled(15)).isEqualTo("FuzzBuzz");
        assertThat(FuzzBuzzObj1.BeenCalled(0)).isEqualTo("Invalid");
    }
}
