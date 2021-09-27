package me.loule;

public class Main {
    public static void main(String[] args) {
        // Clear Console
        System.out.print("\033[H\033[2J");

        //////////////////////////////////////////
        /* Exercice Branchements Conditionnels */
        ////////////////////////////////////////
        System.out.println("-- ---- --");

        // Initialisez 2 variables entières et déterminez quelle est la valeur la plus petite des 2
        int entier1 = 50;
        int entier2 = 30;

        if (entier1 < entier2) {
            System.out.println("entier2 est la plus petite");
        } else {
            System.out.println("entier3 est la plus petite");
        }

        // Refaites l'exercice avec 3 variables
        int entier3 = 60;

        if (entier3 < entier2 && entier3 < entier1) {
            System.out.println("entier4 est la plus petite");
        } else if (entier2 < entier3 && entier2 < entier1) {
            System.out.println("entier3 est la plus petite");
        } else {
            System.out.println("entier2 est la plus petite");
        }

        // Initialisez 2 variables entières et déterminez si le résultat du produit est positif
        int entier4 = -3;
        int entier5 = -3;

        if (entier4 * entier5 > 0) {
            System.out.println("Le résultat est positif");
        } else {
            System.out.println("Le résultat est négatif");
        }

        // Initialisez une variable entière comme l'âge d'une personne et affichez un message si cette personne est majeure ou mineure
        int age = 18;

        if (age >= 18) {
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }

        // Faîtes l'exercice qui affiche la mention d'un bachelier en fonction de sa note
        int note = 15;

        if (note >= 16) {
            System.out.println("Vous avez la mention très bien");
        } else if (note >= 14) {
            System.out.println("Vous avez la mention bien");
        } else if (note >= 12) {
            System.out.println("Vous avez la mention assez bien");
        } else {
            System.out.println("Vous n'avez pas la mention");
        }

        // Initialisez une variable et affichez un message si la valeur est paire ou impaire
        int entier6 = 5;

        if (entier6 % 2 == 0) {
            System.out.println("La valeur est paire");
        } else {
            System.out.println("La valeur est impaire");
        }

        // Déterminez si la valeur d'une année est bissextile ou non. Une année est bissextile si elle satisfait une de ces 2 conditions (l’une OU l’autre)
        // 1. Est divisible par 4
        // 2. Est divisible par 100
        // 3. Est divisible par 400
        int annee = 2020;

        if (annee % 4 == 0 || annee % 100 == 0 || annee % 400 == 0) {
            System.out.println("L'année est bissextile");
        } else {
            System.out.println("L'année n'est pas bissextile");
        }

        // Déterminez si une date est correcte
        // 3 variables entières qui représentent les jour, mois et année d'une date

        int jour = 29;
        int mois = 2;

        // Utilisez le code précédent pour déterminer si au mois de *février il y a 28 ou 29 jours
        int mois_paire[] = {4, 6, 9, 11};
        boolean isPaire = false;
        boolean isValid = false;

        for (int i = 0; i < mois_paire.length; i++){
            if(mois_paire[i] == mois){
                isPaire = true;
            }
        }

        if (isPaire && jour <= 30) {
            isValid = true;
        } else if (mois == 2) {
            if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
                if (jour <= 29) {
                    isValid = true;
                }
            } else if(jour <= 28) {
                isValid = true;
            }
        } else if(jour <= 31) {
            isValid = true;
        }

        if(isValid){
            System.out.println("Votre date est valide");
        } else {
            System.out.println("Votre date est invalide");
        }
    }
}
