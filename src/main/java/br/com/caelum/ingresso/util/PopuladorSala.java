package br.com.caelum.ingresso.util;

public class PopuladorSala {
	public static void main(String[] args) {
		int idLugar = 1;
		for (char fileira = 'A'; fileira<='O' ; fileira++ ) {
			for (int posicao = 1 ; posicao<=24 ; posicao++) {
				System.out.println("insert into Lugar values ("+idLugar+", '"+fileira+"', "+posicao+");");
				System.out.println("insert into Sala_Lugar values (33, "+idLugar+");");
				idLugar++;
			}
		}
	}
}
