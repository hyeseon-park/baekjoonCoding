package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sort_10989 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		
		for(int i=0; i<n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1; i<=10000; i++) {
			if(arr[i]>0) {
				for(int j=0; j<arr[i]; j++) {
					bw.write(Integer.toString(i)+"\n");
				}
			}
		}
		br.close();
		bw.close();
	}
}
