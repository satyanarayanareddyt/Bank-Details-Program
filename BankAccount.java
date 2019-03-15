package bankaccount;
class Account {
    public String account_holdername;
    public long account_no;
    protected long balance;
    Account()
    {
        balance=0;
    }
    Account(String name,long num) 
    {
        this.account_holdername=name;
        this.account_no=num;
    }
    void deposit(int amount)
    {
        balance+=amount;
    }
    void display()
    {
        System.out.println("Account Holder Name :"+account_holdername);
        System.out.println("Account Number      :"+account_no);
        System.out.println("Balance amount      :"+balance);
    }
}
class savingsAccount extends Account{

    public savingsAccount(String name, long num) {
        super(name, num);
    }
    void withdraw(int amount)
    {
        if(balance<=5000)
        {
            System.out.println("Your Bank Balance is low.");
        }
        else
        {
            balance-=amount;
            System.out.println("With draw Amount :"+amount);
        }
    }
    
}
class currentAccount extends Account{
    long draft=0;
    public currentAccount(String name, long num) {
        super(name, num);
    }
    void withdraw(int amount)
    {
        if(balance<amount)
        {
            draft+=amount-balance;
            balance=0;
            System.out.println("Your are in Debt of "+draft);
        }
    }
    }

public class BankAccount {
    public static void main(String[] args) {
        savingsAccount sa=new savingsAccount("satya",123456789);
        currentAccount ca=new currentAccount("satya",123456789);
//        sa.deposit(5000);
//        sa.deposit(50000);
          ca.withdraw(50000);
          ca.withdraw(50000);
          ca.display();
    }
    
}
