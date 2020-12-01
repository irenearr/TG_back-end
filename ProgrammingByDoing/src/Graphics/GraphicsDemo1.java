//    Assignments:
//    1.  How big is the window that appears? How many pixels wide? How many pixels tall?
//          800 x 600
//    2.  In the call to the function g.drawRect(), there are four numbers. What do they mean?
//        Try changing them to figure it out.
//          x, y, width and height. x gives the position from left to right (x-axis), 0 means it starts
//          all the way at the left. y gives the position from top to bottom (y-axis), 0 means it starts
//          all the way at the top. width and height are the sizes of the shape.
//    3.  What about the call to fillOval()? What do the four numbers mean here?
//          the same.
//    4.  What are the two numbers in the call to drawString()?
//          The position of the sentence on the screen.
//    5.  What happens when two objects overlap? Which one is drawn on top?
//          The oval object is filled-in and looks like it overlaps the rectangle. Also when I make the
//          rectangle red, I can see it's hidden behind the oval. But when I fill the rectangle and draw the
//          oval, the oval is still overlapping the rectangle. So it must be the second shape that overlaps
//          the first.
//        Add a red, filled-in square somewhere in the lower-right of the canvas.

package Graphics;

import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.red);
        g.fillRect(50,20,100,200);  // draw a rectangle
        g.fillRect( 680, 450, 100, 100 ); // draw a square
        g.setColor(Color.green);
        g.drawOval(100,20,100,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);

        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}