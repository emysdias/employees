package src;

import java.time.YearMonth;

public class Employees {

  private float salary;
  private String role;
  private String name;
  private YearMonth hiring;
  static int secretarySalary = 7000;
  static int sellerSalary = 12000;
  static int managerSalary = 20000;

  private float totalAmountSalaryWithBenefits(
    float salary,
    float benefitPercentage
  ) {
    return benefitPercentage * salary;
  }

  public float totalAmountPaidInTheMonthWithBenefits(String role) {
    float totalAmountPaid = 0.0f;
    float salary = 0.0f;

    if (role == "Secretário") {
      salary = secretarySalary;
      totalAmountPaid = salary + totalAmountSalaryWithBenefits(salary, 0.2f);
    } else if (role == "Vendedor") {
      salary = sellerSalary;
      totalAmountPaid = salary + totalAmountSalaryWithBenefits(salary, 0.3f);
    } else if (role == "Gerente") {
      salary = managerSalary;
      totalAmountPaid = salary + totalAmountSalaryWithBenefits(salary, 0.0f);
    }

    return totalAmountPaid;
  }

  public float totalAmountPaidInTheMonthWithoutBenefits(String role) {
    float salaryValue = 0.0f;

    if (role == "Secretário") {
      salaryValue = secretarySalary;
    } else if (role == "Vendedor") {
      salaryValue = sellerSalary;
    } else if (role == "Gerente") {
      salaryValue = managerSalary;
    }

    return salaryValue;
  }

  public float totalAmountPaidInTheMonthOnlyWithBenefits(String role) {
    float totalAmountPaid = 0.0f;

    if (role == "Secretário") {
      totalAmountPaid = totalAmountSalaryWithBenefits(secretarySalary, 0.2f);
    } else if (role == "Vendedor") {
      totalAmountPaid =
        totalAmountSalaryWithBenefits(sellerSalary, 0.2f);
    }

    return totalAmountPaid;
  }

  public float getSalary() {
    return salary;
  }

  public float setSalary(float salary) {
    return this.salary = salary;
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
}
