package designPattern_chain1;

public interface Chain {

    public void setNext(Chain nextChain);
    public void calculate(Numbers request);

}
