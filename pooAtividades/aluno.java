/*
 Aluno: Vinicius Magnus 
 Turma: 3-53
*/

package pooAtividades;

public class aluno {
	String nome;
	int idade;
	double media, nt1, nt2, nt3, nt4;

	public static double calcularedia(double nt1, double nt2, double nt3, double nt4) {
		double media;
		media = (nt1 + nt2 + nt3 + nt4);
		media = (media / 4);
		return media;
	}
}
