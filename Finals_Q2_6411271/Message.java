package Q2_6411271;

public abstract class Message {

    private String message;
    private String mod_message;

    // I created a new String called mod_message so that the original message can be preserved
    // the mod_message will be changed and modified from encryption
    // while the original message remains original and unmodified
    // so that we can get access to it if we ever needed it for our code
    // I have added getters and setters for both modded and original message a well

    public Message(String m) {
        this.message = m;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMod_message() {
        return mod_message;
    }

    public void setMod_message(String mod_message) {
        this.mod_message = mod_message;
    }

    abstract void printGoodFormat();  // abstract methods public by default

}
