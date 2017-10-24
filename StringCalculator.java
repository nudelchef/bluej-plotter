
import java.lang.Math;

public class StringCalculator
{
    
    public static float calculate(String text)
    {
        text = text.trim();
        text = text.replace(" ", "");
        
        // / ((3 * 4) / (3 + 5 * 8)) ^ 3
        
        // / http://myregexp.com/
        // / ([(]{1})(.*)([)]{1})
        
        
        
        for (int i = 0 ; i < text.length() ; i++)
        {
            char CHAR = text.charAt(i);
        }
        
        return 0;
    }
    
    protected class MathElement
    {
        private String t;
        
        
        public MathElement(String t)
        {
            this.t = t;
        }
        
        public float getValue()
        {
            return 0;
        }
        
    }
    
}
