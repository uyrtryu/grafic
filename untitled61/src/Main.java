import javax.swing.*;
import java.awt.*;

class DrawingPanel extends JFrame {
    private final int BACKGROUND_WIDTH = 600;
    private final int BACKGROUND_HEIGHT = 600;
 // empty constructor
         public DrawingPanel () {
             setTitle (" Drawing panel ");
             setSize ( BACKGROUND_WIDTH , BACKGROUND_HEIGHT );
             setVisible ( true );
             setDefaultCloseOperation ( DISPOSE_ON_CLOSE ) ;
         }
    @Override
    public void paint ( Graphics g) {
        Graphics2D g2d = ( Graphics2D ) g;
//пейзаж
//небо
        g2d.setColor(Color.CYAN);
        g2d.fillRect(0, 0, BACKGROUND_WIDTH, 380);
//облака
        g2d.setColor(Color.white);
        g2d.fillOval(55,60,50,40);
        g2d.fillOval(80,45,70,60);
        g2d.fillOval(125,60,50,40);

//дым
        g2d.setColor(Color.white);
        g2d.fillOval(155,230,15,15);
        g2d.fillOval(165,215,20,20);
        g2d.fillOval(160,205,15,15);
        g2d.fillOval(160,190,10,10);
        g2d.fillOval(155,230,15,15);
//сонце
        g2d.setColor(Color.yellow);
        g2d.fillOval(470,40,100,100);
//дорога
        g2d.setColor(Color.darkGray);
        g2d.fillRect(0, 380, BACKGROUND_WIDTH, 80);
//полосы на дорогу
        g2d.setColor(Color.yellow);
        g2d.fillRect(10, 415, 100, 10);
        g2d.fillRect(150, 415, 100, 10);
        g2d.fillRect(300, 415, 100, 10);
        g2d.fillRect(450, 415, 100, 10);
//зелень
        g2d.setColor(Color.green);
        g2d.fillRect(0, 460, BACKGROUND_WIDTH, 140);



        //человек

//туловище
        g2d.setColor(Color.gray);
        g2d.fillOval(340,270, 20, 50);
//голова
        g2d.setColor(Color.red);
        g2d.fillOval(335,250, 30, 30);


//корпус трактора
        g2d.setColor(Color.BLUE);
        g2d.fillRect(150,300,240,100);

        g2d.setColor(Color.BLACK);
        g2d.drawRect(150,300,240,100);

// труба
        g2d.setColor(Color.BLUE);
        g2d.fillRect(160,250,20,100);

        g2d.setColor(Color.black);
        g2d.drawRect(160,250,20,50);

//кабина
//правая
        g2d.setColor(Color.BLUE);
        g2d.fillRect(370,200,20,100);

        g2d.setColor(Color.black);
        g2d.drawRect(370,220,20,80);
//левая
        g2d.setColor(Color.BLUE);
        g2d.fillRect(300,200,20,100);

        g2d.setColor(Color.black);
        g2d.drawRect(300,200,20,100);
//крыша
        g2d.setColor(Color.BLUE);
        g2d.fillRect(300,200,70,20);

        g2d.setColor(Color.black);
        g2d.drawRect(300,200,90,20);
//колеса
//переднее
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillOval(170,370,60,60);

        g2d.setColor(Color.BLACK);
        g2d.drawOval(170,370,60,60);
        g2d.fillOval(185,385,30,30);
//заднее
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillOval(300,323,110,110);

        g2d.setColor(Color.BLACK);
        g2d.drawOval(300,323,110,110);
        g2d.fillOval(323,345,65,65);
//лучи
       g2d.setColor(Color.YELLOW);
       g2d.drawLine(450,70,400,50);
       g2d.drawLine(450,120,370,150);
       g2d.drawLine(490,160,470,200);
       g2d.drawLine(540,160,560,210);

                    
                    

    }

}


         public class Main {
 public static void main ( String [] args ) {
        // constructor call
         new DrawingPanel () ;
         }
 }