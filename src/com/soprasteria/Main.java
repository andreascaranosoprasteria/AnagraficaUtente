package com.soprasteria;

import java.util.Scanner;

public class Main {
	/*
	 * Nome repo: AnagraficaUtenteinserire i seguenti dati relativi ad un utente,
	 * scegliendo il tipo di variabili più adatto per ogni dato: -nome -cognome -età
	 * -luogo di nascita -altezza (in metri) -possesso patente (vero/falso) -genere
	 * (M/F/A) visualizzare poi i dati inseriti, formattandoli opportunamente
	 */

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Utente user = new Utente(); // CREO ED ISTANZIO L'OGGETTO user DELLA CLASSE Utente

		// FASE DI ACQUISIZIONE DATI DA PARTE DELL'UTENTE

		System.out.println(">>Inserisci nome:");
		user.nome = input.nextLine().toUpperCase();
		System.out.println(">>Inserisci cognome:");
		user.cognome = input.nextLine().toUpperCase();
		System.out.println(">>Inserisci età:");
		user.eta = Integer.parseInt(input.nextLine());
		System.out.println(">>Genere [M],[F],[A]");
		user.genere = input.nextLine();
		System.out.println(">>Possiedi la patente? [Y],[N]");
		user.impostaPatente(input.nextLine().toUpperCase());
		
		System.out.println(user.toString());
		
		//CHIUSURA DEL FLUSSO
		input.close();
		
	}

}

class Utente {
	public String nome;
	public String cognome;
	public int eta;
	public String luogoNascita = "xxxx-xxxx-xxxx";
	public String genere;
	public boolean patente;

	// Metodo costruttore della classe
	public Utente() {
	}

	public void impostaPatente(String response) {
		if (response.equals("Y"))
			patente = true;
		else if (response.equals("N"))
			patente = false;
		else
			System.out.println("<!>Dati inseriti dati non validi<!>");
	}

	@Override
	public String toString() {
		return "NOME: " + nome + "\tCOGNOME: " + cognome + "\nGENERE: " + genere + "\tNATO A: " + luogoNascita
				+ "\nETA':" + eta + "\nPATENTE: " + patente;
	}
}
