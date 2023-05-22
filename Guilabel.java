import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Guilabel {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("cloud.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Music saves lifes");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);// set text center of imageIcon
        label.setVerticalTextPosition(JLabel.TOP);// set text top or bottom of ImagIcon
        label.setForeground(Color.DARK_GRAY); // text color
        label.setFont(new Font("MV Boli", Font.BOLD, 24)); // font
        label.setIconTextGap(50);// text imageicon gap
        label.setBackground(Color.black); // set bg color
        label.setOpaque(true); // display bg color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);// set icon+text in veritical center
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100, 100, 250, 250);

        JFrame frame = new JFrame();
        frame.setTitle("A Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        //frame.setSize(420, 420);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}