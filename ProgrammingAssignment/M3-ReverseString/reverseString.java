import java.io.*;

public class reverseString {
	public static void main(String[] args) throws IOException{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
		System.out.println(reverse(stdin.readLine()));
	}
	
	public static String reverse(String s){
		if((s == null) || (s.length() <= 1)){
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}
	
}