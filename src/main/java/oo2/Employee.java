package oo2;

public class Employee {
  private String name;
  private int age;
  private double salary;
  private String location;

  public void raiseSalary(double amount) {
    salary = salary + amount;
  }

  Employee(String name, int age, double salary, String location) {
    setName(name);
    setAge(age);
    setSalary(salary);
    setLocation(location);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

}
