package src;

import java.time.YearMonth;

public class Employees {

  private float salary;
  private float salaryMonth;
  private String role;
  private String name;
  private YearMonth hiring;

  public float totalAmountPaidInTheMonthWithBenefits(String role) {
    float benefitPercentage = 0.0f;
    int salaryValue = 0;
    float totalAmountPaid = 0.0f;

    if (role == "Secretário") {
      benefitPercentage = 0.2f;
      salaryValue = 7000;
      totalAmountPaid = salaryValue + (benefitPercentage * salaryValue);
    } else if (role == "Vendedor") {
      benefitPercentage = 0.3f;
      salaryValue = 12000;
      totalAmountPaid = salaryValue + (benefitPercentage * salaryValue);
    } else if (role == "Gerente") {
      salaryValue = 20000;
      totalAmountPaid = salaryValue + (benefitPercentage * salaryValue);
    }

    return totalAmountPaid;
  }

  public float totalAmountPaidInTheMonthWithoutBenefits(String role) {
    float salaryValue = 0;

    if (role == "Secretário") {
      salaryValue = 7000;
    } else if (role == "Vendedor") {
      salaryValue = 12000;
    } else if (role == "Gerente") {
      salaryValue = 20000;
    }

    return salaryValue;
  }

  public float totalAmountPaidInTheMonthOnlyWithBenefits(String role) {
    float benefitPercentage = 0.0f;
    int salaryValue = 0;
    float totalAmountPaid = 0.0f;

    if (role == "Secretário") {
      benefitPercentage = 0.2f;
      salaryValue = 7000;
      totalAmountPaid = benefitPercentage * salaryValue;
    } else if (role == "Vendedor") {
      benefitPercentage = 0.3f;
      salaryValue = 12000;
      totalAmountPaid = benefitPercentage * salaryValue;
    }

    return totalAmountPaid;
  }

  public float getSalary() {
    return salary;
  }

  public float setSalary(float salary) {
    return this.salary = salary;
  }

  public float getSalaryMonth() {
    return salaryMonth;
  }

  public float setSalaryMonth(float salaryMonth) {
    return this.salaryMonth = salaryMonth;
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
