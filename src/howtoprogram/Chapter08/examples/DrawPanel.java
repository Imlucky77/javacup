package howtoprogram.Chapter08.examples;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

/**
 * @author imlucky
 * @Created: 2019/03/03
 * @Examples: Fig. 8.18: DrawPanel.java
 */
public class DrawPanel extends JPanel {
    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines;

    public DrawPanel() {
        setBackground(Color.white);
        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        for (int count = 0; count < lines.length; count++) {
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            Color color = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyLine line : lines) {
            line.draw(g);
        }
    }
}
