package jadfocus;

import java.util.Scanner;
/*
    *
   ---
  *****
 -------
*********
 -------
  *****
   ---
    *
 */
public class pattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int space=rows/2,count=1;
        for(int i=0;i<=rows/2;i++) {
            for(int j=i;j<space;j++)
                System.out.print(" ");
            for(int k=0;k<count;k++) {
                if(i%2==0)
                    System.out.print("*");
                else
                    System.out.print("-");
            }
            System.out.println();
            count=count+2;
        }
        count=count-2;
        for(int i=0;i<rows/2;i++) {
            for(int j=0;j<=i;j++)
                System.out.print(" ");
            count=count-2;
            for(int k=0;k<count;k++) {
                if(i%2==0)
                    System.out.print("-");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
