import java.util.Scanner;
public class user {
    Scanner s = new Scanner(System.in);
    private String name;

    private  int phonenumber;
    private int accountnumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void withdrawal() throws TransactionExceptions {
        System.out.println("You can withdraw here...");
        System.out.println("Enter your amount : ");
        int amount = s.nextInt() ;
        if(amount > 50000){
            throw new TransactionExceptions("Insufficient balance");
        }else {
            System.out.println("You can collect your cash");
        }
    }

    public void deposit(){
        System.out.println("You can deposit here.");
    }
}
