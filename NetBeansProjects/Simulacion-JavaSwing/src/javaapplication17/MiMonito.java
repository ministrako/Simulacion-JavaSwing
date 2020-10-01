package javaapplication17;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MiMonito extends JLabel implements Runnable {

    private String name, url;
    private ImageIcon imagenIcon;

    public MiMonito(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void innit() {
        URL resource = this.getClass().getResource(url);
        if (resource != null) {
            imagenIcon = new ImageIcon(new ImageIcon(resource).getImage().getScaledInstance(40, 40, Image.SCALE_FAST));
            this.setIcon(imagenIcon);
        } else {
            System.out.println("URL vacia");
        }

    }

    @Override
    public void run() {
        for (int x = 120; x <= 490; x += 3) {
            this.setBounds(x, 10, 32, 39);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Exception" + e.getMessage());
            }
        }
    }

}
