package Td1;

import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int premierNombre = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int deuxiemeNombre = scanner.nextInt();

        System.out.print("Entrez le troisième nombre : ");
        int troisiemeNombre = scanner.nextInt();

        int maximum = premierNombre;

        if (deuxiemeNombre > maximum) {
            maximum = deuxiemeNombre;
        }

        if (troisiemeNombre > maximum) {
            maximum = troisiemeNombre;
        }

        System.out.println("Le maximum des trois nombres est : " + maximum);


        scanner.close();
    }
    }



