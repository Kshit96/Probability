package com.example;

public class Probability {
    double value;

    public Probability(double value) {
        this.value = value;
    }

    public int compare(Probability otherProbability) {
        if (otherProbability.getValue() > this.getValue()) {
            return -1;
        }
        else if(otherProbability.getValue() < this.getValue()) {
            return 1;
        }
        return 0;
    }

    public double getValue() {
        return this.value;
    }

    public double and(Probability anotherProbability) {
        return this.getValue()*anotherProbability.getValue();
    }
}
