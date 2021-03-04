package Pb3;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static long getRandomNumber(int min, int max) {
        return (long) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        Data document = new Data();
        System.out.println("Initialize threads synchronized by queue");

        Printer printer = new Printer(document,1000);
        List<Employee> employees = new ArrayList<>(8);

        for (int i = 0; i < 8;i++) {
            long delay = getRandomNumber(500,2500);
            int noOfFiles = (int) getRandomNumber(1,5);
            Employee e = new Employee(document,delay,i,noOfFiles);
            employees.add(e);
        }

        System.out.println("Start threads synchronized by queue");

        for (Employee employee : employees) {

            employee.start();
        }

        printer.start();
    }
}
