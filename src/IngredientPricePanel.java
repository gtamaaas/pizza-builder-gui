import javax.swing.*;

public class IngredientPricePanel extends JPanel {
    private JLabel price;
    private JLabel ingredients;

    public IngredientPricePanel() {
        this.price = new JLabel("10");
        this.ingredients = new JLabel("Pizzabase");

        add(price);
        add(ingredients);
    }

    public void setPrice(int price) {
        this.price.setText(String.valueOf(price));
    }

    public void setIngredients(String ingredients) {
        this.ingredients.setText(ingredients);
    }
}
