package Interface;

public interface Telephone {
    void poweron(); 
    void dialnum(int phonenumber);
    void answer();
    boolean callphone(int phonenumber);
    boolean isRinging();

}
