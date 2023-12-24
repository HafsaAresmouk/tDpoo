package Td1;

import java.util.Scanner;

public class EX10
{
        public static void main(){
            Scanner entiere = new Scanner(System.in);
            System.out.println("entrez N");
            int n = entiere.nextInt();
            double factn=1,somn=0;

            for (int i=1;i<=n;i++){
                factn=factn*i;



            }
            int i=1;
            while((n%2!=0)&&(i<n)){
                somn=somn+i;
                i++;
            }
            System.out.println("la sommeest" +somn);
            System.out.println("le factoriel de n"+factn);
        }



}
