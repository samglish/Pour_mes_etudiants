package DessinPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DessinPanel extends JPanel {

    private final ArrayList<Point> points = new ArrayList<>();

    public DessinPanel() {
        setBackground(Color.WHITE);

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }
        });
    }
    
 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for (Point p : points) {
           g.fill3DRect(p.x, p.y, 20, 25, true);
        
        
    }
}
}
