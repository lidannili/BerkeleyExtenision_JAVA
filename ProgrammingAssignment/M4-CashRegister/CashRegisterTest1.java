import java.text.DecimalFormat;
import java.util.Scanner;

public class CashRegisterTest1
{
	public static void main(String[] args)
	{
		CashRegister cashRegister1 = new CashRegister();

		Scanner keyboard = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###.00");

		double itemPrice;
		String endInput;
		boolean isOn = true;
		System.out.print("Start Transaction:\n");
		
		while(isOn == true)
		{			
			while(keyboard.hasNextDouble())
			{
				itemPrice = keyboard.nextDouble();
				cashRegister1.AddTransaction(itemPrice);
			}

			endInput = keyboard.nextLine();
			
			if(endInput.equals("End"))
			{
			System.out.println("Total Transactions " + cashRegister1.TransactionCount());
			System.out.println("Total amount: $" + decimalFormat.format(cashRegister1.Total()));
			cashRegister1.ResetTransactions();
			System.out.println("Count:" + cashRegister1.Count());		
			}
			else if(endInput.equals("Exit"))
			{
				isOn = false;
				System.out.println("\nCount:" + cashRegister1.Count());

			}							
		}
	}	
}