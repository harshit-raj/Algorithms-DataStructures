/**
 * 
 */
package edu.algo.DynamicProg;

/**
 * @author harsh
 *
 */
public class FibonacciDPMem {
	
	int MAX = 100;
	int empty = -1;
	
	int lookup[] = new int[MAX];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FibonacciDPMem f = new FibonacciDPMem();
		f.init();
		System.out.println(f.fib(10));

	}
	
	void init() {
		for(int i = 0; i < MAX; i++) {
			lookup[i] = empty;
		}
	}
	
	int fib(int n) {
		if(lookup[n] == empty) {
			if(n<=1) {
				lookup[n] = n;
			}
			else {
				lookup[n] = fib(n-1) + fib(n-2);
			}
		}
		
		
		return lookup[n];
	}

}
