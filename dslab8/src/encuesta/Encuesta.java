package encuesta;

public class Encuesta {
	Voto voto;
	private int si, no;
	private String pregunta;

	public Encuesta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}
	public int getVotosSi() {
		voto.setVotosSi(si);
		return si;
	}

	public int getVotosNo() {
		voto.setVotosNo(no);
		return no;
	}

	public void incrementaSi() {
		getVotosSi();
		getVotosNo();
		voto.si();
		guardaResultados();
	}

	public void incrementaNo() {
		getVotosSi();
		getVotosNo();
		voto.no();
		guardaResultados();
	}

	private void guardaResultados() {
		System.out.println("Guardando resultados");
	}

}
