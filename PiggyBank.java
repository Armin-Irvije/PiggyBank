import java.util.Scanner;

public class PiggyBank {
   double balance;

   public PiggyBank(Double startingBlance) {
      balance = startingBlance;

   }

   public double pennies(int Ps) {
      double total = Ps * 0.01 + balance;
      balance = total;
      return total;
   }

   public double nickels(int Ns) {
      double total = Ns * 0.05 + balance;
      balance = total;
      return total;
   }

   public double quarters(int Qs) {
      double total = Qs * 0.25 + balance;
      balance = total;
      return total;

   }

   public double dimes(int Ds) {
      double total = Ds * 0.10 + balance;
      balance = total;
      return total;
   }

   public double getBalance(){
      return balance;
   }

   public static void main(String[] args) {
      
      PiggyBank armin = new PiggyBank(0);
      int numPennies;
      int numNickels;
      int numQuarters;
      int numDimes;
      char question;
      
      Scanner value = new Scanner(System.in);

      do {
          
         
         System.out.print("enter number of pennies: ");
         numPennies = value.nextInt();
         System.out.print("\n");

         System.out.print("enter number of nickels: ");
         numNickels = value.nextInt();
         System.out.print("\n");

         System.out.print("enter number of quarters: ");
         numQuarters = value.nextInt();
         System.out.print("\n");

         System.out.print("enter number of Dimes: ");
         numDimes = value.nextInt();
         System.out.print("\n");

         armin.pennies(numPennies);
         armin.nickels(numNickels);
         armin.quarters(numQuarters);
         armin.dimes(numDimes);

   
         System.out.println("Balance = " + "$" + armin.getBalance());
         

         System.out.print("want to add more? enter any char value to continue or press n: ");
      
         question = value.next().charAt(0);
    
      } while (question != 'n');

   }
}