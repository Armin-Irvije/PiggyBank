import java.util.Scanner;

public class IPCpiggyBank {
    double balance;
    double withdrawMoney;
    Scanner value = new Scanner(System.in);

    public IPCpiggyBank(double startingBalance) {
        balance = startingBalance;

    }

    public void halfKrone() {
        System.out.print("Number of halfkrone: ");
        int num = value.nextInt();
        double total = (.5 * num) + balance;
        balance = total;
    }

    public void oneKrone() {
        System.out.print("Number of oneKrone: ");
        int num = value.nextInt();
        double total = num + balance;
        balance = total;
    }

    public void twoKrone() {
        System.out.print("Number of twoKrone: ");
        int num = value.nextInt();
        double total = (2 * num) + balance;
        balance = total;
    }

    public void fiveKrone() {
        System.out.print("Number of fiveKrone: ");
        int num = value.nextInt();
        double total = (5 * num) + balance;
        balance = total;
    }

    public void tenKrone() {
        System.out.print("Number of tenKrone: ");
        int num = value.nextInt();
        double total = (10 * num) + balance;
        balance = total;
    }

    public void twentyKrone() {
        System.out.print("Number of twentyKrone: ");
        int num = value.nextInt();
        double total = (20 * num) + balance;
        balance = total;
    }

    public void setAmount() {
        System.out.print("how much to deposit: ");
        double num = value.nextDouble();
        double total = num + balance;
        balance = total;
    }

    public void getBalance() {
        System.out.println("Your Balance: " + balance);
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double MoneyToWithdraw = value.nextDouble();
        withdrawMoney = MoneyToWithdraw;
        double total = balance - withdrawMoney;
        System.out.print("Your balance: " + total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IPCpiggyBank studentCouncil = new IPCpiggyBank(3670.55);

        System.out.print("Do want to deposit(anything) or withdraw(w) money? ");
        String question = input.nextLine();
        if (question.equals("w")) {
            studentCouncil.withdraw();
        } else {
            System.out.print("Do have coins to depost(y/n) ");
            String question2 = input.nextLine();
            if (question2.equals("y")) {
                studentCouncil.halfKrone();
                studentCouncil.oneKrone();
                studentCouncil.twoKrone();
                studentCouncil.fiveKrone();
                studentCouncil.tenKrone();
                studentCouncil.twentyKrone();
                studentCouncil.getBalance();
            } else {
                studentCouncil.setAmount();
                studentCouncil.getBalance();
            }
        }

    }
}