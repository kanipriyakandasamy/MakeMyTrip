package javaPracticeOne;

public class Employee {
  public static void main(String[] args) {
	
	  int a[] = new int[5];
	  a[0] = 1;
	  a[1] = 2;
	  a[2] = 3;
	  a[3] = 4;
	  a[4] = 5;
	 
	  
	  for(int i = 0; i < a.length; i++) {
		  System.out.println(a[i]);
	  }
	  
	  int[] b = new int[2];
	  b[0] = 2;
	  System.out.println(b[0]);
	  
	  int []c = new int[3];
	  c[0]=5;
	  System.out.println(c[0]);
	  
	  System.out.println();
	  int[] d = {12,23,445,55666};
	  for(int i=0; i<d.length;i++) {
		  System.out.println(d[i]);
	  }
	  
}
}
