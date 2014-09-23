package myJavaSolution;

public class Solution5 {

	 public int multiplication(int[] A,int[] B)
	    {
	        int[] reverseA = reverseArray(A);
	        int[] reverseB = reverseArray(B);
	        int result=0;
	        int carry = 0;
	        int current = 0;
	        int tempresult;
	        int biggerLength = max(A.length,B.length);
	        int[] resultArray = new int[biggerLength*2];
	        
	        for (int x=0; x<biggerLength*2;x++)
	            resultArray[x]=0;
	        int carryfromlast = 0;
	        for (int i=0; i<biggerLength;i++ )
	        {
	            current = carryfromlast;
	            carry = 0;
	            for (int j=0; j<=i;j++)
	            {
	                 tempresult = A[j]*B[i-j];
	                 carry = carry+tempresult/10;
	                 current = current+tempresult%10;
	                 if (current>10)
	                 {
	                	 carry+=current/10;
	                	 current=current%10;
	                 }
	                                                 
	            }
	            resultArray[i]=current;
	            carryfromlast=carry;
	                        
	                
	         }
	           carryfromlast = carry;
	           for (int i=1; i<biggerLength;i++)
	           {
	                 current = carryfromlast;
	                 carry = 0;
	              
	                 for (int j=biggerLength-1;j>=i;j--)
	                 {
	                	 tempresult = A[j]*B[biggerLength-j+i-1];
	                   
	                	 carry = carry+tempresult/10;
	 	                 current = current+tempresult%10;  
	 	                if (current>10)
		                 {
		                	 carry+=current/10;
		                	 current=current%10;
		                 }
	 	                 
	                 }
	                          
	              resultArray[biggerLength+i-1]=current;  
	              carryfromlast=carry;
	            }
	           resultArray[biggerLength*2-1]=carry;
	         
	         int factor=0;   
	        for (int m=0;m<resultArray.length;m++)
	        {
	        	int n = m;
	        	while (n>0)
	        	{
	        		resultArray[m] = resultArray[m]*10;
	        		n--;
	        	}
	        	result+=resultArray[m];
	        }
	   
	        
	        return result;
	    }

	public int max(int a, int b)
	{
	    if (a>=b)
	       return a;
	    else 
	       return b;
	}
	    
	    

	public int[] reverseArray(int[] A)
	{
	     int temp;
	     for (int a=0; a<A.length/2; a++) 
	     {
	        temp =A[A.length-1-a];
	        A[A.length-1-a]=A[a];
	        A[a]=temp;
	       
	    }
	     return A;
	}
	}
