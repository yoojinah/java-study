package ch08.abstractClass;

public class Main {
    public static void main(String[] args) {
        Account savings = new SavingAccount("1002-22-2125", 1000,0.01);
        Account checking = new CheckAccount("1002-22-2105",100);

        checking.deposit(500);
        checking.withdraw(200);
        checking.endMonth();

        savings.deposit(1000);
        savings.withdraw(500);
        savings.endMonth();

     }
}
