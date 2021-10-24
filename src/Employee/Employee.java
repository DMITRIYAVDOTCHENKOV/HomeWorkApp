package Employee;

import java.util.Arrays;
import java.util.Random;


public class Employee {
    private static EmployeeFail EmployeeFail;


    public static void main(String[] args) {


        EmployeeFail[] persArray = new EmployeeFail[5];
        persArray[0] = new EmployeeFail("Ivan Ivanov", "programmer", "ivan@mail.ru",
                "'+'7963852741", 45000);
        persArray[1] = new EmployeeFail("Alexander Petrov", "cook", "petrov@mail.ru",
                "'+'7963852741", 40000);
        persArray[2] = new EmployeeFail("Anatoly Medvedev", "electrician", "anatoly@mail.ru",
                "'+'7963852741", 40000);
        persArray[3] = new EmployeeFail(" Valery Sokolov", "teacher", "valery@mail.ru",
                "'+'7963852741", 20000);
        persArray[4] = new EmployeeFail("Anatoly Sidorov", "taxi driver", "anatoly@mail.ru",
                "'+'7963852741", 80000);
        for (int i = 0; i < 5; i++) {
            persArray[i].info();
            System.out.println();
        }
    }
}







