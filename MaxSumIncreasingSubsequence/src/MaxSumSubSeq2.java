import java.util.Random;

public class MaxSumSubSeq2 {
	int[] ar;
	
	public MaxSumSubSeq2(int n) {
		ar = new int[n];
		Random r = new Random();
		
		for(int i = 0;i<n;i++) {
			ar[i] = r.nextInt(100 + 100 + 1) -100;
		}
	}

	public static void main(String[] args) {
		MaxSumSubSeq2 ms = new MaxSumSubSeq2(10);
		System.out.println("The array is");
		for(int i : ms.ar) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		
		int r = ms.maxSum(ms.ar);
		System.out.println("Max sum is : "+r);
		

	}
	
	public int maxSum(int []arr) {
		int T[] = new int[arr.length];
		
		for(int i = 0; i<T.length;i++) {
			T[i] = arr[i];
		}
		
		for(int i = 1;i<T.length;i++) {
			for(int j = 0;j<i;j++) {
				if(arr[j]<arr[i]) {
					System.out.println("Evaluating "+ arr[j]+" < "+ arr[i]);
					T[i] = Math.max(T[i], arr[i]);
				}
				
			}
		}
		int max = T[0];
		for(int i : T) {
			if(i>max) {
				max = i;
			}
		}
		return max;
	}
	
	
	

}
