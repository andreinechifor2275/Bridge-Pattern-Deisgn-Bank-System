package Project;

interface Payment {
    void processPayment(String cardType, double amount);
}
//Interfata functioneaza ca un contact pur

//ConcreteImplementor: Implementări specifice ale canalelor de plată

class POSPayment implements Payment {
    @Override
    public void processPayment(String cardType, double amount) {
        System.out.println("Plata efectuata in valoarea de " + amount + "€ folosindu-se " + cardType + " prin POS.");
    }
}

class OnlinePayment implements Payment {
    @Override
    public void processPayment(String cardType, double amount) {
        System.out.println("Plata efectuata in valoarea de " + amount + "€ folosindu-se " + cardType + " prin intermediul online.");
    }
}


//Existendere a interfatei de implementare

/*class MobilePayment implements Payment {
    @Override
    public void processPayment(String cardType, double amount) {
        System.out.println("Plata efectuata in valoarea de " + amount + "€ folosindu-se " + cardType + " prin Mobile Payment."");
    }
}*/




//Interfetele sunt implementate de clase concrete care sunt obligate sa implementeze metodele declarate din interoriul interfetei
//Mai multe clase pot implementa o interfata, dar doar o singura clasa poate extinde o clasa abstracta deoarece Java nu permite mostenirea multipla.