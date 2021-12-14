////https://adventofcode.com/2021/day/3
package day03;
import java.util.*;
public class BinaryDiagnostic {
    public static void main(String [] args) {
        Scanner scan=new Scanner(System.in);
        List<List<Integer>> al=new ArrayList<List<Integer>>();
        while(true) {
            String s=scan.next();
            if(s.equals("END"))
                break;
            ArrayList<Integer> al1=new ArrayList<Integer>();
            for(int i=0;i<s.length();i++) {
                al1.add(s.charAt(i)-'0');
            }
            al.add(al1);
            
        }
        scan.close();
        int size=al.get(0).size();
        String s="";String t="";
        for(int i=0;i<size;i++) {
            int count1=0;
            int count2=0;
            for(int j=0;j<al.size();j++) {
                if(al.get(j).get(i)==0)
                    count2++;
                else {
                  count1++;
              }
            }
            if(count1>count2) {
                s+="1";
                t+="0";
            }
            else {
              s+="0";
              t+="1";
          }
        }
        long decimal = Integer.parseInt(s, 2);
        long decimal2 = Integer.parseInt(t, 2);
        System.out.println("Output is "+decimal*decimal2);
    }
}
