package src;

import java.time.YearMonth;
import java.util.ArrayList;

public class Main {

  static int amountEmployees = 6;

  public static void main(String[] args) {
    Employees[] employee = new Employees[amountEmployees];
    Employees methods = new Employees();
    ArrayList<Employees> list = new ArrayList<>();

    for (int i = 0; i < amountEmployees; i++) {
      employee[i] = new Employees();
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
    employee[2].setHiring(YearMonth.of(2021, 12));

    employee[3].setName("João Mendes");
    employee[3].setRole("Vendedor");
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
    float totalPaidToEmployees = methods.totalAmountPaidInTheMonthWithBenefits(
      employee,
      10,
      2027
    );

    System.out.println(totalPaidToEmployees);
  }
}
