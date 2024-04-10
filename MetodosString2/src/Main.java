import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //
        String alunosVestibular = "Jose dos Santos,7,Sao Paulo;Sandra Silva,6.5,Sao Jose do Rio Preto;Augusto Soares,8,Sao Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,Sao Paulo;Natan Cruz,10,Sao Paulo.\n";

        String[] listaAlunosSplit = alunosVestibular.split(";");

        HashMap<Integer, Aluno> alunoHashMap = new HashMap<>();

        for(int i =0; i<=listaAlunosSplit.length; i++){
            String alunoSplit =  listaAlunosSplit[i];
            String[] dadosAluno  = alunoSplit.split(",");

            String nomeAluno = dadosAluno[0];
            int notaVestibularAluno = Integer.parseInt(dadosAluno[1]);
            String cidadeAluno = dadosAluno[2];

            Aluno aluno = new Aluno(nomeAluno, notaVestibularAluno, cidadeAluno);
            if(aluno.getNota() >= 7){
                alunoHashMap.put(i, aluno);
            }
        }


        alunoHashMap.forEach((id, aluno) -> {
            System.out.println("ID usuário: "+id);
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("Cidade Aluno" + aluno.getCidade());
        });
    }
}