package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	public void ConcatenaString () {
		String cadeia = "";
		//mili segundos
		System.currentTimeMillis();
		//nano segundos
		double TempoInicial = System.nanoTime();
		for(int i = 0; i < 32768;i++) {
			cadeia = cadeia + "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - TempoInicial;
		
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("String==>"+tempoTotal+"segundos");
	}
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double TempoInicial = System.nanoTime();
		for(int i = 0; i < 32768;i++) {
			buffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - TempoInicial;
		
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Buffer==>"+tempoTotal+"segundos");
	}
	public void divideFrase(String frase) {
		String[] vetorPalavras = frase.split(" ");
		
	}
	public void PercorrerVetor() {
		String[] vetor = new String[100000];
		double TempoInicial = System.nanoTime();
		
		for(int i = 0; i < 100000;i++) {
			vetor[i] = "";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - TempoInicial;
		
		//tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("vetor==>"+tempoTotal);
	}
}
//ctrl + d apaga a linha toda 
