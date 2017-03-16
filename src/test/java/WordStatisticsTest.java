import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by tjdai on 2017/3/16.
 */
public class WordStatisticsTest {

    @Test
    public void Test() {
        String testStr1 = " ";
        String testStr2 = "the";
        String testStr3 = "the day";
        String testStr4 = "the day \n is";
        String testStr5 = "the day day";

        WordStatistics wordStatistics = new WordStatistics();

        assertThat(wordStatistics.compute(testStr1)).isEqualTo("");
    }
}
