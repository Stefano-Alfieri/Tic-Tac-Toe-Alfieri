package org.generation.italy;

import java.util.Scanner;

public class TrisAlfieri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] tris = new String[3][3];
		int nr, nc;
		int contatore = 0;
		boolean mossaG1;
		boolean mossaG2;
		String vincitore = "Pareggio";

		// inizializzazione campo di tris
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				tris[i][j] = " ";
			}
		System.out.println("Inizio partita di Tris");
		do {
			// mossa g1
			do {
				mossaG1=false;
				System.out.println("Inserire la mossa del giocatore 1 (prima la riga poi la colonna):");
				nr = sc.nextInt();
				nc = sc.nextInt();
				if (nr <= 2 && nc <= 2) {
					if (tris[nr][nc].equalsIgnoreCase(" ")) {
						tris[nr][nc] = "x";
						contatore++;
						mossaG1 = true;
					} else
						System.out.println("posizione occupata, inserire una posizione valida");
				} else
					System.out.println("posizione non valida, inserire una posizione valida");
			} while (mossaG1 == false);
			// stampa campo da tris
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(tris[i][j]);
				}
				System.out.println();
			}
			//inizio condizioni vittoria g1
			for (int i=0; i<=2; i++) {
				if(tris[i][0].equals(tris[i][1])&&tris[i][0].equals(tris[i][2])&&tris[i][0].equals("x")) {
					vincitore = "Giocatore1";
				}
			}	
			for (int j=0; j<=2; j++) {
				if(tris[0][j].equals(tris[1][j])&&tris[0][j].equals(tris[2][j])&&tris[0][j].equals("x")) {
					vincitore = "Giocatore1";
				}
			}
			if((tris[0][0].equals(tris[1][1])&&tris[0][0].equals(tris[2][2])&&tris[0][0].equals("x"))||(tris[0][2].equals(tris[1][1])&&tris[0][0].equals(tris[2][0]))&&tris[0][2].equals("x")){
				vincitore = "Giocatore1";
			}
			if(vincitore.equalsIgnoreCase("giocatore1")||contatore==9) {
				break;
			}
			
			// mossa g2
			do {
				mossaG2=false;
				System.out.println("Inserire la mossa del giocatore 2 (prima la riga poi la colonna):");
				nr = sc.nextInt();
				nc = sc.nextInt();
				if (nr <= 2 && nc <= 2) {
					if (tris[nr][nc].equalsIgnoreCase(" ")) {
						tris[nr][nc] = "o";
						contatore++;
						mossaG2 = true;
					} else
						System.out.println("posizione occupata, inserire una nuova mossa");
				} else
					System.out.println("posizione non valida, inserire una posizione valida");
			} while (mossaG2 == false);
			
			// fine mossa g2
			// stampa campo da tris
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(tris[i][j]);
				}
				System.out.println();
			}
			
			//inizio condizioni vittoria g2
			for (int i=0; i<=2; i++) {
				if(tris[i][0].equals(tris[i][1])&&tris[i][0].equals(tris[i][2])&&tris[i][0].equals("o")) {
					vincitore = "Giocatore2";
				}
			}	
			for (int j=0; j<=2; j++) {
				if(tris[0][j].equals(tris[1][j])&&tris[0][j].equals(tris[2][j])&&tris[0][j].equals("o")) {
					vincitore = "Giocatore2";
				}
			}
			if((tris[0][0].equals(tris[1][1]) && tris[0][0].equals(tris[2][2]) && tris[0][0].equals("o")) || (tris[0][2].equals(tris[1][1]) && tris[0][2].equals(tris[2][0]) && tris[0][2].equals("o"))) {
			    vincitore = "Giocatore2";
			}
			if(vincitore.equalsIgnoreCase("giocatore2")||contatore==9) {
				break;
			}
			
		} while (contatore < 9);
		if (vincitore.equalsIgnoreCase("giocatore1")||vincitore.equalsIgnoreCase("giocatore2")) {
			System.out.println("Il vincitore è "+vincitore);
		}else if (vincitore.equalsIgnoreCase("pareggio")) {
			System.out.println("la partita è terminata in "+vincitore);
		}
	}// fine main

}
