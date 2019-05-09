import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProbabilityTest {
    @Test
    public void compare_whenProbabilityOfAandBIsSame_shouldReturnTrue(){
        Probability probability = new Probability(0.8);
        Probability anotherProbability = new Probability(0.8);
        assertEquals(true,probability.compare(anotherProbability));
    }
}
