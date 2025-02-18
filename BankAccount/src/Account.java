public class Account {
   private int numAccount;
   private String agencyCode;
   private String clientName;
   private double amount;

   public Account(int accountNumber, String agencyCode, String clientName, double amount) {
      this.numAccount = accountNumber;
      this.agencyCode = agencyCode;
      this.clientName = clientName;
      this.amount = amount;
   }

   public String toString() {
      return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", clientName, agencyCode, numAccount, amount);
   }
}
