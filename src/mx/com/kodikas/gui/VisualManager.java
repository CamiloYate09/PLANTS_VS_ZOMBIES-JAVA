package mx.com.kodikas.gui;

import mx.com.kodikas.graphicsObjects.Zoombie;
import mx.com.kodikas.graphicsObjects.SilverBullet;
import mx.com.kodikas.graphicsObjects.GreenBullet;
import mx.com.kodikas.graphicsObjects.Graphic;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;


/**
 *
 * @author Javier Arturo
 */
public class VisualManager extends JPanel{
    
    private ArrayList<Graphic> graphicList;
    
    public VisualManager(){
        setSize(500, 500);
        setBackground(Color.white);
        
        graphicList = new ArrayList<Graphic>();
       
        graphicList.add(new Zoombie(900, 10));
        graphicList.add(new Zoombie(850, 100));
        graphicList.add(new Zoombie(800, 200));
        graphicList.add(new Zoombie(910, 300));
        graphicList.add(new Zoombie(920, 400));
        graphicList.add(new Zoombie(850, 500));
        graphicList.add(new Zoombie(710, 600));
        graphicList.add(new Zoombie(860, 700));
        graphicList.add(new Zoombie(900, 800));
        graphicList.add(new GreenBullet(10, 10));
        graphicList.add(new GreenBullet(15, 50));
        graphicList.add(new GreenBullet(25, 90));
        graphicList.add(new GreenBullet(5, 140));
        graphicList.add(new GreenBullet(9, 190));
        graphicList.add(new GreenBullet(13, 240));
        graphicList.add(new GreenBullet(16, 290));
        graphicList.add(new SilverBullet(1, 350));
        graphicList.add(new SilverBullet(5, 400));
        graphicList.add(new SilverBullet(30, 450));
        graphicList.add(new SilverBullet(10, 500));
        graphicList.add(new SilverBullet(10, 550));
        graphicList.add(new SilverBullet(0, 600));
        graphicList.add(new SilverBullet(-2, 650));
        graphicList.add(new SilverBullet(15, 700));
        graphicList.add(new GreenBullet(13, 750));
        graphicList.add(new GreenBullet(16, 800));
        graphicList.add(new SilverBullet(1, 852));
        graphicList.add(new SilverBullet(5, 900));
        
        
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                moveGraphics();
                repaint();
            }
        };
                
        Timer timer = new Timer();
        timer.schedule(timerTask, 0, 100);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        for(Graphic graphic : graphicList){
            graphic.draw(g);
        }
    }
    
    public void moveGraphics(){
        for(Graphic g : graphicList){
            g.move();
        }
    }
    
}
