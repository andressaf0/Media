package Stategy;

public class Geometrica implements ICalcMedia {

	@Override
	public double CalculaMedia(double nota1, double nota2) {
		return (Math.sqrt(nota1*nota2));
	}

	@Override
	public String Situacao(double media ) {
		return ( media <=7)?"Reprovado": "Aprovado";
	}

}
