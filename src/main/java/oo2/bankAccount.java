package oo2;

public class bankAccount {

  private String owner;
  private double balance;

  public void withdraw(double amount) {
    if (amount < 0)
      System.out.println("Could not withdraw negative amount.");
    else if (amount > getBalance())
      System.out.println("Insufficient funds.");
    else
      balance = balance - amount;

  }

  public void deposit(double amount) {
    if (amount < 0)
      System.out.println("Could not deposit negative amount.");
    else
      balance = balance + amount;

  }

  bankAccount(String owner, double balance) {
    this.owner = owner;
    this.balance = Math.max(balance, 0);
  }

  public String getOwner() {
    return this.owner;
  }

  public double getBalance() {
    return this.balance;
  }

}
