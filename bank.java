class BankAcc {
    String AccNameHolder = "barath";
    int AccNo = 47885265;
    double AccBal = 0;
    public double intial(double n1) {
        AccBal = AccBal + n1;
        return AccBal;
    }
    public double getAccBal() {
        return AccBal;

    }
    public void depos(double n1) {
        AccBal = AccBal + n1;
    }
    public void withdraw(double n1) {
        AccBal = AccBal - n1;
    }
}
class CurrentAcc extends BankAcc {
    public CurrentAcc() {
        System.out.println(AccBal);
        System.out.println("Cheque facility is available.");
    }
}
class SavingsAcc extends BankAcc {
    public void compound() {
        double e = Math.pow((1 + (4.0 / 100)), 3.0);
        AccBal = AccBal * e;
        System.out.println("The present amount that includes compound intrest is : " + AccBal);
    }
}
class bank {
    public static void main(String[] args) {
        SavingsAcc C1 = new SavingsAcc();
        double r = C1.intial(2000);
        C1.compound();
    }
}