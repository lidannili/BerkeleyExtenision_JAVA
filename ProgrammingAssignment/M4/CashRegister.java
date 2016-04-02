public class CashRegister{

	private int count = 0;
	private float total = 0;


	public static void main(String[] args)
	{
		CashRegister CR1 = new CashRegister();
		

	}
	//add an amount to a running total and increments the number of transactions
	public void AddTransaction(amount)
	{
		total += amount;
		count++;
	}

//return the number of transactions received
	public void TransactionCount(){
		return count;
	}
// returns the sum of the amounts of the transactions
	public void Total()
	{
		return total;
	}
//sets the total amount and transaction count to 0
	public void ResetTransactions()
	{
		count = 0;
		total = 0;
	}
}


