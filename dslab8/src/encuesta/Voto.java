package encuesta;

import Graficos.*;

public class Voto {
	GraficoCircular gc;
	GraficodeBarras gb;
	LineadeValores lv;
	int votosSi;
	int votosNo;
	/**
	 * 
	 * @param voto
	 */
	public Voto(String voto){
		votosSi=0;
		votosNo=0;
		}
	/**
	 * 
	 */
	public void si(){
		gc.actualizaGráficoCircular();
		gb.actualizaGráficoBarras();
		lv.actualizaLv(getVotosSi(), getVotosNo());
		}
	/**
	 * 
	 */
	public void no(){
		gc.actualizaGráficoCircular();
		gb.actualizaGráficoBarras();
		lv.actualizaLv(getVotosSi(), getVotosNo());
		}
	/**
	 * 
	 * @return
	 */
	public int getVotosNo(){
		return votosNo;
		}
	/**
	 * 
	 * @return
	 */
	public int getVotosSi() {
		
		return votosSi;
		}
	/**
	 * 
	 * @param no
	 */
	public void setVotosNo(int no) {
		votosNo=no;
		}
	/**
	 * 
	 * @param si
	 */
	public void setVotosSi(int si) {
		votosSi=si;
		}
	}
