import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ItemMenuBar extends JMenuBar {

    private PizzaPanel pizzaPanel;
    private CheckboxPanel checkboxPanel;

    public ItemMenuBar (PizzaPanel pizzaPanel, CheckboxPanel checkboxPanel) {

        this.pizzaPanel = pizzaPanel;
        this.checkboxPanel = checkboxPanel;

        JMenu menu = new JMenu("File");
        add(menu);
        JMenuItem save = new JMenuItem("Save");
        JMenuItem load = new JMenuItem("Load");
        menu.add(save);
        menu.add(load);

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        FileWriter fileWriter = new FileWriter(file);
                        fileWriter.write(pizzaPanel.getPizza().getIngredients());
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        load.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String line = "";
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                checkboxPanel.unSetAll();
                for (String s : line.split(" ")) {
                    if (s.equals("Salami")) {
                        checkboxPanel.setCheckbox(1);
                    }
                    if (s.equals("Tomato")) {
                        checkboxPanel.setCheckbox(2);
                    }

                    if (s.equals("Corn")) {
                        checkboxPanel.setCheckbox(3);
                    }
                    if (s.equals("Olive")) {
                        checkboxPanel.setCheckbox(4);
                    }
                    if (s.equals("Mushroom")) {
                        checkboxPanel.setCheckbox(5);
                    }
                }
                pizzaPanel.repaint();
            }
        });
    }
}
