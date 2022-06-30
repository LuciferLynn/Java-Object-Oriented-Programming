package designPattern_chain1;

public class Numbers {

    private int number1;
    private int number2;
    private String calculationWanted;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getCalculationWanted() {
        return calculationWanted;
    }

    public void setCalculationWanted(String calculationWanted) {
        this.calculationWanted = calculationWanted;
    }

    public Numbers(int number1, int number2, String calculationWanted) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculationWanted = calculationWanted;
    }

}
