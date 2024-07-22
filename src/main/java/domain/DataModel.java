package domain;

public class DataModel {
	
	static int ANO_LIMITE=31536000;
	static int MES_LIMITE=2628000;
	static int DIA_LIMITE=86400;
	static int HORA_LIMITE=3600;
	static int MINUTO_LIMITE=60;

	private int ano;
	private int mes;
	private int dia;
	private int hora;
	private int minuto;
	private int segundo;
	
	@Override
	public String toString() {
		return ano+" ano(s) \n"+mes+" mes(s)\n"+dia+" dia(s)\n"+hora+" hora(s)\n"
				+minuto+" minuto(s)\n"+segundo+" segundo(s)\n";
	}
	
	public DataModel(int tempo) {
		this.ano=converter(tempo,ANO_LIMITE);
		tempo=ano==0?tempo:tempo%ANO_LIMITE;
		this.mes=converter(tempo,MES_LIMITE);
		tempo=mes==0?tempo:tempo%MES_LIMITE;
		this.dia=converter(tempo,DIA_LIMITE);
		tempo=dia==0?tempo:tempo%DIA_LIMITE;
		this.hora=converter(tempo,HORA_LIMITE);
		tempo=hora==0?tempo:tempo%HORA_LIMITE;
		this.minuto=converter(tempo,MINUTO_LIMITE);
		tempo=tempo%MINUTO_LIMITE;
		this.segundo=tempo;
	}
	
	private int converter(int tempo, int limite) {
		int resultado=0;
		if(tempo>=limite) {
			return resultado=tempo/limite;
		}
		return resultado;
	}
	
}
