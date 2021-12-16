package day07;
import java.util.*;
public class TreacheryOfWhales {
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
    
    int sub=al.get(0);
    int count=0;
    for(int i=0;i<al2.size();i++){
        int a=al.get(i);
        count+=Math.abs(a-sub);
    }
    int j=1;
    while(true){
         sub=al.get(j);
         int count1=0;
        for(int i=0;i<al2.size();i++){
            int a=al2.get(i);
            count1+=Math.abs(a-sub);
        }
        j++;
       if(count1<=count)
       count=count1;
       else
       break;
    }
        
        System.out.println("Output is "+count);
        System.out.println("Output11 is "+al.get(j--));




       
    }
}
