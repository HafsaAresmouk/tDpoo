package Td1;

import java.util.Scanner;

public class Ex6
{
        public static void main(String[] args) {
            Scanner nombre = new Scanner(System.in);
            System.out.println("donner a et b ");
            int a= nombre.nextInt();
            int b = nombre.nextInt();
            if(a>0)
            { if (b>0) System.out.println("le produit ab est positif");
                if (b<0) System.out.println("le produit ab est negative");

            }
            else if (a<0)
            { if (b>0) System.out.println("le produit ab est negative");
                if (b<0) System.out.println("le produit ab est positive");

            }
            else System.out.println("le produit null");
        }
    }


