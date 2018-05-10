package Encapsulation;

/**
 * Created by TSI on 5/10/2018.
 */
public class EmployeeTest {

        public static void main(String args[]){
            Employee employee = new Employee();
            employee.setFirstName("Jose Rey");
            employee.setMiddleName("Rabadilla");
            employee.setLastName("Amorganda");
            employee.setAge(27);

            System.out.println("First Name: " + employee.getFirstName());
            System.out.println("Middle Name: " + employee.getMiddleName());
            System.out.println("Last Name: " + employee.getLastName());
            System.out.println("Age: " + employee.getAge());
    }
}
