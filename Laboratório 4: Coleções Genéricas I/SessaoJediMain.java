public class SessaoJediMain{

  public static void main(String[] args) {

    IniciadoJedi ini;

    IniciadoJedi iniciado1 = new IniciadoJedi("Katooni","Tholothian",-23);
    System.out.println(iniciado1.getDescricao());

    IniciadoJedi i1 = new IniciadoJedi("Ashla", "Togruta", -23);
    System.out.println(i1.getDescricao());

    TreinadorJedi treinador1 = new TreinadorJedi("Grão-Mestre","Fae Coven");
    System.out.println(treinador1.getDescricao());

    SessaoJedi sessao1 = new SessaoJedi("NomeTeste",treinador1);
    sessao1.addIniciado(iniciado1);
    sessao1.addIniciado(i1);
    ini = sessao1.getIniciado("Katooni");
    System.out.println();
    System.out.println(ini.getDescricao());

    System.out.println(sessao1.getDescricao());
  }
}
