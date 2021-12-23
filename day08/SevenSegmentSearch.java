package day08;
import java.util.*;
public class SevenSegmentSearch {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int count=0;
   while(true){
       String s=scan.nextLine();
       if(s.equals("END"))
       break;
       String arr[]=s.split("\\|");
    //    for(int i=0;i<arr.length;i++){
    //        System.out.println(arr[i]);
    //    }
       String modified=arr[1];
    //    System.out.println(modified);
       String res[]=modified.split(" ");
    //    for(int i=0;i<res.length;i++){
    //           System.out.println(res[i]);
    //       }
  for(int i=0;i<res.length;i++){
      if(res[i].length()==2 || res[i].length()==3 || res[i].length()==4 || res[i].length()==7)
      count++;
  }
   }
        scan.close();


    System.out.println(count);
    }
}
