package com.example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProbabilityTest {

    @Test
    public void compare_whenProbabilityOfAandBIsSame_shouldReturnProbabiltyIsSame() {
        Probability probability = new Probability(0.8);
        Probability anotherProbability = new Probability(0.8);
        assertEquals(0, probability.compare(anotherProbability));
    }

    @Test
    public void compare_whenProbabilityOfAIsHigherThanB_ShouldReturnAIsHigherProbability(){
        Probability probability = new Probability(0.8);
        Probability anotherProbability = new Probability(0.3);
        assertEquals(1, probability.compare(anotherProbability));
    }

    @Test
    public void compare_whenProbabilityOfAIsHigherThanB_ShouldReturnAIsLowerProbability(){
        Probability probability = new Probability(0.3);
        Probability anotherProbability = new Probability(0.8);
        assertEquals(-1, probability.compare(anotherProbability));
    }
}
