import java.util.Scanner;
public class A_very_big_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long sum=0;
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			int val=sc.nextInt();
			sum+=val;
			
		}
		
		System.out.println(sum);
		
		sc.close();
		
		
		
	}

}
