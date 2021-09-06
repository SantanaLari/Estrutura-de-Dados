package ponto;

public class Ponto {
	//atributos
	private int x;
	private int y;
	
	//métodos construtores
	//levam o nome da classe e servem para inicializar os objetos da classe
	public Ponto(int x, int y){
		//a variavel x recebe o parametro x
		this.x = x;
		this.y = y;
	}
	
	public Ponto() {
		x = 0;
		y = 0;
	}
	
	//metodos
	public void mover(int novo_x, int novo_y) {
		this.x = novo_x;
		this.y = novo_y;
	}
	
	public int obterX() {
		return x;
	}
	
	public int obterY() {
		return y;
	}
	
	public boolean ehIgual(Ponto p) {
		boolean resposta = false;
		if((p.obterX() == x) && (p.obterY() == y)) {
			resposta = true;
		}
		return resposta;
	}
}
