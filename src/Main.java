import Resourses.Pizza;
import Resourses.PizzaBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        teste();
    }
    public static void teste(){
        Pizza pizza = new PizzaBuilder().setMassa("fina").setTamanho("G").addIngredientes("Molho tomate").addIngredientes("Mussarela").build();
        System.out.println(pizza.toString());
    }
}