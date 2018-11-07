import java.io.*;
class GoogleMain{
	public static void main(String[] args) {

		ListaInvertida lista = new ListaInvertida();

		lista.insere("Palavra1","documento1");
		lista.insere("Palavra1","documento2");
		lista.busca("Palavra1");
		System.out.println(lista);
		lista.toString();

		}
}
