package oo2;

public class Main {

  public static void main(String args[]) {
    /*
     * Employee w1 = new Employee("Steve", 26, 41000, "Dundrum");
     * Employee w2 = new Employee("Steph", 21, 45000, "Leixlip");
     * 
     * w1.raiseSalary(3500);
     * Double sw1 = w1.getSalary();
     * Double sw2 = w2.getSalary();
     * System.out.println("Worker 1 earns €" + sw1);
     * System.out.println("Worker 2 earns €" + sw2);
     */

    // make account, withdraw, print balance
    bankAccount a1 = new bankAccount("Sheila", 15.47);
    a1.withdraw(20);
    a1.withdraw(15);
    System.out.println("Current balance is: €" + a1.getBalance());

  }

}
