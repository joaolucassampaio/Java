/*Faça uma classe Ponto, que tenha os atributos:
* coordenadas x e y

E os seguinte métodos:
* gets, sets, toString
* distância que vai calcular e retornar a distância entre o ponto objeto da classe o outro ponto parâmetro
* pontoMedio que vai calcular e retornar o ponto médio entre o ponto objeto da classe o outro ponto parâmetro. */

package exemploCinco;

public class Ponto {
	//atributos servem para armazenar o estado do objeto
	private double x, y;
	
	//definindo o construtor ponto
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Ponto outroPonto será passado como argumento ao instanciar o objeto
	//Ele tem a mesma estrutura de Ponto porque está sendo criado como Ponto
	public double calcularDistancia(Ponto outroPonto) {
		double dx = (this.x - outroPonto.x) * (this.x - outroPonto.x);
		double dy = (this.y - outroPonto.y) * (this.y - outroPonto.y);
		return Math.sqrt(dx + dy);
	}
	
	public String pontoMedio(Ponto outroPonto) {
		double dx = (this.x + outroPonto.x) / 2;
		double dy = (this.y + outroPonto.y) / 2;
		return ("PontoMedio(" + dx + ", " + dy + ")");
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String toString() {
		return "Ponto [x=" + x + ", y=" + y + "]";
	}
}
