package thisKeyword;

/**
 * Created by TSI on 5/17/2018.
 */
public class ThisKeyword {

        Integer salary;
        String description;

        public void display(int salary, String description){
            this.salary = salary;
            this.description = description;
        }

        public static void main(String args[]){

            ThisKeyword thisKeyword = new ThisKeyword();
            thisKeyword.display(5000, " Monthly salary");
            System.out.print(thisKeyword.salary);     // 5000
            System.out.println(thisKeyword.description);     // Monthly Salary
        }

}
