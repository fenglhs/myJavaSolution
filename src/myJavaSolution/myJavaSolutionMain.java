package myJavaSolution;

public class myJavaSolutionMain {

	 public static void main(String[] args) {
	        // TODO code application logic here
	        int A[] = {1,3,2,5,9,4,7,6,8};
	        int B[] = {5,1,5,5,5,6,9};
	        String C = "This is a sentence";
	        String D = "sent";
	        
	        int E[] = {4,3,6,2};
	        int F[] = {2,9,2,7};
	       
	 /*       Solution1 mysolution = new Solution1();
	        int newLength = mysolution.removeDuplicates(A, A.length);
	        System.out.println(Arrays.toString(A));
	        System.out.println(newLength);
	        
	        Solution2 mysolution2 = new Solution2();
	        mysolution2.mergeSort(A);
	        System.out.println(Arrays.toString(A));
	        
	        Solution3 mysolution3 = new Solution3();
	        int index = mysolution3.findNumberIndexfromSortedArray(B);
	        System.out.println(index);
	        
	        Solution4 mysolution4 = new Solution4();
	        int index = mysolution4.findPattenPosition(C, D);
	        System.out.println(index);
	   */
	        Solution5 mysolution5 = new Solution5();
	        int result = mysolution5.multiplication(E, F);
	        System.out.println(result);
	    }
	}

