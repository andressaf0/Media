package Stategy;

public class Aritmetica implements ICalcMedia {

	@Override
	public double CalculaMedia(double nota1, double nota2) {
		return ((nota1+nota2)/2);
	}

	@Override
	public String Situacao(double media) {
		return (media <=5)?"Reprovado": "Aprovado";
	}

}
