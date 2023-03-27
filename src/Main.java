package src;

import java.time.YearMonth;
import java.util.ArrayList;

public class Main {

  static int amountEmployees = 6;
  static int amountSalesEmployees = 5;

  public static void main(String[] args) {
    Employees[] employee = new Employees[amountEmployees];
    Sales[] firstSeller = new Sales[amountSalesEmployees];
    Sales[] secondSeller = new Sales[amountSalesEmployees];
    ArrayList<Employees> list = new ArrayList<>();
    Employees methods = new Employees();

    for (int i = 0; i < amountEmployees; i++) {
      employee[i] = new Employees();
    }

    for (int i = 0; i < amountSalesEmployees; i++) {
      firstSeller[i] = new Sales();
      secondSeller[i] = new Sales();
    }

    //Todos os funcionários

    employee[0].setName("Jorge Carvalho");
    employee[0].setRole("Secretário");
    employee[0].setHiring(YearMonth.of(2018, 1));

    employee[1].setName("Maria Souza");
    employee[1].setRole("Secretário");
    employee[1].setHiring(YearMonth.of(2015, 12));

    employee[2].setName("Ana Silva");
    employee[2].setRole("Vendedor");
    firstSeller[0].setMonth(12);
    firstSeller[0].setYear(2021);
    firstSeller[0].setValue(5200.00f);
    firstSeller[1].setMonth(1);
    firstSeller[1].setYear(2022);
    firstSeller[1].setValue(4000.00f);
    firstSeller[2].setMonth(2);
    firstSeller[2].setYear(2022);
    firstSeller[2].setValue(4200.00f);
    firstSeller[3].setMonth(3);
    firstSeller[3].setYear(2022);
    firstSeller[3].setValue(5850.00f);
    firstSeller[4].setMonth(4);
    firstSeller[4].setYear(2022);
    firstSeller[4].setValue(7000.00f);
    employee[2].setSellersSales(firstSeller);
    employee[2].setHiring(YearMonth.of(2021, 12));

    employee[3].setName("João Mendes");
    employee[3].setRole("Vendedor");
    secondSeller[0].setMonth(12);
    secondSeller[0].setYear(2021);
    secondSeller[0].setValue(3400.00f);
    secondSeller[1].setMonth(1);
    secondSeller[1].setYear(2022);
    secondSeller[1].setValue(7700.00f);
    secondSeller[2].setMonth(2);
    secondSeller[2].setYear(2022);
    secondSeller[2].setValue(5000.00f);
    secondSeller[3].setMonth(3);
    secondSeller[3].setYear(2022);
    secondSeller[3].setValue(5900.00f);
    secondSeller[4].setMonth(4);
    secondSeller[4].setYear(2022);
    secondSeller[4].setValue(6500.00f);
    employee[3].setSellersSales(secondSeller);
    employee[3].setHiring(YearMonth.of(2021, 12));

    employee[4].setName("Juliana Alves");
    employee[4].setRole("Gerente");
    employee[4].setHiring(YearMonth.of(2017, 7));

    employee[5].setName("Bento Albino");
    employee[5].setRole("Gerente");
    employee[5].setHiring(YearMonth.of(2014, 3));

    for (int i = 0; i < amountEmployees; i++) {
      list.add(employee[i]);
    }

    // Método que retorna valor total pago (salário e benefício) a esses funcionários no mês
    float totalPaidToEmployeesWithBenefits = methods.totalAmountPaidInTheMonthWithBenefits(
      employee,
      4, // Exemplo de mês e ano
      2022
    );

    System.out.println(
      "Valor pago aos funcionários com benefícios é R$" +
      totalPaidToEmployeesWithBenefits +
      " reais"
    );

    // Método que retorna o total pago somente em salários no mês.
    float totalPaidToEmployees = methods.totalAmountPaidInTheMonthWithoutBenefits(
      employee,
      4,
      2022
    );

    System.out.println(
      "Valor pago aos funcionários sem benefícios é R$" +
      totalPaidToEmployees +
      " reais"
    );

    // Método que retorna o total pago somente em benefícios no mês.
    float totalPaidToEmployeesOnlyWithBenefits = methods.totalAmountPaidInTheMonthOnlyWithBenefits(
      employee,
      4,
      2022
    );

    System.out.println(
      "Valor pago aos funcionários que possuem benefícios é R$" +
      totalPaidToEmployeesOnlyWithBenefits +
      " reais"
    );

    // Método que retorna o valor mais alto no mês
    float highestWageValue = methods.highestWagesOfEmployees(
      employee,
      4,
      2022
    );

    System.out.println(
      "Valor mais alto pago do mês é R$" + highestWageValue + " reais"
    );

    // Método que retorna o nome do funcionário que recebeu o valor mais alto em benefícios no mês.
    String highestWageValueEmployeeName = methods.highestWageEmployeeName(
      employee,
      4,
      2022
    );

    System.out.println(
      "Valor mais pago do mês é do funcionário: " + highestWageValueEmployeeName
    );

    // Método que retorna o vendedor que mais vendeu
    String highestWageValueOfSellers = methods.sellerWhoSoldTheMost(
      employee,
      4,
      2022
    );

    System.out.println(highestWageValueOfSellers);
  }
}
