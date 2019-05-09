public class Probability {
    double value;
    public Probability(double value) {
        this.value=value;
    }

    public static boolean compare(Probability eventA, Probability eventB){
        if(eventA.getValue()==eventB.getValue()){
            return true;
        }
        return false;
    }
    public double getValue(){
        return this.value;
    }
}
