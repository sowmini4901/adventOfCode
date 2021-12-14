//https://adventofcode.com/2021/day/1
package day01;
import java.util.*;
public class SonarSweepPuzzle2 {
    public static void main(String [] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
    
        int sum=a+b+c;
      ArrayList<Integer> al=new ArrayList<Integer>();
      ArrayList<Integer> al2=new ArrayList<Integer>();
      al2.add(a);
      al2.add(b);
      al2.add(c);
      int i=0;
        while(true) {
            al.add(sum);
            sum-=al2.get(i);
            int res=scan.nextInt();
            sum+=res;
            al2.add(res);
            i++;
            if(res==5881) {
                al.add(sum);
                break;
            }
        }
        int count=0;
  scan.close();
        for(i=0;i<al.size()-1;i++) {
            if(al.get(i+1)>al.get(i))
                count++;
        }
        System.out.println("The Output is "+count);
    }
}
