package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProbabilityTest {

    @Test
    public void compare_shouldReturnProbabiltyIsSame_whenProbabilityOfAandBIsSame() {
        Probability probability = new Probability(0.8);
        Probability anotherProbability = new Probability(0.8);
        assertEquals(0, probability.compare(anotherProbability));
    }

    @Test
    public void compare_ShouldReturnAIsHigherProbability_whenProbabilityOfAIsHigherThanB(){
        Probability probability = new Probability(0.8);
        Probability anotherProbability = new Probability(0.3);
        assertEquals(1, probability.compare(anotherProbability));
    }

    @Test
    public void compare_ShouldReturnAIsLowerProbability_whenProbabilityOfAIsHigherThanB(){
        Probability probability = new Probability(0.3);
        Probability anotherProbability = new Probability(0.8);
        assertEquals(-1, probability.compare(anotherProbability));
    }

    @Test
    public void and_ShouldReturnProductOfTheProbabilities_whenProbabilityOfAandBIsGiven(){
        Probability probability = new Probability(0.3);
        Probability anotherProbability = new Probability(0.8);
        assertEquals(0.24, probability.and(anotherProbability),0.00);
    }
}
