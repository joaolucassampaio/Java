/*Faça uma classe aplicativo (AppPonto) que vai criar dois pontos, pedir ao 
usuário as coordenadas dos dois, mostrar na tela a distância entre os dois e 
o seu ponto médio.*/

package exemploCinco;
import io.InOut;

public class AppPonto {

	public static void main(String[] args) {
		
		double x1 = InOut.leDouble("Informe a coordenada X do primeiro ponto:");
		double y1 = InOut.leDouble("Informe a coordenada Y do primeiro ponto:");
		double x2 = InOut.leDouble("Informe a coordenada X do segundo ponto:");
		double y2 = InOut.leDouble("Informe a coordenada Y do segundo ponto:");
		
		//definição dos atributos para serem passados ao construtor
		Ponto ponto1 = new Ponto(x1, y1);
		Ponto ponto2 = new Ponto(x2, y2);
		
		// Calculando a distância entre os dois pontos
        double distancia = ponto1.calcularDistancia(ponto2);
        InOut.msgSemIcone(null, "Distância entre os pontos: " + distancia);
        
        // Calculando o ponto médio entre os dois pontos
        String pontoMedio = ponto1.pontoMedio(ponto2);
        InOut.msgSemIcone(null,"Ponto médio entre os pontos: " + pontoMedio);
    }
}


