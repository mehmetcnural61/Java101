package Classes.OdevMaasHesaplayici;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxedSalary = 0;
    int extraWorkHours = 0;
    int bonusPrice = 0;
    double raiseSal = 0;
    int today = 2021;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            taxedSalary = this.salary * 0.03;
            return taxedSalary;
        } else {
            return 0;
        }

    }

    int bonus() {
        if (this.workHours > 40) {
            extraWorkHours = this.workHours - 40;
            bonusPrice = extraWorkHours * 30;
            return bonusPrice;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int subtraction = today - this.hireYear;

        if (subtraction < 10) {
            raiseSal = this.salary * 0.05;
            return raiseSal;
        } else if (subtraction > 9 && subtraction < 20) {
            raiseSal = this.salary * 0.10;
            return raiseSal;
        } else if (subtraction > 19) {
            raiseSal = this.salary * 0.15;
            return raiseSal;
        }
        return 0;
    }

    double netSalary() {
        double netSalary = totalSalary() - tax();
        return netSalary;
    }

    double subSalary() {
        double subSalary = (this.salary + bonus()) - tax();
        return subSalary;
    }

    double totalSalary() {
        double totalSalary = this.salary + raiseSalary();
        return totalSalary;
    }

    public String toString() {

        return "Adı: " + this.name + "\nMaasi: " + this.salary + "\nCalisma Saati: " + this.workHours
                + "\nBaşlangıç Yılı: " + this.hireYear + "\nVergi: " + tax() + "\nBonus: " + bonus() + "\nMaas Artisi: " + raiseSalary()
                + "\nVergi ve Bonuslar ile birlikte maas: " + subSalary() + "\nToplam Maas: " + totalSalary();


    }
}




