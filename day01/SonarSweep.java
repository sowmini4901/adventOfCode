package day01;
import java.util.*;
import java.io.*;
public class SonarSweep {
  public static void main(String [] args) {
	  Scanner scan=new Scanner(System.in);
	  int prev=scan.nextInt();
	  int count=0;
	  
	  while(true) {
		  int a=scan.nextInt();
		  if(a>prev) {
			  count++;
		  }
		  prev=a;
		  if(a==5881)
			  break;
	  }
	System.out.println("Output is "+count);
  }
}