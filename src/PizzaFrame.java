import javax.swing.*;
import java.awt.*;
public class PizzaFrame extends JFrame {
    private PizzaPanel pizzaPanel;
    private CheckboxPanel checkboxPanel;

    public PizzaFrame() {
        setSize(500, 600);

        Pizza pizza = new PizzaBase();

        pizzaPanel = new PizzaPanel(pizza);
        add(pizzaPanel);

        IngredientPricePanel ingredientPricePanel = new IngredientPricePanel();
        add(ingredientPricePanel, BorderLayout.NORTH);

        checkboxPanel = new CheckboxPanel(pizzaPanel, ingredientPricePanel);
        add(checkboxPanel, BorderLayout.SOUTH);

        ItemMenuBar itemMenuBar = new ItemMenuBar(pizzaPanel, checkboxPanel);

        setJMenuBar(itemMenuBar);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PizzaFrame();
    }
}
