import javax.swing.JFrame;
import java.awt.Dimension;

public class Frame extends JFrame
{    
    private Renderer renderer;
    
    public Frame()
    {
        renderer = new Renderer(650,650);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        //setLayout(null);
        setLocationRelativeTo(null);
        setName("jframe");
        setResizable(true);
        setTitle("Frame");
        
        add(renderer);
        
        pack();
        
        setVisible(true);
    }
    
    public void doStuff()
    {
        setSize(getPreferredSize());
    }
}
