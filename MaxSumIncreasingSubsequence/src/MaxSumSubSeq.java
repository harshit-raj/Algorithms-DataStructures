import java.util.Random;

public class MaxSumSubSeq {
	int[] ar;
	
	public MaxSumSubSeq(int n) {
		ar = new int[n];
		Random r = new Random();
		
		for(int i = 0;i<n;i++) {
			ar[i] = r.nextInt(100 + 100 + 1) -100;
		}
	}

	public static void main(String[] args) {
		MaxSumSubSeq ms = new MaxSumSubSeq(10);
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
			int jump = 0;
			for(int j = 0;j<i;j++) {
				System.out.println("Evaluating "+ arr[j]+" < "+ arr[i]);
				if(arr[j]<arr[i]) {
					System.out.println("-");
					T[i] = Math.max(T[i], T[j]+arr[i]);
				}
				else {
					jump++;
					System.out.println("Jump "+jump);
					if(jump>1) {
						System.out.println("breaking");
						break;
						
					}
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
