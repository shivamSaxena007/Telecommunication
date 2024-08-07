package Interface;

public class landline implements Telephone{ // implements is used to add the interface
    private int mynumber;
    private boolean isRinging;

    public landline(int mynumber){  // constructor so that mynumber can be accessible within this class only 
       this.mynumber=mynumber;
    }  

       @Override  
       public void poweron(){   // defining the body of the  methods of interface class
         System.out.println("landline is on");
       }
       @Override
       public void dialnum(int phonenumber){
        System.out.println("now rining"+phonenumber+"on mobilephone");
       }

       @Override
       public void answer(){
        if(isRinging){
           System.out.println("answering the landline");
           isRinging=false;
        }else{
            System.out.println("phone is not ringing");
        }
       }

       @Override
       public boolean callphone(int phonenumber){
        if(phonenumber==mynumber){
            isRinging=true;
            System.out.println("phone is ringing");
        }else{
            isRinging=false;
        }
        return isRinging;
       }
       @Override
       public boolean isRinging(){
         return isRinging;
       }
    }

