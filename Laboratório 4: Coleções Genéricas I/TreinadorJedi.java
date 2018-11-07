public class TreinadorJedi{
  String titulacao;
  String nome;

  TreinadorJedi(){
  }

  TreinadorJedi(String titulacao, String nome){
    this.titulacao = titulacao;
    this.nome = nome;
  }

  public String getDescricao(){
    //Grão-Mestre Fae Coven
    String str;
    str = this.titulacao+" "+this.nome;

    return str;
  }

}
