//Maryam Ali
//Project 2
//Submission Date: 02/01

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyPanel p = null;
    public MyFrame()
    {
        super("Project #2");

        //creates the canvas
        p = new MyPanel();
        p.setLayout(new FlowLayout());
        setContentPane(p);

        //defines panel dimensions
        setSize(600, 700);
        setVisible(true);
    }
}
