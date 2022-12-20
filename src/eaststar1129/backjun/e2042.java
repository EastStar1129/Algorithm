import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class e2042 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer strToken = new StringTokenizer(str, " ");
		int n = Integer.parseInt(strToken.nextToken());
		int m = Integer.parseInt(strToken.nextToken());
		int k = Integer.parseInt(strToken.nextToken());

		long arr[] = new long[n+1];
		long arr2[] = new long[n+1];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(i==0) arr2[i] =arr[i];
			else arr2[i] = arr2[i-1] + arr[i];
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<m+k;i++) {
			String strTemp = br.readLine();
			StringTokenizer strToken2 = new StringTokenizer(strTemp, " ");
			int a = Integer.parseInt(strToken2.nextToken());
			int b = Integer.parseInt(strToken2.nextToken());
			int c = Integer.parseInt(strToken2.nextToken());
			if(a == 1) {
				arr[b-1] = c;
			}else if(a==2){
				bw.write((arr2[c-1] - arr2[b-1])+"\n");  
			}
		}
		bw.close();   
	}
}
