package teste;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		usandoEnum();
	}
	
	private static void usaEnum(DiaSemana dia) {
		String diaSem = "";
		switch (dia) {
			case SEGUNDA:
				diaSem = "Segunda-Feira";
				break;
			case TERCA:
				diaSem = "Terça-feira";
				break;
			case QUARTA:
				diaSem = "Quarta-feira";
				break;
			case QUINTA:
				diaSem = "Quinta-feira";
				break;
			case SEXTA:
				diaSem = "Sexta-feira";
				break;
			case SABADO:
				diaSem = "Sábado";
				break;
			case DOMINGO:
				diaSem = "Domingo";
				break;
		}
		
		System.out.println(diaSem);
	}
	
	private static void usandoEnum() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste realizado usando ENUM");
		
		usaEnum(segunda);
		usaEnum(terca);
		usaEnum(quarta);
		usaEnum(quinta);
		usaEnum(sexta);
		usaEnum(sabado);
		usaEnum(domingo);
	}

}
