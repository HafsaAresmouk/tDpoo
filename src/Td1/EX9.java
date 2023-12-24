package Td1;

import java.util.Scanner;

public class EX9
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Entrez la première variable : ");
            int var1 = scanner.nextInt();

            System.out.print("Entrez la deuxième variable : ");
            int var2 = scanner.nextInt();


            if (var1 > var2) {
                int temp = var1;
                var1 = var2;
                var2 = temp;
            }


            System.out.println("Les variables dans l'ordre croissant sont : " + var1 + ", " + var2);
        }




}
