package DTU.SWT_grp16.Model;

public class Player {
    private String name;
    private Account account;
    private boolean winner;

    public Player(String name){

    }

    public String getName() {
        return name;
    }

    public int getBalance(){
        return account.getBalance();
    }

    public void addToBalance(int amount){
        account.changeBalance(amount);
    }
}
