public class Carro{

	String marca;
  String modelo;
  Proprietario proprietario;
  Placa placa;
  Motor motor;


	Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor){
		this.marca = marca;
    this.modelo = modelo;
    this.proprietario = proprietario;
    this.placa = placa;
    this.motor = motor;

	}

	public String getDescricao(){
    /*Carro DeLorean/DMC-12.
    Proprietario: nome=Emmett L. Brown, cnh=98008173,anoNascimento=1920.
    Placa: placa=OAT-3966, tipo=Colecionador,estacionamentoLivre=false.
    Motor: tipo=Gasolina, capacidade=2.85L, potencia=130CV.*/

		String descricao;

		descricao = ("Carro "+this.marca+"/"+this.modelo+". "+this.proprietario.getDescricao()+" "+this.placa.getDescricao()+" "+this.motor.getDescricao());

		return descricao;
	}

}
