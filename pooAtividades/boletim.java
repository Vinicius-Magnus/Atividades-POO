/*
Aluno: Vinicius Magnus 
Turma: 3-53
*/

package pooAtividades;

public class boletim {
	public static void main(String[] args) {
		aluno a1 = new aluno();
		a1.nome = "Marcos";
		a1.nt1 = 6.5;
		a1.nt2 = 8.5;
		a1.nt3 = 9;
		a1.nt4 = 10;
		a1.media = calcularmedia(a1.nt1, a1.nt2, a1.nt3, a1.nt4);

		professor p1 = new professor();
		p1.nomeprofessor = "Luis";
		p1.id = 40;
		p1.disciplina = "Matematica";

		System.out.println("A média do aluno " + a1.nome + " foi de " + a1.media
				+ " em " + p1.disciplina + " com o professor " + p1.nomeprofessor + "!");

	}

	public static double calcularmedia(double nt1, double nt2, double nt3, double nt4) {

		double media;
		media = (nt1 + nt2 + nt3 + nt4);
		media = (media / 4);
		return media;
	}
}
