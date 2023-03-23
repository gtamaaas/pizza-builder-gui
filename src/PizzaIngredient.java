import java.awt.*;

public abstract class PizzaIngredient implements Pizza{
    private Pizza pizza;

    public PizzaIngredient(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake(Graphics g) {
        this.pizza.bake(g);
    }

    @Override
    public int getPrice() {
        return this.pizza.getPrice();
    }

    @Override
    public String getIngredients() {
        return this.pizza.getIngredients();
    }
}
