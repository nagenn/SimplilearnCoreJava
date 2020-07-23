package Inheritance;

public class CarLoan extends LoanProcess {
 private String model;
 
 CarLoan(String nme, double amount, int tm, String mdl){
	 customername = nme;
	 loanamount = amount;
	 term = tm;
	 model = mdl;
 }
 public String getCustomername() {
	 return "Customer "+customername+" has customer ID:"+ customerid;
 }
 public double calculateEMI(double prm) {
	 System.out.println("Including insurance premium in EMI");
	 return prm + ((loanamount * interest/100)+(loanamount/term));
 }
}