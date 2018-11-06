package DTU.SWT_grp16.Model;

public class Account {
    private int balance;
    private int initialAmount = 1000;
    public Account(){
        this.balance = initialAmount;

    }

    public int getBalance(){
        return balance;
    }

    public void changeBalance(int amount){
        balance = balance + amount;
        if(amount<0){
            amount = 0;
        }
    }

}
