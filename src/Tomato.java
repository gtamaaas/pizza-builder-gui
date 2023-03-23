import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tomato extends PizzaIngredient{
    private BufferedImage img;

    public Tomato(Pizza pizza) {
        super(pizza);
        try {
            img = ImageIO.read(new File("src/img/tomato.png"));
        } catch (IOException e) {
            System.out.println("Couldn't load tomato");
        }

    }

    @Override
    public void bake(Graphics g) {
        super.bake(g);
        g.drawImage(img, 0, 0, null);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 6;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "Tomato ";
    }
}
