import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PizzaBase implements Pizza{
    private BufferedImage img;

    public PizzaBase() {
        try {
            img = ImageIO.read(new File("src/img/pizza_base.png"));
        } catch (IOException e) {
            System.out.println("Couldn't load pizzabase");
        }
    }

    @Override
    public void bake(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getIngredients() {
        return "PizzaBase ";
    }
}
