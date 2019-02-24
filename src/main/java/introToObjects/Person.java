package introToObjects;

public class Person {
    private String name;
    private String password;
    private int age;
    private double money;

  public Person (String name,String password, int age){
      this.name = name;
      this.password = password;
      this.age = age;
  }

  public void setMoney (double newAmount, String pass){
      if (pass.equals(password))
          money = newAmount;
      else
          System.out.println("Your password is incorrect!");
  }

  public double getMoney(){
      return money;
    }
}
