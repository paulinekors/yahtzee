package yahtzeetest;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import yahtzee.Yahtzee;
import yahtzee.YahtzeeScore;

public class MijnTest {

    Yahtzee yahtzee;

    @BeforeEach
    public void setup(){
        yahtzee = new Yahtzee();
    }

    @Test
    public void tweedeTest(){
        MatcherAssert.assertThat(yahtzee.score(1,2,3,4,5,1), CoreMatchers.is(1));
        MatcherAssert.assertThat(yahtzee.score(1,1,3,4,5, 1), CoreMatchers.is(2));
        MatcherAssert.assertThat(yahtzee.score(1,1,1,4,5, 1), CoreMatchers.is(3));
        MatcherAssert.assertThat(yahtzee.score(1,1,1,1,5, 1), CoreMatchers.is(4));
        MatcherAssert.assertThat(yahtzee.score(1,2,3,4,1, 1), CoreMatchers.is(2));
        MatcherAssert.assertThat(yahtzee.score(1,2,1,4,1, 1), CoreMatchers.is(3));
        MatcherAssert.assertThat(yahtzee.score(2,2,1,4,1, 1), CoreMatchers.is(2));
        MatcherAssert.assertThat(yahtzee.score(3,2,1,4,1, 1), CoreMatchers.is(0));
        MatcherAssert.assertThat(yahtzee.score(0,2,1,4,1, 1), CoreMatchers.is(9));
        MatcherAssert.assertThat(yahtzee.score(0,2,2,2,2, 2), CoreMatchers.is(50));
        MatcherAssert.assertThat(yahtzee.score(0,1,1,1,1, 1), CoreMatchers.is(50));
        MatcherAssert.assertThat(yahtzee.score(1,1,1,1,1, 1), CoreMatchers.is(5));
    }
}
