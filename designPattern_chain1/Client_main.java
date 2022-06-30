package designPattern_chain1;

public class Client_main {

    public static void main(String[] args) {

        Chain handlerA = new AddNumbers();
        Chain handlerB = new SubtractNumbers();
        Chain handlerC = new MultiplyNumbers();
        Chain handlerD = new DivideNumbers();
        Chain handlerE = new finalNumberHandler();

        Numbers request = new Numbers(6,12,"add");

        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);
        handlerC.setNext(handlerD);
        handlerD.setNext(handlerE);

        handlerA.calculate(request);

    }

}
