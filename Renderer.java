import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

public class Renderer extends JPanel
{
    private final int WIDTH, HEIGHT;
    
    private Plotter plotter;
    
    public Renderer(final int width, final int height)
    {
        this.WIDTH = width;
        this.HEIGHT = height;
        setPreferredSize(new Dimension(width,height)); 
        setBackground(new Color(255,25,60));
        
        this.plotter = new Plotter(width, height);
    }
    
    public void paint(Graphics g)
    {
        plotter.draw(g);
    }
}
