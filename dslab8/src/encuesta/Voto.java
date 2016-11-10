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
	public Voto(){
		gc=new GraficoCircular();
		gb=new GraficodeBarras();
		lv=new LineadeValores();
		votosSi=0;
		votosNo=0;
		}
	/**
	 * 
	 */
	public void si(){
		if(getVotosNo()+getVotosSi()>3){
			gc.actualizaGráficoCircular();
			gb.actualizaGráficoBarras();
		}
		
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
	public void setVotosNo() {
		votosNo++;
		}
	/**
	 * 
	 * @param si
	 */
	public void setVotosSi() {
		votosSi++;
		}
	}
