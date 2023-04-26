package Stategy;

public class Main {

	public static void main(String[] args) {
		Disciplina disciplina1=new Disciplina(new Aritmetica(), "Wesley", 8, 2);
		disciplina1.CalcularMedia();
		System.out.println(disciplina1.getNome());
		System.out.println(disciplina1.Media);
		System.out.println(disciplina1.Situacao);
		
		Disciplina disciplina2=new Disciplina(new Geometrica(), "Wesley", 8, 2);
		disciplina2.CalcularMedia();
		System.out.println(disciplina2.getNome());
		System.out.println(disciplina2.Media);
		System.out.println(disciplina2.Situacao);
	}

}
