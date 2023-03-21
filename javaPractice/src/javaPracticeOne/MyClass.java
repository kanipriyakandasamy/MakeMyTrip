package javaPracticeOne;

public class MyClass {
 public static void main(String[] args) {
   int num = 5;
   int f = 1;
   for(int i=1; i <= num; i++) {
//	   int f = num - i;
	   f = f * i;
	   System.out.println(f);
   }
   System.out.println(f);
   
}
}
