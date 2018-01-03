package mx.com.kodikas.graphicsObjects;


import mx.com.kodikas.graphicsObjects.Graphic;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Javier Arturo
 */
public class SilverBullet extends Graphic{
    
    public SilverBullet(int x, int y) {
        super(x, y);
        icon = new ImageIcon(getClass().getResource("/images/silver-bullet.png"));
        imgGraphic = icon.getImage();
    }
    
    @Override
    public void move(){
        xCoord += 5;
    }
    
    @Override
    public void draw(Graphics g){
        g.drawImage(imgGraphic, xCoord, yCoord, 30, 30, null);
    }
}
