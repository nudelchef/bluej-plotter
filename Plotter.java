
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class Plotter
{
    private final int WIDTH, HEIGHT;
    
    private final double SIZE = 5.0;
    
    public Plotter(final int width, final int height)
    {
        this.WIDTH = width;
        this.HEIGHT = height;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(new Color(0,0,0));
        // VERTIKAL
        g.fillRect(WIDTH/2, 0, 1, HEIGHT);
        
        for (int y = 0 ; y < HEIGHT/2 / SIZE ; y++)
        {
            g.fillRect(WIDTH / 2 - 5, (int) (HEIGHT/2 - y*SIZE), 10, 1);
            g.fillRect(WIDTH / 2 - 5, (int) (HEIGHT/2 + y*SIZE), 10, 1);
        }
        
        // HORIZONTAL
        g.fillRect(0, HEIGHT/2, WIDTH, 1);
        
        for (int x = 0 ; x < WIDTH/2 / SIZE ; x++)
        {
            g.fillRect((int) (WIDTH/2 - x*SIZE), HEIGHT / 2 - 5, 1, 10);
            g.fillRect((int) (WIDTH/2 + x*SIZE), HEIGHT / 2 - 5, 1, 10);
        }
        
        g.setColor(new Color(155,30,0));
        
        double prev = 0;
        
        try{
            prev = -getValue((-HEIGHT/2-1) / SIZE) *SIZE;
        }catch(Exception e)
        {
            
        }
            
        for(int i=-HEIGHT/2;i<HEIGHT/2;i++)
        {
            try{
                double val = -getValue(i / SIZE) * SIZE;
                g.drawLine(i + HEIGHT/2, (int) prev + HEIGHT/2, i+1 + HEIGHT/2, (int) val + HEIGHT / 2);
                prev = val;
            }catch(Exception e)
            {
                
            }
        }
        
    }
        
    public double getValue(double x) throws Exception
    {
        double y;
        
        //y = (x / (3-x*x+80)) * Math.pow(x,x+35);
        
        y = 3*x+5;
        
        return y;
    }
}
