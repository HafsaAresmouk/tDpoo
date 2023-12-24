package Td1;

import java.util.Scanner;

public class EX8
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int  mois,annee;


            do {
                System.out.print("Entrez le numéro du mois (1-12) : ");
                mois = scanner.nextInt();
            } while (mois < 1 || mois > 12);


            do {
                System.out.print("Entrez l'année (1900-2100) : ");
                annee = scanner.nextInt();

            }while (annee < 1900 || annee > 2100);
            if (mois==1|| mois==3|| mois==5|| mois==7|| mois==8|| mois==10|| mois==12){
                System.out.println("le nombre des jours dans ce moi est 31");
            }
            else  if (mois==4| mois==6|| mois==9|| mois==11){
                System.out.println("le nombre des jours dans ce moi est 30");
            }
            else {
                if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {System.out.println("l annee ess bissexel ");
                    System.out.println("le nombre des jours de fevrier est 29");}
                else  {System.out.println("l annee n est pas bissexel  ");
                    System.out.println("le nombre des jours de fevrier est 28");}
            }

            int joursDansMois = 0;

            switch (mois) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    joursDansMois = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    joursDansMois = 30;
                    break;
                case 2:
                    if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                        joursDansMois = 29; // Année bissextile
                    } else {
                        joursDansMois = 28;
                    }
                    break;
            }

            System.out.println("Le mois " + mois + " de l'année " + annee + " a " + joursDansMois + " jours.");
        }
    }




