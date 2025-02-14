package problems.banktransactionsystem;
class InsufficientBalanceException  extends Exception{
    InsufficientBalanceException(String s){
        super(s);
    }
}
class BankTransactionSystem {
    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    void withdraw(double ammount) throws InsufficientBalanceException {
        if (ammount>getBalance()){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        if (ammount<0){

            throw new IllegalArgumentException("Invalid amount!");
        }
        setBalance(getBalance()-ammount);

        System.out.println("Withdrawal successful, new balance: "+ this.getBalance());
    }
    public static void main(String[] args) {
        BankTransactionSystem bkc = new BankTransactionSystem();
        try {
            bkc.setBalance(150.6);
            bkc.withdraw(-190.3);
        } catch (InsufficientBalanceException e) {
            System.out.println("withdrawal amount exceeds balance.");
        } catch (IllegalArgumentException e){
            System.out.println("the amount is negative.");
        }
    }
}
