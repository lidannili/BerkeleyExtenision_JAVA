import java.util.*;
import java.io.*;
class Score
{
	String date;
	Integer score;

	Score(String d, int s)
	{
		date = d;
		score = s;
	}

	public String getDate()
	{
		return date;
	}
	public Integer getScore()
	{
		return score;
	}
	public String toString()
	{
		return date + " " + score; 
	}
}

public class TestMap
{
	ArrayList<Score> sl1 = new ArrayList<Score>();
	ArrayList<Score> sl2 = new ArrayList<Score>();
	TreeMap<String,ArrayList<Score>> Bowler = new TreeMap<String, ArrayList<Score>>();
	
	class DateCompare implements Comparator<Score>
	{
		public int compare(Score one, Score two)
		{
			return one.date.compareTo(two.date);
		}
	}

	public static void main(String[] args)
	{
		new TestMap().go();
	}

	public void go()
	{

		sl1.add(new Score("2016-01-01",250));
		sl1.add(new Score("2016-02-01",270));
		sl1.add(new Score("2016-03-01",256));
		sl1.add(new Score("2016-04-01",236));
		sl1.add(new Score("2015-12-31",244));

		sl2.add(new Score("2016-01-01",230));
		sl2.add(new Score("2016-02-01",240));
		sl2.add(new Score("2016-03-01",266));
		sl2.add(new Score("2016-04-01",246));
		sl2.add(new Score("2016-05-01",276));
		sl2.add(new Score("2015-12-01",248));
		sl2.add(new Score("2015-11-01",250));


		DateCompare dc =new DateCompare();
		Collections.sort(sl1,dc);
		Collections.sort(sl2,dc);
		
		Bowler.put("Danny", sl1);
		Bowler.put("Jack", sl2);
		
		Iterator<String> iterator = Bowler.keySet().iterator(); 
		while (iterator.hasNext()) { 
			Object key = iterator.next(); 
			int size = Bowler.get(key).size();
			System.out.println("Bowler's name: " + key);
			System.out.println("Bowler's game record: " + Bowler.get(key));
			System.out.println("Number of game: " + Bowler.get(key).size());
			System.out.println("The average score: " + getAverage(Bowler.get(key)));
			System.out.println("Date of the last game: " + Bowler.get(key).get(size-1).getDate());
			System.out.println("Score of the last game: " + Bowler.get(key).get(size-1).getScore());
		} 
	}

	double getAverage(ArrayList<Score> sl)
	{
		int sum = 0;
		double average;
		int size = sl.size();

		for(int i=0; i<size;i++)
		{
			sum += sl.get(i).getScore();
		}
		average = sum/size;
		return average;		
	}

}
