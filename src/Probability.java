public class Probability {
    double value;
    public Probability(double value) {
        this.value=value;
    }

    public boolean compare(Probability otherProbability){
        if(otherProbability.getValue()==this.getValue()){
            return true;
        }
        return false;
    }
    public double getValue(){
        return this.value;
    }
}
