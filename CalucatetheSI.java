package com.Wipro.caliculationofEMI;

import java.util.Scanner;

public class CalucatetheSI {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the p");
    int p=scan.nextInt();
    System.out.println("Enter the R");
    int R=scan.nextInt();
    System.out.println("Enter the T");
    int T=scan.nextInt();
    System.out.println("Caluclatin of Si");
    int SI=(p*R*T)/100;
    System.out.println("Calcualation of SI" +SI);
	}

}
