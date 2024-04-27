
public class Main {
    public static void main(String[] args)  {
        user u = new user();
        u.deposit();
        u.setName("John");
        u.setPhonenumber(85456214);
        u.setAccountnumber(541236452);
        System.out.println("Name: "+u.getName());
        System.out.println("phone: "+ u.getPhonenumber());
        System.out.println("accountnumber: "+ u.getAccountnumber());
        Savings sa = new Savings();
        sa.setBalance(50000);
        System.out.println("Balance: "+sa.getBalance());
        try {
            u.withdrawal();
        }catch (TransactionExceptions e){
            System.out.println(e.getMessage());
        }
    }
}