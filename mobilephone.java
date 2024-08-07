package Interface;

public class mobilephone implements Telephone {
    private int mynumber;
    private boolean isRinging;   // these three are the properties which mobile phone have 
    private boolean isPoweron;

    public mobilephone(int mynumber){  // constructor so that mynumber can be accessible within this class only 
    this.mynumber=mynumber;
    }

    @Override
    public void poweron(){
        isPoweron=true;
      System.out.println("mobile is on");
    }
    @Override
    public void dialnum(int phonenumber){
     System.out.println("now rining "+phonenumber+" on landline");
    }

    @Override
    public void answer(){
     if(isRinging && isPoweron){
        System.out.println("answering the mobilephone");
        isRinging=false;
     }else{
         
     }
    }

    @Override
    public boolean callphone(int phonenumber){
     if(phonenumber==mynumber && isPoweron){
         isRinging=true;
         System.out.println("phone is ringing");
     }else{
        System.out.println("wrong number");
         isRinging=false;
     }
     return isRinging;
    }
    @Override
    public boolean isRinging(){
      return isRinging;
    }
}
