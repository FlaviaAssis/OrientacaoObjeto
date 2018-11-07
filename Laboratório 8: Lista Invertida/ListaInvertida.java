import java.util.Hashtable;
import java.util.LinkedList;

class ListaInvertida{

	private Hashtable<String, LinkedList<String>> tabela;

	public ListaInvertida(){
		tabela = new Hashtable<String, LinkedList<String>>();
	}

	public LinkedList<String> busca(String palavra){
		LinkedList<String> p;

		p = tabela.get(palavra);

		return p;

	}

	public boolean insere(String palavra, String documento){

		LinkedList<String>  p;
		boolean d;
		int indice;

		p = busca(palavra);

		if(p != null){

			d = p.contains(documento);

			if(d == false){
				p.addLast(documento);
				return true;
			} else {
				return false;
			}

		} else {

			p = new LinkedList<String>();
			p.addLast(documento);
			tabela.put(palavra,p);
			return true;
		}
	}


	public String toString(){
		String s;

		s = tabela.toString();

		return s;
	}

}
