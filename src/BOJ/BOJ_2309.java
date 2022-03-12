package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[9];
		int sum = 0;
		int a =0, b=0;

		for(int i = 0;i<list.length;i++) {
			list[i] = sc.nextInt();
			sum+=list[i];
		}
		sc.close();
		Arrays.sort(list);
		for(int i = 0;i<list.length-1;i++) {
			for(int j = i+1;j<list.length;j++) {
				if(sum-list[i]-list[j]==100) {
					a = i;
					b = j;
					break;
				}
			}
		}
		for(int i = 0;i<list.length;i++) {
			if(i==a || i==b) continue;
			System.out.println(list[i]);
		}
	}

}
