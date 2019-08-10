package game.controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Gonzalo Diaz
 */
public class ControllerStage1 {

    private Graphics g;
    private int x = 0;
    private int y = 0;

    public void paint(Graphics2D g) {
        g.setColor(Color.blue);
        g.fillOval(x, y, 50, 50);
        g.drawRect(50, 400, 500, 100);
    }

    public void mouseMoved(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void keyPressed(java.awt.event.KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:

                break;
            case KeyEvent.VK_DOWN:

                break;
            case KeyEvent.VK_RIGHT:

                break;
            case KeyEvent.VK_LEFT:

                break;

        }
    }

}
