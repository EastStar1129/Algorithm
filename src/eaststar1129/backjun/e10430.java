import java.util.Scanner;

public class e10430 {
	public static void main(String[] args) {
		/*
		 	(A+B)%C�� ((A%C) + (B%C))%C �� ������?
	
			(A��B)%C�� ((A%C) �� (B%C))%C �� ������?
			
			�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * */

		
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		scan.close();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		
	}
}
