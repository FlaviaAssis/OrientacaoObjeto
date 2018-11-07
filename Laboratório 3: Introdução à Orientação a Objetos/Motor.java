public class Motor{

	double capacidade;
	int tipo;
  int potencia;

	Motor(){
		this(0,0,0);
	}

	Motor(int tipo, double capacidade, int potencia){
		this.tipo = tipo;
		this.capacidade = capacidade;
    this.potencia = potencia;

	}

	public String getTipoString(){

		String tipo;

		//1=Normal, 2=Servico, 3=Oficial, 4=Auto Escola, 5=Prototipo, 6=Colecionador, qualquer outro=Outros

		 switch (this.tipo) {
            case 1:
                tipo = "Gasolina";
                break;
            case 2:
                tipo = "Alcool";
                break;
            case 3:
                tipo = "Flex";
                break;
            case 4:
                tipo = "Diesel";
                break;
            case 5:
               tipo = "Eletrico";
                break;
            default:
                tipo = "Outros";
         }

         return tipo;
	}

	public String getDescricao(){
		//Motor: tipo=Gasolina, capacidade=2.85L, potencia=130CV.

		String descricao;

		descricao = ("Motor: tipo="+this.getTipoString()+", capacidade="+this.capacidade+"L, potencia="+this.potencia+"CV.");

		return descricao;
	}

}
