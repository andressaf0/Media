package Stategy;

public class Disciplina {

	private ICalcMedia CalcMedia;
	public double Media;
	private String Nome;
	private double P1;
	private double P2;
	public String Situacao;

	public Disciplina(ICalcMedia CalcMedia, String Nome, double P1, double P2) {
		this.CalcMedia = CalcMedia;
		this.Nome = Nome;
		this.P1 = P1;
		this.P2 = P2;

	}
	public void CalcularMedia() {
		double resultado=this.CalcMedia.CalculaMedia(this.P1, this.P2);
	this.Media=resultado;
	this.Situacao=this.CalcMedia.Situacao(resultado);
	
	}
	public String getNome() {
		return this.Nome;
	}
}
