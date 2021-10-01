import java.util.*;
import java.util.Scanner.*;
import java.io.*;

class maxmin {
   public int max(int [] A, int number) {
      int max = 0;
      for(int i=0; i<number; i++ ) {
         if(A[i]>max) {
            max = A[i];
         }
      }
      return max;
   }
   public int min(int [] A, int number) {
      int min = A[0];
     
      for(int i=0; i<number; i++ ) {
         if(A[i]<min) {
            min = A[i];
         }
      }
      return min;
   }
}
public class maxminele{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] A = new int[100];
		//int max=A[0];
		//int min=A[0];
		for(int i=0;i<number;i++){
			A[i]=sc.nextInt();
		}

		maxmin mm = new maxmin();
		int a = mm.max(A,number);
		int b = mm.min(A,number);
		System.out.println("Maximum Element:"+ a);
		System.out.println("Minimum Element:"+ b);
	}
}
