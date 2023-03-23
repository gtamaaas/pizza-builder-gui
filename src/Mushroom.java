import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Mushroom extends PizzaIngredient{
    private BufferedImage img;

    public Mushroom(Pizza pizza) {
        super(pizza);
        try {
            img = ImageIO.read(new File("src/img/mushroom.png"));
        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println("Couldn't load mushroom");
        }

    }

    @Override
    public void bake(Graphics g) {
        super.bake(g);
        g.drawImage(img, 0, 0, null);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 9;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "Mushroom ";
    }
}
