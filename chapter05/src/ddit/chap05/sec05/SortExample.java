package ddit.chap05.sec05;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] res = bs.bsort();
		System.out.println(Arrays.toString(res));
	}

}
