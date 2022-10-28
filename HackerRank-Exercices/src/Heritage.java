import java.util.Date;
import java.util.GregorianCalendar;

class Employee
{
    private String name;
    private double salary;
    private Date hireDay;
    public Employee(String n, double s,
                    int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar
                = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public Date getHireDay(){

        return hireDay;
    }
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}


class Manager extends Employee
{
    /**
     * @param n Nom de l’employé
     * @param s Le salaire
     * @param year L’année d’embauche
     * @param month Le mois d’embauche
     * @param day Le jour d’embauche
     */
    public Manager(String n, double s,
                   int year, int month, int day)
    {
        super(n, s, year, month, day);
        bonus=0;

    }
    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    public void setBonus(double b)
    {
        bonus = b;
    }
    private double bonus;
}




public class Heritage {

    public static void main(String[] args) {
        Employee []  stuff=   new Employee[3];

        stuff[0] = new Employee("Hicham",10000,2001,2,13);
        stuff[1]  = new Manager("Nadori",10000,2001,2,13);
        stuff[2] = new Employee("Loukili",10000,2001,2,13);
        for(Employee emp :stuff){

            System.out.println(emp.getName());
    }
    }
}
