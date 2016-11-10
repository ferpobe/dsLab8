package encuesta;

public class Encuesta {
	Voto voto;
	private int si, no;
	private String pregunta;

	public Encuesta(String pregunta) {
		this.pregunta = pregunta;
		voto=new Voto();
	}

	public String getPregunta() {
		return pregunta;
	}
	public int getVotosSi() {
		voto.setVotosSi();
		return si;
	}

	public int getVotosNo() {
		voto.setVotosNo();
		return no;
	}

	public void incrementaSi() {
		getVotosSi();
		
		voto.si();
		guardaResultados();
	}

	public void incrementaNo() {
		
		getVotosNo();
		voto.no();
		guardaResultados();
	}

	private void guardaResultados() {
		System.out.println("Guardando resultados");
	}

}
