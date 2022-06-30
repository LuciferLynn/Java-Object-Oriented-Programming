package designPattern_chain2;

public interface Chain {

    void setNext(Chain nextChain);
    void dispense(Currency req_Amount);

}
