/*
 * Beanery.java
 * @author SonnyGauran
 */

package beanery.ObservableProperty;


public class Beanery {

    public Beanery () { }
    public static void main(String args[]) {
	EmployeeBean minion = new EmployeeBean();
	minion.setName ("Nobody");
	minion.setDepartment ("Some Department");
	
	MySalaryListener spy = new MySalaryListener();
	minion.addSalaryListener (spy);
	minion.setSalary (20000);
	System.out.println("Salary: "+ minion.getSalary ());
	minion.setSalary (26000);
	System.out.println("Salary: "+ minion.getSalary ());
    }
    
}
