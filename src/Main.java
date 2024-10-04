import build.VeiculoBuilder;
import resources.Veiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        executa();
    }

    public static void executa(){
        Veiculo carro = new VeiculoBuilder().setCor("Vermelho").setTipo("Carro").setRodas(4).build();
        System.out.println(carro.toString());
    }
}