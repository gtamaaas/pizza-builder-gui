import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Salami extends PizzaIngredient{
    private BufferedImage img;

    public Salami(Pizza pizza) {
        super(pizza);
        try {
            img = ImageIO.read(new File("src/img/Salami.png"));
        } catch (IOException e) {
            System.out.println("Couldn't load salami");
        }

    }

    @Override
    public void bake(Graphics g) {
        super.bake(g);
        g.drawImage(img, 0, 0, null);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "Salami ";
    }
}
