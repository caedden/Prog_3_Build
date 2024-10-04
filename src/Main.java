import build.RelatorioBuilder;
import resources.Relatorio;

public class Main {
    public static void main(String[] args) {

        executa();
    }

    public static void executa(){
        Relatorio relatorio = new RelatorioBuilder().setCorpo("Corpo").setTitulo("TITULO").setRodape("RODAPE").build();
        Relatorio relatorioSemRodape = new RelatorioBuilder().setCorpo("CorpoSemRodaPe").setTitulo("TITULO").build();

        System.out.println(relatorio.toString());
        System.out.println("\n");
        System.out.println(relatorioSemRodape.toString());
    }
}