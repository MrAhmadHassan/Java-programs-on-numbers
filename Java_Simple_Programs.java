package implemented;


public class Java_Simple_Programs {
	
	//program to find the even odd number
	static void even_odd_identifier(int num) {
		if (num%2==0) {
			System.out.println(num +" is even");	
			return;
		}
		System.out.println(num +" is odd");
	}
	
	//program to find the sum of odd and even numbers
	static void even_odd_sum(int n) {
		int even_sum = 0;
		int odd_sum=0;
		for (int i = 1; i < n; i++) {
			if (i%2==1) {
				even_sum  = even_sum  + i;				
			}	
			else {
				odd_sum  = odd_sum  + i;
			}
		}
		System.out.println("even sum is "+even_sum);
		System.out.println("odd sum is "+odd_sum);
	}
	
	//program to check given num is positive or negative
	
	static void pos_neg_checker(int n) {
		if (n<0) {
			System.out.println("neg");
			
		} else {
			System.out.println("pos");

		}
	}
	
	//program to check the biggest of three numbers
	
	static void max_num(int n1,int n2,int n3) {
		if (n1>n2 && n1>n3) {
			System.out.println(n1+" is biggest");
		}
		else if (n2>n1 && n1>n3) {
			System.out.println(n2+" is biggest");
		}
		else {
			System.out.println(n3+" is biggest");
		}
			
	}
	
	//swapping
	static void swapp(int a,int b) {
		int temp;
		
		System.err.println("before ");
		System.err.println("a is "+a);
		System.err.println("b is "+b);
		temp=a;
		a=b;
		b=temp;
		System.err.println("after ");
		System.err.println("a is "+a);
		System.err.println("b is "+b);
		
		
		
	}
	
	//numbers divisible by 5
	static void num_div_by_5(int n) {
		for (int i = 0; i < n; i++) {
			if (i%5==0) {
				System.out.print(i+" ");				
			}
			
		}
		System.err.println();
	}
	
	//numbers are equal 
		static void check(int n,int n1) {
			if (n==n1) {
				System.err.println(true);
				
			}
			else {
				System.err.println(false);
			}
		}
		
		
		
//		sum upto a number using recusion
		
		
		static int sum_rec(int n) {
			       if (n==0) {
			    	   return n;
					
				}else {
					return n + sum_rec(n-1);
				}
			    
		}
		
		
		//program to extract digits from a given integer
		
		public static void extract_digits(int n) {
			String s = Integer.toString(n);
			System.out.println("Number "+n);
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i)+ " " );				
			}
			System.out.println();
		}
		
		public static void categorize(int height) {
			if (height>5.5) {
				System.out.println("Tall");
				
			}
			else if (height<5.5 && height>5) {
				System.out.println("Dwarf");
			}
			else {
				System.out.println("Average");
			}
		}
		public static void table(int n) {
			for (int i = 1; i < 11; i++) {
				System.out.println(n+"x"+i+"="+n*i);
			}
		}
		
		
		public static String d2b(int n) {
			if (n!=0) {
				int remainder = n%2;
				return (d2b(n/2)+""+remainder);
			}
			return "";
			
		}
		
		
		
	
//main method
	public static void main(String[] args) {
		even_odd_identifier(0);
		even_odd_identifier(12);
		even_odd_sum(6);
		
		pos_neg_checker(12);
		max_num(3, 5, 1);
		
		swapp(2, 1);
		num_div_by_5(	100);
		check(0, 1);
		System.out.println(sum_rec(5));
		extract_digits(12345);
		categorize(12);
		table(12);
		System.out.println(d2b(100));
	}
}
