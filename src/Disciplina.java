
public class Disciplina {
	
	private ICalcMedia calcMedia;
	private double media;
	private String nome;
	private double p1;
	private double p2;
	private String situacao;

	public Disciplina(ICalcMedia calcMedia) {
		this.calcMedia = calcMedia;		
	}
	
	public void calcularMedia() {
		media = calcMedia.calculaMedia(p1, p2);
		situacao = calcMedia.situacao(media);		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double getMedia() {
		return media;
	}

	public String getSituacao() {
		return situacao;
	}


}

