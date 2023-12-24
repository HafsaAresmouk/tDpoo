package Td1;

import java.util.Scanner;

public class Ex3
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez le premier nombre entier (a) : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le deuxième nombre entier (b) : ");
            int b = scanner.nextInt();

            System.out.println("Choisissez une option :");
            System.out.println("1. Vérifier si la somme a + b est paire");
            System.out.println("2. Vérifier si le produit ab est pair");
            System.out.println("3. Connaître le signe de la somme a + b");
            System.out.println("4. Connaître le signe du produit ab");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    boolean sommePaire = (a + b) % 2 == 0;
                    System.out.println("La somme a + b est paire : " + sommePaire);
                    break;
                case 2:
                    boolean produitPaire = (a * b) % 2 == 0;
                    System.out.println("Le produit ab est pair : " + produitPaire);
                    break;
                case 3:
                    String signeSomme = (a + b > 0) ? "positif" : (a + b < 0) ? "négatif" : "nul";
                    System.out.println("Le signe de la somme a + b est " + signeSomme);
                    break;
                case 4:
                    String signeProduit = (a * b > 0) ? "positif" : (a * b < 0) ? "négatif" : "nul";
                    System.out.println("Le signe du produit ab est " + signeProduit);
                    break;
                default:
                    System.out.println("Option invalide.");
            }
            scanner.close();
        }

    }




