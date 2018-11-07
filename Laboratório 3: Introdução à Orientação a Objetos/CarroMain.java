public class CarroMain{

	public static void main(String[] args) {

		Proprietario proprietario1 = new Proprietario("Emmett L. Brown",98008173,1920);

		System.out.println(proprietario1.getDescricao());

		Placa placa1 = new Placa("OOA",1);
		String tipo,descricao_motor;
		boolean estacionamento;

		System.out.println(placa1.getDescricao());

		Placa pl = new Placa("NAN-8192", 6);
		System.out.println(pl.getDescricao());

		Motor motor1 = new Motor(1,2.85,130);

		descricao_motor = motor1.getDescricao();

		System.out.println(descricao_motor);

		Carro carro1 = new Carro("DeLorean","DMC-12", proprietario1, placa1, motor1);

		System.out.println(carro1);
	}

}
