import javax.swing.*;

class Verbose extends JFrame {
    JProgressBar jb;

    int i = 0, num = 0;

    Verbose() {
        jb = new JProgressBar(0, 20000);
        jb.setBounds(50, 50, 200, 40);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(250, 100);
        setLayout(null);
    }

    public void iterate() {
        while (i <=20000) {
            jb.setValue(i);
            i += 20;
            try {
                Thread.sleep(150);
            } catch (Exception e) {
            }

        }
    }

    public static void main(String[] args) {
        Verbose m = new Verbose();
        m.setVisible(true);
        m.iterate();
    }
}