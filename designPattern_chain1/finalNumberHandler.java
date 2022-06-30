package designPattern_chain1;

import designPattern_chain1.Chain;
import designPattern_chain1.Numbers;

public class finalNumberHandler implements Chain{

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        System.out.println("Final handler called");
        System.out.println("   > Only works for add, sub, mul, and div!");
        System.out.println("   > This is the end of line");
    }
}
