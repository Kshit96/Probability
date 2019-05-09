import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProbabilityTest {
    @Test
    public void compare_whenProbabilityOfAandBIsSame_shouldReturnTrue(){
        Probability probabilityA = new Probability(0.8);
        Probability probabilityB = new Probability(0.8);
        assertEquals(true,Probability.compare(probabilityA,probabilityB));
    }
}
