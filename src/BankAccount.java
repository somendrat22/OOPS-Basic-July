public class BankAccount {
    private String accName = "H1";
    private int accBalance = 0;

    public String getAccName(){
        return accName;
    }
    public void setAccBalance(int value){
        accBalance += value;
    }
}
