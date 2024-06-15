import java.util.List;
import java.util.ArrayList;


public static void main(String[] args) {
    // Listas genéricas
    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professores = new ArrayList<>();
    List<FuncionarioAdministrativo> funcionarios = new ArrayList<>();

    // Inserir 10 alunos na lista
    for (int i = 0; i < 10; i++) {
        Aluno aluno = new Aluno("Aluno" + (i + 1), 20 + i); // Apenas exemplo de idade
        alunos.add(aluno);
    }

    // Inserir 5 professores na lista
    for (int i = 0; i < 5; i++) {
        Professor professor = new Professor("Professor" + (i + 1), 30 + i); // Apenas exemplo de idade
        professores.add(professor);
    }

    // Inserir 5 funcionários administrativos na lista
    for (int i = 0; i < 5; i++) {
        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo("Funcionario" + (i + 1), 25 + i); // Apenas exemplo de idade
        funcionarios.add(funcionario);
    }

    // Exibir o número de alunos, professores e funcionários administrativos inseridos
    System.out.println("Número de Alunos: " + alunos.size());
    System.out.println("Número de Professores: " + professores.size());
    System.out.println("Número de Funcionários Administrativos: " + funcionarios.size());
}