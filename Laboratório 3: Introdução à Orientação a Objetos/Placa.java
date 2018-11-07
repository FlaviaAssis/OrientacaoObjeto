public class Placa{

	String placa;
	int tipo;

	Placa(){
		this("",0);
	}

	Placa(String placa, int tipo){
		this.placa = placa;
		this.tipo = tipo;
	}

	public String getTipoString(){

		String tipo;

		//1=Normal, 2=Servico, 3=Oficial, 4=Auto Escola, 5=Prototipo, 6=Colecionador, qualquer outro=Outros

		 switch (this.tipo) {
            case 1:
                tipo = "Normal";
                break;
            case 2:
                tipo = "Servico";
                break;
            case 3:
                tipo = "Oficial";
                break;
            case 4:
                tipo = "Auto Escola";
                break;
            case 5:
               tipo = "Prototipo";
                break;
            case 6:
                tipo = "Colecionador";
                break;
            default:
                tipo = "Outros";
         }

         return tipo;
	}

	public boolean temEstacionamentoLivre(){

		if(this.tipo == 2 || this.tipo == 3){
			return true;
		}

		return false;
	}

	public String getDescricao(){
		//Placa: placa=OAT-3966, tipo=Colecionador, estacionamentoLivre=false.

		String descricao;

		descricao = ("Placa: placa="+this.placa+", tipo="+this.getTipoString()+", estacionamentoLivre="+this.temEstacionamentoLivre()+".");

		return descricao;
	}
	
}