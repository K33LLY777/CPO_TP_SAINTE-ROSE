/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author saint
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaration des variables
       int nb; // nombre d'entiers à additionner
       int result; // resultat
       int ind; // indice
       nb=5;
       result=0;
       
       // Addition des nb premiers
       ind=1;
       while (result <= nb) {
           result=result+ind;
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
sc.nextInt(); // On demande a sc de donner le prochain entier
       }
       
       // Affichage du resultat
       System.out.println();
       System.out.println("La somme des "+ nb + "entiers est: "+result);
       }

    }
    

