package practise;

public class Bank {
    int savedMoney;
    int year;
    double interest;
    double interestRate = 0.29;
    public double computerInterst(){
        interest=year*interestRate*savedMoney;
        return interest;
    }
    public void setInterestRate(double rate){
        interestRate = rate;
    }


}



class CommercialBank extends Bank {
    double year;
    public double computerInterest(){
        super.year=(int)year;
        double r = year-(int)year;
        int day=(int)(r*1000);
        double yearInterest = super.computerInterst();
        double dayInterest = day*0.00012*savedMoney;
        interest = yearInterest+dayInterest;
        System.out.printf("%d元存在商业银行%d年零%d天的利息:%f元\n",savedMoney,super.year,day,interest);

        return interest;
    }

}








class SavedMoney{
    public static void main (String args[]){
        int amount=8000;
        CommercialBank bank= new CommercialBank();
        bank.savedMoney = amount;
        bank.year =8.236;
        bank.setInterestRate(0.035);
        double interest = bank.computerInterest();




    }
}
