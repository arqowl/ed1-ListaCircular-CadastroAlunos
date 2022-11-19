package app;
public class Aluno implements Comparable<Aluno> {
	private String matricula;
	private String nome;
	private double mediaFinal;
	private int quantidadeFaltas;
	
	public Aluno(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public Aluno(String matricula) {
        this.matricula = matricula;
    }



    public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public int getQuantidadeFaltas() {
		return quantidadeFaltas;
	}

	public void setQuantidadeFaltas(int quantidadefaltas) {
		this.quantidadeFaltas = quantidadeFaltas;
	}

	

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", mediaFinal=" + mediaFinal + ", quantidadeFaltas="
				+ quantidadeFaltas + "]";
	}



	@Override
	public int compareTo(Aluno aluno){
		return this.getMatricula().compareTo(aluno.matricula);
	}
}

