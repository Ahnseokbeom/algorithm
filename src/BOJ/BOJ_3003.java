package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003 {
	public static void main(String[] args) throws IOException{
		int[] list = {1,1,2,2,2,8};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] num = new int[6];
		int[] result = new int[6];
		for(int i = 0;i<list.length;i++) {
			num[i] = Integer.parseInt(st.nextToken());
			result[i] = list[i]-num[i];
		}
		for(int i = 0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
