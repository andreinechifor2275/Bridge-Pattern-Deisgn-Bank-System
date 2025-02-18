package Project;

public class Bank {
    public static void main(String[] args) {
        //Configurare pentru carduri și canale de plată
    	
        CreditCard studentCardPOS = new StudentCreditCard(new POSPayment());
        CreditCard basicCardOnline = new BasicCreditCard(new OnlinePayment());

        //Procesare plăți
        
        studentCardPOS.makePayment(230.10);
        basicCardOnline.makePayment(350.75); 
    }
}
