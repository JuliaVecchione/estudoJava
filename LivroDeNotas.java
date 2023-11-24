package livrodenotas;
import javax.swing.JOptionPane;

public class LivroDeNotas {
    private int numeroAlunos;
    private double[] notasDosAlunos; 


    public LivroDeNotas(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
        this.notasDosAlunos = new double[numeroAlunos];
    }

    public void calcularMediaDeCadaAluno() {
        for (int i = 0; i < numeroAlunos; i++) {
            String input = JOptionPane.showInputDialog("Informe a nota do aluno " + (i + 1));
            double nota = Double.parseDouble(input);
            notasDosAlunos[i] = nota;
        }
    }

    public void calcularMediaDaTurma() {
        double totalNotas = 0.0;
        for (int i = 0; i < numeroAlunos; i++) {
            totalNotas += notasDosAlunos[i];
        }
        double mediaDaTurma = totalNotas / numeroAlunos;
        JOptionPane.showMessageDialog(null, "A média da turma é: " + mediaDaTurma);
    }

    public static void main(String[] args) {
        int numeroAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de alunos:"));
        LivroDeNotas livro = new LivroDeNotas(numeroAlunos);
        livro.calcularMediaDeCadaAluno();
        livro.calcularMediaDaTurma();
    }
}
