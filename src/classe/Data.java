package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada () {
		return String.format("%d/%d/%d", dia, mes, ano);
	}	
	Data (){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial,
			int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;					
	}

}
