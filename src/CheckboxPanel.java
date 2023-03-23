import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class CheckboxPanel extends JPanel {

    private JCheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5;
    private PizzaPanel pizzaPanel;

    private IngredientPricePanel ingredientPricePanel;

    public CheckboxPanel(PizzaPanel pizzaPanel, IngredientPricePanel ingredientPricePanel) {
        this.pizzaPanel = pizzaPanel;
        this.ingredientPricePanel = ingredientPricePanel;

        checkbox1 = new JCheckBox("Salami");
        checkbox2 = new JCheckBox("Tomato");
        checkbox3 = new JCheckBox("Corn");
        checkbox4 = new JCheckBox("Olive");
        checkbox5 = new JCheckBox("Mushroom");

        checkbox1.addItemListener(new CheckboxListener());
        checkbox2.addItemListener(new CheckboxListener());
        checkbox3.addItemListener(new CheckboxListener());
        checkbox4.addItemListener(new CheckboxListener());
        checkbox5.addItemListener(new CheckboxListener());

        add(checkbox1);
        add(checkbox2);
        add(checkbox3);
        add(checkbox4);
        add(checkbox5);
    }

    private class CheckboxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            Pizza pizza = new PizzaBase();
            if (checkbox1.isSelected()) {
                pizza = new Salami(pizza);
            }
            if (checkbox2.isSelected()) {
                pizza = new Tomato(pizza);
            }
            if (checkbox3.isSelected()) {
                pizza = new Corn(pizza);
            }
            if (checkbox4.isSelected()) {
                pizza = new Olive(pizza);
            }
            if (checkbox5.isSelected()) {
                pizza = new Mushroom(pizza);
            }
            pizzaPanel.setPizza(pizza);
            ingredientPricePanel.setIngredients(pizza.getIngredients());
            ingredientPricePanel.setPrice(pizza.getPrice());
            pizzaPanel.repaint();

        }
    }

    public void setCheckbox(int number) {
        switch (number) {
            case 1:
                checkbox1.setSelected(true);
                break;
            case 2:
                checkbox2.setSelected(true);
                break;
            case 3:
                checkbox3.setSelected(true);
                break;
            case 4:
                checkbox4.setSelected(true);
                break;
            case 5:
                checkbox5.setSelected(true);
                break;
        }
    }


    public void unSetAll() {
                    checkbox1.setSelected(false);
                    checkbox2.setSelected(false);
                    checkbox3.setSelected(false);
                    checkbox4.setSelected(false);
                    checkbox5.setSelected(false);
    }

}