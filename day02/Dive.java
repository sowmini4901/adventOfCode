//https://adventofcode.com/2021/day/2
package day02;
import java.util.*;
public class Dive {
    public static void main(String [] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        long length=0;
        long depth=0;
        
        while(true) {
            String s=scan.nextLine();
            
            if(s.contains("forward")) {
                length+=Integer.valueOf(s.substring(8,s.length()));
            }
            else if(s.contains("down")) {
                depth+=Integer.valueOf(s.substring(5,s.length()));
            }
            else if(s.contains("up")){
                depth-=Integer.valueOf(s.substring(3,s.length()));
            }
            if(s.equals("END"))
                break;
        }
       scan.close();
        System.out.println("Output is "+length*depth);
    }
}