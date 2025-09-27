package executavel;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Diretor;
import model.Pessoa;
import model.Secretatio;

public class executavel {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();		
		aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno:"));
		
		Diretor diretor = new Diretor();
		diretor.setNome(JOptionPane.showInputDialog("Qual o nome do Diretor:"));
		
		Secretatio secretario = new Secretatio();
		secretario.setNome(JOptionPane.showInputDialog("Qual o nome do Secretario:"));
		
		System.out.println(aluno.getNome());
		System.out.println(diretor.getNome());
		System.out.println(secretario.getNome());
		
		System.out.println("-----------------------");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println("-----------------------");
		
		System.out.println(aluno.maiorIdade());
		System.out.println(diretor.maiorIdade());
		System.out.println(secretario.maiorIdade());
		
		System.out.println("-----------------------");
		
		/* Polimorfismo */
		Pessoa pessoa = new Aluno(); /* pessoa é um aluno */
		funcaoPessoa(pessoa);
		
		pessoa = secretario; /* pessoa agora é um secretario */
		funcaoPessoa(pessoa);
		
		pessoa = diretor; /* pessoa agora é um diretor */
		funcaoPessoa(pessoa);
		
	}
	
	public static void funcaoPessoa(Pessoa pessoa) {
		System.out.println(pessoa.salario());
	}

}
