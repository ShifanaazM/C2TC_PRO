import java.util.Scanner;
public class togglestring {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuffer sb = new StringBuffer(str);
		int str_len = sb.length();
		for(int i=0; i< str_len; i++)
		{
			char ch = sb.charAt(i);
			if(ch >= 'a' && ch <='z') {
				int offset = ch - 'a';
				ch = (char) ('A' + offset);
			}
			else if(ch >= 'A' && ch <= 'z') {
				int offset = ch - 'A';
				ch = (char) ('a' + offset);
			}
			sb.setCharAt(i, ch);
		}
		System.out.println(sb);
	}

}
