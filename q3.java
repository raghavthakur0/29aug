import java.util.Scanner;
public class q3
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		String newstr = str.replaceAll("[aeiouAEIOU]","");
		System.out.println(newstr);
	}
}