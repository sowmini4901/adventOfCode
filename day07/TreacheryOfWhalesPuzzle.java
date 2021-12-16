package day07;
import java.util.*;
public class TreacheryOfWhalesPuzzle {
  
    public static void main(String [] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> al2=new ArrayList<Integer>();
        String arr[]=s.split(",");
        for(int i=0;i<arr.length;i++){
       al.add(Integer.parseInt(arr[i]));
       al2.add(Integer.parseInt(arr[i]));
        }
        scan.close();
    
    Collections.sort(al);
    
    int sub=0;
    int count=0;
    for(int i=0;i<al2.size();i++){
        int a=al.get(i);
        int n=Math.abs(a-sub);
        count+=(n*(n+1))/2;
    }
    System.out.println(count);
    int j=1;
    while(true){
         sub=j;
         int count1=0;
        for(int i=0;i<al2.size();i++){
            int a=al2.get(i);
            int n=Math.abs(a-sub);
            count1+=(n*(n+1))/2;
        }
        j++;
        System.out.println(count1);
       if(count1<=count)
       count=count1;
       else
       break;
    }
        
        System.out.println("Output is "+count);
        System.out.println("Output11 is "+j--);




       
    }  
}
