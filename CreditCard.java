package Project;

abstract class CreditCard {
    protected Payment payment;

    public CreditCard(Payment payment) {
        this.payment = payment;
    }

    abstract void makePayment(double amount);
}

//RefinedAbstraction: Tipuri specifice de carduri

class StudentCreditCard extends CreditCard {
    public StudentCreditCard(Payment payment) {
        super(payment);  //Invoca constructorul clasei de baza si initializeaza "payment".
        //this.payment=payment;
    }

    @Override
    void makePayment(double amount) {
        System.out.print("Student Credit Card: ");
        payment.processPayment("Student Credit Card", amount);
    }
}

class BasicCreditCard extends CreditCard {
    public BasicCreditCard(Payment payment) {
        super(payment);
    }

    @Override
    void makePayment(double amount) {
        System.out.print("Basic Credit Card: ");
        payment.processPayment("Basic Credit Card", amount);
    }
}


//Existendere a clasei abstracte

/*class CorporateCreditCard extends CreditCard {
    public CorporateCreditCard(Payment payment) {
        super(payment);
    }

    @Override
    void makePayment(double amount) {
        System.out.print("Corporate Credit Card: ");
        payment.processPayment("Corporate Credit Card", amount);
    }
}*/

