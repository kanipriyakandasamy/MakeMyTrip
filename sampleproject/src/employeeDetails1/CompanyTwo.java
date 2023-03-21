package employeeDetails1;

public class CompanyTwo extends Company{
   public void companyTw() {
	   System.out.println("infosys");
   }
   public static void main(String[] args) {
	   CompanyTwo obj = new CompanyTwo();
	   obj.companyTw();
	   obj.companyOne();
	   obj.empAge();
	   obj.empId();
	   obj.empName();
}
   
}
