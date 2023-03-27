package src;

import java.time.YearMonth;
import java.util.ArrayList;

public class Employees {

  private String role;
  private String name;
  private YearMonth hiring;
  private Sales[] sellersSales;
  static int secretarySalary = 7000;
  static int sellerSalary = 12000;
  static int managerSalary = 20000;

  private float totalAmountSalaryWithBenefits(
    float salary,
    float benefitPercentage
  ) {
    return benefitPercentage * salary;
  }

  private int monthCalcule(int month) {
    int amountOfMonths = 12;
    return amountOfMonths - month;
  }

  private boolean checkIfDateComesAfter(YearMonth date, int month, int year) {
    int inputMonthValue = monthCalcule(month);
    int employeeMonthValue = monthCalcule(date.getMonthValue());
    if (date.getYear() < year) {
      return true;
    } else if (
      date.getYear() == year && employeeMonthValue >= inputMonthValue
    ) {
      return true;
    } else {
      return false;
    }
  }

  private float totalPaidToSeller(Employees employee, int month, int year) {
    float salary = 0.0f;
    for (Sales s : employee.sellersSales) {
      if (s.getMonth() == month && s.getYear() == year) {
        salary = s.getValue() * 0.3f;
      }
    }

    return salary;
  }

  public float totalAmountPaidInTheMonthWithBenefits(
    Employees[] employee,
    int month,
    int year
  ) {
    float totalAmountPaid = 0.0f;
    float salary = 0.0f;

    for (Employees e : employee) {
      if (checkIfDateComesAfter(e.hiring, month, year)) {
        if (e.role == "Secretário") {
          salary = secretarySalary;
          totalAmountPaid +=
            salary + totalAmountSalaryWithBenefits(salary, 0.2f);
        } else if (e.role == "Vendedor") {
          salary = sellerSalary;
          totalAmountPaid += salary + totalPaidToSeller(e, month, year);
        } else if (e.role == "Gerente") {
          salary = managerSalary;
          totalAmountPaid +=
            salary + totalAmountSalaryWithBenefits(salary, 0.0f);
        }
      }
    }
    return totalAmountPaid;
  }

  public float totalAmountPaidInTheMonthWithoutBenefits(
    Employees[] employee,
    int month,
    int year
  ) {
    float salaryValue = 0.0f;

    for (Employees e : employee) {
      if (checkIfDateComesAfter(e.hiring, month, year)) {
        if (e.role == "Secretário") {
          salaryValue += secretarySalary;
        } else if (e.role == "Vendedor") {
          salaryValue += sellerSalary;
        } else if (e.role == "Gerente") {
          salaryValue += managerSalary;
        }
      }
    }

    return salaryValue;
  }

  public float totalAmountPaidInTheMonthOnlyWithBenefits(
    Employees[] employee,
    int month,
    int year
  ) {
    float totalAmountPaid = 0.0f;

    for (Employees e : employee) {
      if (checkIfDateComesAfter(e.hiring, month, year)) {
        if (e.role == "Secretário") {
          totalAmountPaid =
            +totalAmountSalaryWithBenefits(secretarySalary, 0.2f);
        } else if (e.role == "Vendedor") {
          totalAmountPaid = +totalAmountSalaryWithBenefits(sellerSalary, 0.2f);
        }
      }
    }

    return totalAmountPaid;
  }

  public float highestWagesOfEmployees(
    Employees[] employee,
    int month,
    int year
  ) {
    float highestWage = 0.0f;
    float salary = 0.0f;
    float totalAmountPaid = 0.0f;

    for (Employees e : employee) {
      if (checkIfDateComesAfter(e.hiring, month, year)) {
        if (totalAmountPaid > highestWage) {
          highestWage = totalAmountPaid;
        }
        if (e.role == "Secretário") {
          salary = secretarySalary;
          totalAmountPaid =
            salary + totalAmountSalaryWithBenefits(salary, 0.2f);
        } else if (e.role == "Vendedor") {
          salary = sellerSalary;
          totalAmountPaid =
            salary + totalAmountSalaryWithBenefits(salary, 0.3f);
        } else if (e.role == "Gerente") {
          salary = managerSalary;
          totalAmountPaid =
            salary + totalAmountSalaryWithBenefits(salary, 0.0f);
        }
      }
    }

    return highestWage;
  }

  public String highestWageEmployeeName(
    Employees[] employee,
    int month,
    int year
  ) {
    float highestWage = 0.0f;
    float salary = 0.0f;
    float totalAmountPaid = 0.0f;
    String employeeName = "";

    for (Employees e : employee) {
      if (checkIfDateComesAfter(e.hiring, month, year)) {
        if (e.role == "Secretário") {
          salary = secretarySalary;
          totalAmountPaid =
            salary + totalAmountSalaryWithBenefits(salary, 0.2f);
        } else if (e.role == "Vendedor") {
          salary = sellerSalary;
          totalAmountPaid =
            salary + totalAmountSalaryWithBenefits(salary, 0.3f);
        }
        if (totalAmountPaid > highestWage) {
          highestWage = totalAmountPaid;
          employeeName = e.name;
        }
      }
    }

    return employeeName;
  }

  public String sellerWhoSoldTheMost(
    Employees[] employee,
    int month,
    int year
  ) {
    float highestWage = 0.0f;
    float salary = 0.0f;
    float totalAmountPaid = 0.0f;
    String employeeName = "";

    for (Employees e : employee) {
      if (checkIfDateComesAfter(e.hiring, month, year)) {
        if (e.role == "Vendedor") {
          salary = sellerSalary;
          totalAmountPaid =
            salary + totalAmountSalaryWithBenefits(salary, 0.3f);
          if (totalAmountPaid > highestWage) {
            highestWage = totalAmountPaid;
            employeeName = e.name;
          }
        }
      }
    }

    return "O vendedor: " + employeeName + " vendeu " + highestWage + " reais.";
  }

  public String getRole() {
    return role;
  }

  public String setRole(String role) {
    return this.role = role;
  }

  public String getName() {
    return name;
  }

  public String setName(String name) {
    return this.name = name;
  }

  public YearMonth getHiring() {
    return hiring;
  }

  public YearMonth setHiring(YearMonth hiring) {
    return this.hiring = hiring;
  }

  public Sales[] getSellersSales() {
    return sellersSales;
  }

  public Sales[] setSellersSales(Sales[] sales) {
    return this.sellersSales = sales;
  }
}
