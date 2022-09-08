package Employee;


public class SalaryPaidOnBankException extends Exception {

	public SalaryPaidOnBankException() {
        super("Salary Paid On Bank!, Salary is Greater than 7000");
    }
	

}
