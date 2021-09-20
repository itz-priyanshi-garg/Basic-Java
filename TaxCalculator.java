/*public class TaxCalulator
{
   public static void main(String xyz[])
   {
	   
	   Scanner sc = new Scanner(System.in);
	   
	System.out.print("Enter Salary :- ");
	int salary = sc.nextInt();
    float tax = 1;
	int taxRate = 0;
	if(salary>1000000)
	{
		taxRate = 20;
		tax = (float)(salary * 0.20);
	}
	
	System.out.print("For Salary "+salary+", Tax would be @ "+taxRate+"% amount "+tax+"Rs.");
	
   }
}
*/

// Enter Basic Salary 
// add HRA :- @15 of Basic
// add DA :- 60% of Basic 
// tax : below 500k :- 0%'
// 500,001 - 10,00,000 :- 20%
// 10                  := 30%

import java.util.Scanner;

class TaxCalculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter basic Salary : ");
		int salary = sc.nextInt();
		float tax=0;
		float hra = 0.15f;
		float da = 0.60f;
		
		float totalsalary = 0;
		
		if(salary<=500000)
			tax = 0.0f;
		else if(salary>500000 && salary<1000000)
			tax = 0.20f;
		else
			tax = 0.30f;
		
		tax = salary*tax;
		totalsalary = salary + (salary*hra) + (salary*da) - tax;
		System.out.println(totalsalary);
	}
}