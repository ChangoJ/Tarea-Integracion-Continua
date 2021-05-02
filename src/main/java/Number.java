public class Number {

    private int numberOne;
    private int numberTwo;

    public Number(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getAdittion(){
        int addition;
        addition = numberOne + numberTwo;
        return addition;
    }

    public int getSubtraction(){
        int subtraction;
        subtraction = numberOne - numberTwo;
        return subtraction;
    }

    public int getMultiplication(){
        int multiplication;
        multiplication = numberOne * numberTwo;
        return multiplication;
    }
}
