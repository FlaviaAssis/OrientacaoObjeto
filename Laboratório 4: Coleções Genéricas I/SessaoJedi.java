import java.util.*;

public class SessaoJedi{
  String nome;
  TreinadorJedi treinador;
  ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>();

  SessaoJedi(String nome, TreinadorJedi treinador){
    this.nome = nome;
    this.treinador = treinador;
  }

  public void addIniciado(IniciadoJedi iniciado){
    int posicaoIniciado;
    posicaoIniciado = iniciados.indexOf(iniciado);

    if(posicaoIniciado == -1){
      iniciados.add(iniciado);
    }
  }

  public IniciadoJedi getIniciado(String nome){
    int posicaoIniciado;
    posicaoIniciado = iniciados.indexOf(nome);
    IniciadoJedi  atual;

    Iterator<IniciadoJedi> iterator = iniciados.iterator();
    while (iterator.hasNext()) {
       atual = iterator.next();
      if(atual.nome == nome){
        return atual;
      }
    }

    return null;
  }

  public double getMediaAnoNascimento(){
    double media;
    int total = 0, tamanho = iniciados.size();
    IniciadoJedi  atual;

    Iterator<IniciadoJedi> iterator = iniciados.iterator();
    while (iterator.hasNext()) {
      atual = iterator.next();
      total = total + atual.anoNascimento;
    }

    media = (double)(total/tamanho);

    return media;
  }

  public String getDescricao(){
  /*  --> SESSÃO Instruções de Uso da Força (Treinador: Grão-Mestre Fae Coven)
  - Iniciado 1: Katooni (especie=Tholothian, nascimento=23 ABY)
  - Iniciado 2: Byph (especie=Ithorian, nascimento=21 ABY)
  - Iniciado 3: Gungi (especie=Wookiee, nascimento=23 ABY)
  - Iniciado 4: Petro (especie=Human, nascimento=22 ABY)*/

  String str;
  IniciadoJedi  atual;
  int i = 1;

  str = "--> SESSÃO "+this.nome+" (Treinador: "+treinador.getDescricao()+")\n";

  Iterator<IniciadoJedi> iterator = iniciados.iterator();
  while (iterator.hasNext()) {
    atual = iterator.next();
    str = str + "  - Iniciado "+i+": "+atual.getDescricao()+"\n";
    i++;
  }

  return str;
  }


}
