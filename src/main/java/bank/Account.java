package bank;

import bank.exceptions.AmountException;

public class Account {

  private int id;
  private String type;
  private double balance;

  public Account(int id, String type, double balance) {
    setId(id);
    setType(type);
    setBalance(balance);
  }

  public void deposit(double amount) throws AmountException{
    if(amount < 1){
      throw new AmountException("The minimum deposit is €1.00");
    }
    else {
      setBalance(balance + amount);
      DataSource.updateAccountBalance(id, amount+balance);
    }
  }

  public void withdraw(double amount) throws AmountException{
    if(amount < 0){
      throw new AmountException("Cannot withdraw less than 0");
    }
    else if(amount > getBalance()){
      throw new AmountException("Insufficient funds available");
    }
    else{
      setBalance(balance - amount);
      DataSource.updateAccountBalance(id, balance-amount);
    }
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
