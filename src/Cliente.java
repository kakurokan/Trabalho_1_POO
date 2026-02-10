import java.util.Scanner;

/**
 * @author Léo Souza
 * @version 10/02/26 10:03
 */
public class Cliente {

    /**
     * Ponto de entrada do programa. Este método inicializa um sistema de leitura de entrada
     * para obter as coordenadas de dois pontos no sistema cartesiano. A partir dessas
     * coordenadas, ele cria instâncias da classe {@code Ponto}, define um segmento de reta
     * composto por esses dois pontos e imprime a representação textual do segmento de reta.
     * <p>
     * Fluxo do método:
     * 1. Lê quatro valores de entrada (dois pares de coordenadas x e y).
     * 2. Cria dois objetos da classe {@code Ponto} com as coordenadas lidas.
     * 3. Cria um objeto da classe {@code SegmentoReta} utilizando os pontos criados.
     * 4. Imprime a representação textual do segmento de reta.
     * 5. Fecha o recurso {@code Scanner} para liberar recursos.
     */
    void main() {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = scan.nextDouble();
        Ponto a = new Ponto(x, y);

        x = scan.nextDouble();
        y = scan.nextDouble();
        Ponto b = new Ponto(x, y);

        SegmentoReta segmento = new SegmentoReta(a, b);

        System.out.println(segmento);

        scan.close();
    }
}
