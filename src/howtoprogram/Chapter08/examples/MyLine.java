package howtoprogram.Chapter08.examples;

import java.awt.*;

/**
 * @author imlucky
 * @Created: 2019/03/03
 * @Examples: Fig. 8.17: MyLine.java
 */
public class MyLine {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

    public MyLine(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
}
