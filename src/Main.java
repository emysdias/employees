package src;

import java.time.YearMonth;
import java.util.ArrayList;

public class Main {

  static int amountEmployees = 3;

  public static void main(String[] args) {
    Employees[] employee = new Employees[amountEmployees];
    Employees amount = new Employees();
    ArrayList<Employees> list = new ArrayList<>();

    for (int i = 0; i < amountEmployees; i++) {
      employee[i] = new Employees();
    }

    employee[0].setName("Jorge Carvalho");
    employee[0].setRole("Vendedor");
    employee[0].setHiring(YearMonth.of(2018, 1));

    employee[1].setName("Maria Souza");
    employee[1].setRole("Vendedor");
    employee[1].setHiring(YearMonth.of(2015, 12));

    employee[2].setName("Ana Silva");
    employee[2].setRole("Vendedor");
    employee[2].setHiring(YearMonth.of(2021, 12));

    list.add(employee[0]);
    list.add(employee[1]);
    list.add(employee[2]);

    // display(list);
    String value = amount.sellerWhoSoldTheMost(employee, 11, 2021);
    System.out.println(value);
  }
  // public static void display(ArrayList<Employees> list) {
  //   for (Employees model : list) {
  //     System.out.println(
  //       "Name: " +
  //       model.getName() +
  //       " Role: " +
  //       model.getRole() +
  //       " Hiring: " +
  //       model.getHiring() +
  //       " Salary: " +
  //       model.getSalary()
  //     );
  //   }
  // }
}
