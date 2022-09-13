public class Pepperoni extends Pizza{

    @Override
    public void mostraIngredientes() {
        System.out.println("A pizza pepperoni é formada pelos ingredientes:");
        System.out.println("Mussarela");
        System.out.println("Pepperoni");
    }

    @Override
    public String mostraBrinde() {
        return "Caneta";
    }
}
