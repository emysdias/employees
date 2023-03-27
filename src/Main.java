package src;

import java.time.YearMonth;
import java.util.ArrayList;

public class Main {

  static int amountEmployees = 6;

  public static void main(String[] args) {
    Employees[] employee = new Employees[amountEmployees];
    ArrayList<Employees> list = new ArrayList<>();
    float totalAmountPaidWithBenefits = 0.0f;

    for (int i = 0; i < amountEmployees; i++) {
      employee[i] = new Employees();
    }

    employee[0].setName("Jorge Carvalho");
    employee[0].setRole("Secretário");
    employee[0].setHiring(YearMonth.of(2018, 1));
    totalAmountPaidWithBenefits =
      employee[0].totalAmountPaidInTheMonthOnlyWithBenefits(
          employee[0].getRole()
        );
    employee[0].setSalary(totalAmountPaidWithBenefits);

    list.add(employee[0]);

    employee[1].setName("Maria Souza");
    employee[1].setRole("Secretário");
    employee[1].setHiring(YearMonth.of(2015, 12));
    totalAmountPaidWithBenefits =
      employee[1].totalAmountPaidInTheMonthOnlyWithBenefits(
          employee[1].getRole()
        );
    employee[1].setSalary(totalAmountPaidWithBenefits);

    list.add(employee[1]);

    employee[2].setName("Ana Silva");
    employee[2].setRole("Vendedors");
    employee[2].setHiring(YearMonth.of(2021, 12));
    totalAmountPaidWithBenefits =
      employee[2].totalAmountPaidInTheMonthOnlyWithBenefits(
          employee[2].getRole()
        );
    employee[2].setSalary(totalAmountPaidWithBenefits);

    list.add(employee[2]);

    display(list);
  }

  public static void display(ArrayList<Employees> list) {
    for (Employees model : list) {
      System.out.println(
        "Name: " +
        model.getName() +
        " Role: " +
        model.getRole() +
        " Hiring: " +
        model.getHiring() +
        " Salary: " +
        model.getSalary()
      );
    }
  }
}
