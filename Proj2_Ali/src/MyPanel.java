//Maryam Ali
//Project 2
//Submission Date: 02/01

import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel {

    public MyPanel( ) {
        setBackground(Color.white);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // The paintComponent method is invoked
        // whenever paint event occurs.  This occurs
        // when the panel is
        // (1) first displayed.
        // (2) restored after being minimized.
        // (3) exposed after being hidden.

        // Print title.
        g.setFont(new Font("impact", Font.BOLD, 40));
        g.setColor(Color.red);
        g.drawString("The Snowman", 200, 60);


        // Draw top circle/head
        g.setColor(Color.white);
        g.fillOval(250, 150, 100, 100);
        g.setColor(Color.black);
        g.drawOval(250, 150, 100, 100);

        //Draw second circle/body
        g.setColor(Color.white);
        g.fillOval(230, 250, 150, 150);
        g.setColor(Color.black);
        g.drawOval(230, 250, 150, 150);

        //Draw bottom circle/body
        g.setColor(Color.white);
        g.fillOval(185, 400, 250, 250);
        g.setColor(Color.black);
        g.drawOval(185, 400, 250, 250);

        //Draw left arm
        g.setColor(Color.black);
        g.drawRect(110, 300, 125, 1);

        //Draw right arm
        g.setColor(Color.black);
        g.drawRect(375, 300, 125, 1);

        //Draw left eye
        g.setColor(Color.black);
        g.fillOval(270, 175, 15, 15);
        g.setColor(Color.black);
        g.drawOval(270, 175, 15, 15);

        //Draw right eye
        g.setColor(Color.black);
        g.fillOval(315, 175, 15, 15);
        g.setColor(Color.black);
        g.drawOval(315, 175, 15, 15);

        //Draw nose
        g.setColor(Color.orange);
        g.fillOval(295, 200, 10, 10);
        g.setColor(Color.black);
        g.drawOval(295, 200, 10, 10);

        //draw middle smile dot
        g.setColor(Color.black);
        g.fillOval(296, 225, 8, 8);
        g.setColor(Color.black);
        g.drawOval(296, 225, 8, 8);

        //draw middle right smile dot
        g.setColor(Color.black);
        g.fillOval(310, 220, 8, 8);
        g.setColor(Color.black);
        g.drawOval(310, 220, 8, 8);

        //draw middle left smile dot
        g.setColor(Color.black);
        g.fillOval(283, 220, 8, 8);
        g.setColor(Color.black);
        g.drawOval(283, 220, 8, 8);

        //draw rightmost smile dot
        g.setColor(Color.black);
        g.fillOval(323, 210, 8, 8);
        g.setColor(Color.black);
        g.drawOval(323, 210, 8, 8);

        //draw leftmost smile dot
        g.setColor(Color.black);
        g.fillOval(272, 210, 8, 8);
        g.setColor(Color.black);
        g.drawOval(272, 210, 8, 8);

        //draw top button
        g.setColor(Color.red);
        g.fillOval(295, 270, 20, 20);
        g.setColor(Color.black);
        g.drawOval(295, 270, 20, 20);

        //draw second button
        g.setColor(Color.red);
        g.fillOval(295, 315, 20, 20);
        g.setColor(Color.black);
        g.drawOval(295, 315, 20, 20);

        //draw third button
        g.setColor(Color.red);
        g.fillOval(295, 360, 20, 20);
        g.setColor(Color.black);
        g.drawOval(295, 360, 20, 20);

        //draw fourth button
        g.setColor(Color.red);
        g.fillOval(298, 445, 20, 20);
        g.setColor(Color.black);
        g.drawOval(298, 445, 20, 20);

        //draw fifth button
        g.setColor(Color.red);
        g.fillOval(298, 500, 20, 20);
        g.setColor(Color.black);
        g.drawOval(298, 500, 20, 20);

        //draw final button
        g.setColor(Color.red);
        g.fillOval(300, 560, 20, 20);
        g.setColor(Color.black);
        g.drawOval(300, 560, 20, 20);

        //draw base of hat
        g.setColor(Color.black);
        g.fillRect(245, 135, 110, 20);
        g.setColor(Color.black);
        g.drawRect(245, 135, 110, 20);

        //draw red strip
        g.setColor(Color.red);
        g.fillRect(265, 120, 75, 15);
        g.setColor(Color.black);
        g.drawRect(265, 120, 75, 15);

        //draw top of hat
        g.setColor(Color.black);
        g.fillRect(265, 75, 75, 50);
        g.setColor(Color.black);
        g.drawRect(265, 75, 75, 50);





    }
}
