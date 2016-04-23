import java.io.*;
//import java.util.ArrayList;
import java.text.DecimalFormat;

public class CashRegisterTest2
{
	public static void main(String[] args) 
	{	
		CashRegister cashRegister2 = new CashRegister();
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###.00");
		double[] list1 = {1,2,3,4};
		for(int i=0;i<list1.length;i++){
		cashRegister2.AddTransaction(list1[i]);
		}
		System.out.println("Total Transactions " + cashRegister2.TransactionCount());
		System.out.println("Total amount: $" + decimalFormat.format(cashRegister2.Total()));
		cashRegister2.ResetTransactions();
		System.out.println("Total Count:" + cashRegister2.Count());	
	}
}
