public class CashRegister{

	private int transactions = 0;
	private int count = 0;
	private double total = 0;

	//add an amount to a running total and increments the number of transactions
	public void AddTransaction(double amount)
	{
		total += amount;
		transactions++;
	}
	
	//return the number of transactions received
	public int TransactionCount(){
		return transactions;
	}
	
	// returns the sum of the amounts of the transactions
	public double Total()
	{
		return total;
	}

	//sets the total amount and transaction count to 0
	public void ResetTransactions()
	{
		transactions = 0;
		total = 0;
		count++;
	}

	public int Count()
	{	
		return count;
	}


}


