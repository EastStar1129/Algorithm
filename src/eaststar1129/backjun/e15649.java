import java.io.IOException;
import java.util.Scanner;

public class e15649 {

	static int list[] = new int[10];
	static boolean listChk[] = new boolean[10]; 
	public static void main(String[] args) throws IOException {
		//첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
		
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		
		fnc(1, num1, num2);
	}

	public static void fnc(int index, int n, int m) {
		if(index == m+1) {
			for(int i=1;i<=m;i++) {
				System.out.print(list[i]+" ");
			}
			System.out.println("");
		}else {
			for(int i=1;i<=n;i++) {
				if(listChk[i]) continue; // 중복처리
				list[index] = i; listChk[i] = true;
				fnc(index+1, n, m);
				listChk[i] = false;
			}
		}
	}
}