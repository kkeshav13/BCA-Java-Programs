import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class BorderlayoutDemo extends JFrame{
    BorderlayoutDemo()
    {
        JPanel pa = new JPanel();
        pa.setLayout(new BorderLayout());

        pa.add(new JButton("THIS"), BorderLayout.NORTH);

        pa.add(new JButton("IS"), BorderLayout.SOUTH);

        pa.add(new JButton("THE"), BorderLayout.WEST);

        pa.add(new JButton("BORDER lAYOUT"), BorderLayout.EAST);

        pa.add(new JButton("WELCOME!!!"), BorderLayout.CENTER);

        add(pa);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(600,600);

        setVisible(true);
    }
}
class MainFrame {
    public static void main(String[] args){
        new BorderlayoutDemo();
    }
}