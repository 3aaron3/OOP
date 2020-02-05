import java.util.Scanner;

class cur{
 public static void main(String[]args)
 {
  double usd=0;
     int euro=0;
     Scanner i=new Scanner (System.in);
     System.out.println("Enter currency type");
     String curt=i.nextLine();
     Scanner j=new Scanner (System.in);
     System.out.println("Enter currency value");
     int cur=j.nextInt();
     if(curt.equals("usd"))
     {
        usd=cur/181;
        System.out.println(usd);
     }else if(curt.equals("euro"))
     {
        euro=cur/181;
        System.out.println(euro);
     }
    
     for(char k='a';k<='z';k++
     {
        int  g=k;
     System.out.println(k+" :"+Integer.toBinaryString(g));
     }

}
}