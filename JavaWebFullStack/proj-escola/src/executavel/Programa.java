package executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import constante.StatusAluno;
import model.Aluno;
import model.Disciplina;
import model.Secretatio;

public class Programa {
	
	/* Programa Escolar */
	public static void main(String[] args) {
		
		List<Aluno> listAlunos = new ArrayList<Aluno>();
		Secretatio secretario = new Secretatio();
		int qtdDisc = 0;
		int qtdAluno = 1;
		int remover;
		
		secretario.setLogin(JOptionPane.showInputDialog("Informe o Login:"));
		secretario.setSenha(JOptionPane.showInputDialog("Informe a Senha:"));
		
		if(secretario.autenticar()) {
			
			do {
				
				String entrada = JOptionPane.showInputDialog("Quantos alunos deseja inserir? ");
				
				if(entrada != null && entrada.matches("\\d+")) {
					qtdAluno = Integer.parseInt(entrada);
				}
				
				if(entrada == null) {
					JOptionPane.showMessageDialog(null, "Será adicionando somente 1 aluno.");
				} else {
					JOptionPane.showMessageDialog(null, "Será adicionando " + qtdAluno + " aluno(s).");
				}
				
			} while(qtdAluno < 1);
			
			
			for(int qtd = 1; qtd <= qtdAluno; qtd++) {
				
				Aluno aluno = new Aluno();
				
				aluno.setNome(JOptionPane.showInputDialog("Qual o nome do " + qtd + " aluno:"));
				aluno.setnEscola(JOptionPane.showInputDialog("Qual o nome da Escola " + qtd + " aluno:"));
				qtdDisc = Integer.valueOf(
					JOptionPane.showInputDialog("Quantas Disciplinas para o aluno " + aluno.getNome() +":")
				);
				
				for(int pos = 1; pos <= qtdDisc; pos++) {
					
					Disciplina disciplina = new Disciplina();
					
					disciplina.setDisciplina(
						JOptionPane.showInputDialog("Qual o nome da Disciplina " + pos + " de " + qtdDisc +": ")
					);
					
					disciplina.setNota(
						Double.valueOf(
							JOptionPane.showInputDialog("Qual nota para disciplina " + disciplina.getDisciplina() + ":")
						)
					);
					
					aluno.getDisciplinas().add(disciplina);
					
				}
				
				do {
					
					StringBuilder listaFormatada = new StringBuilder();
					for (int i = 0; i < aluno.getDisciplinas().size(); i++) {
					    listaFormatada.append(i + " - " + aluno.getDisciplinas().get(i) + "\n");
					}
					
					remover = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
					if(remover == 0) {
						
						String discRemovida = JOptionPane.showInputDialog("Qual Disciplina?\n" + listaFormatada);
						if(discRemovida != null) {
							int index = Integer.valueOf(discRemovida);
							aluno.getDisciplinas().remove(index);
						}
						
					}
					
				} while ( remover == 0 );
				
				listAlunos.add(aluno);
				
			}
			
			System.out.println("***************************************");
			
			/* Pesquisa Aluno pelo nome */
			for (Aluno aluno : listAlunos) {
				if(aluno.getNome().equalsIgnoreCase("penelope")) {
					JOptionPane.showMessageDialog(null, "A gata mais linda do pai.");
					break;
				}
			}
			
			/* Removendo Aluno pelo nome */
			for (Aluno aluno : listAlunos) {
				if(aluno.getNome().equalsIgnoreCase("teste")) {
					listAlunos.remove(aluno);
					JOptionPane.showMessageDialog(null, "O aluno teste foi removido");
					break;
				}			
			}
			
			/* Mostra os alunos inseridos */
			for (Aluno aluno : listAlunos) {
				System.out.println("Aluno: " + aluno);
				System.out.println("Média do aluno: " + aluno.getMedia());
				for (Disciplina disciplina : aluno.getDisciplinas()) {
					System.out.println(disciplina.getDisciplina() + " - " + disciplina.getNota());
				}
				System.out.println(aluno.getAprovadoString());
				
				if(qtdAluno != 1) {
					if(qtdAluno != listAlunos.indexOf(aluno)+1) {
						System.out.println("- - - - - - - - - - - - - - - - - - - ");
					}				
				}

			}
			
			System.out.println("***************************************");
			
			/* Listas para separar os Aprovado, Recuperação e Reprovado */
			List<Aluno> listAlunosAp = new ArrayList<Aluno>();
			List<Aluno> listAlunosRe = new ArrayList<Aluno>();
			List<Aluno> listAlunosRp = new ArrayList<Aluno>();
			
			for (Aluno aluno : listAlunos) {
				
				if(aluno.getAprovadoString().equalsIgnoreCase(StatusAluno.APROVADO)) {
					listAlunosAp.add(aluno);
				} else if (aluno.getAprovadoString().equalsIgnoreCase(StatusAluno.RECUPECACAO)) {
					listAlunosRe.add(aluno);
				} else {
					listAlunosRp.add(aluno);
				}
				
			}
			
			System.out.println("Qtd de Alunos Aprovados: " + listAlunosAp.size());
			System.out.println("Qtd de Alunos em Recuperação: " + listAlunosRe.size());
			System.out.println("Qtd de Alunos Reprovados: " + listAlunosRp.size());
			
			System.out.println("****************************************");
			
			/* Listas para separar os Aprovado, Recuperação e Reprovado por HashMap:
			 é uma Lista com chave identificadora para uma sequencia de valores */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPECACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			
			for (Aluno aluno : listAlunos) {
				
				if(aluno.getAprovadoString().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAprovadoString().equalsIgnoreCase(StatusAluno.RECUPECACAO)) {
					maps.get(StatusAluno.RECUPECACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
				
			}
			
			System.out.println("por HashMap");
			System.out.println("Qtd de Alunos Aprovados: " + maps.get(StatusAluno.APROVADO).size());
			System.out.println("Qtd de Alunos em Recuperação: " + maps.get(StatusAluno.RECUPECACAO).size());
			System.out.println("Qtd de Alunos Reprovados: " + maps.get(StatusAluno.REPROVADO).size());
			
			System.out.println("****************************************");
			
		} else {
			JOptionPane.showMessageDialog(null, "Sem acesso ao sistema.");
		}

	}

}