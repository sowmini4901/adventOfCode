package day06;
import java.util.*;
public class LanternFish {
    public static void main(String [] args) {
        Scanner scan=new Scanner(System.in);
       String s=scan.next();
       ArrayList<Integer> al=new ArrayList<Integer>();
       String arr[]=s.split(",");
       for(int i=0;i<arr.length;i++){
      al.add(Integer.parseInt(arr[i]));
       }
       for(int i=0;i<80;i++){
           int count=0;
           for(int j=0;j<al.size();j++){
                if(al.get(j)!=0){
                    int a=al.get(j);
                    al.set(j,a-1);
                }
                else{
                    al.set(j,6);
                    count++;
                }
           }
           while(count!=0){
               al.add(8);
               count--;
           }
        //    for(int j=0;j<al.size();j++){
        //        System.out.print(al.get(j)+" ");
        //    }
        //    System.out.println();
       }
      System.out.println("Output is "+al.size());

        scan.close();
    }
}
