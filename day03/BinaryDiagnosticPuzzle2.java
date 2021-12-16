////https://adventofcode.com/2021/day/3
package day03;
import java.util.*;
public class BinaryDiagnosticPuzzle2 {
    public static void main(String [] args)throws Exception{
        Scanner scan=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<String>();
        while(true) {
            String s=scan.next();
            if(s.equals("END"))
                break;
            al.add(s);
            
        }
        scan.close();
        int size=al.get(0).length();
        ArrayList<String> al2=new ArrayList<String>();
        al2.addAll(al);
        //finding oxygen generator rating 
        for(int i=0;i<size;i++) {
            int count1=0;
            int count2=0;
            for(int j=0;j<al.size();j++) {
                if(al.get(j).charAt(i)=='0')
                    count2++;
                else {
                  count1++;
              }
            }
            if(count2>count1){
            for(int j=0;j<al.size();j++) {
                if(al.get(j).charAt(i)=='1'){
                    al.remove(j);
                    j-=1;
                }
            }
        }
        else if(count2<=count1){
            for(int j=0;j<al.size();j++) {
                if(al.get(j).charAt(i)=='0'){
                   al.remove(j);
                   j-=1;
                }

            }
        }
        
            if(al.size()==1)
            break;
        }
        long decimal = Integer.parseInt(al.get(0), 2);

        size=al2.get(0).length();
        //finding CO2 scrubber rating
        for(int i=0;i<size;i++) {
            int count1=0;
            int count2=0;
            for(int j=0;j<al2.size();j++) {
                if(al2.get(j).charAt(i)=='0')
                    count2++;
                else {
                  count1++;
              }
            }
            if(count2>count1){
            for(int j=0;j<al2.size();j++) {
                if(al2.get(j).charAt(i)=='0'){
                    al2.remove(j);
                    j-=1;
                }
            }
        }
        else if(count2<=count1){
            for(int j=0;j<al2.size();j++) {
                if(al2.get(j).charAt(i)=='1'){
                   al2.remove(j);
                   j-=1;
                }

            }
        }
        
            if(al2.size()==1)
            break;
        }
        long decimal2 = Integer.parseInt(al2.get(0), 2);
        System.out.println("Output is "+decimal*decimal2);

    }
}
