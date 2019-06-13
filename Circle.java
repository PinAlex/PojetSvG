
/**
 * Décrivez votre classe Circle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Circle
{
    double x,y,rayon;
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public Circle(double x, double y, double rayon)
    {
        this.x = x;
        this.y = y;
        this.rayon = rayon;  
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void translate(double dx, double dy)
    {
       this.x+=dx;
       this.y+=dy;
    }
    
    public void moveTo(double newx, double newy)
    {
       this.x = newx;
       this.y = newy;
    }
    
    public void scale(double s)
    {
       this.rayon = this.rayon*s;
    }
    public String toString()
    {
        return "cercle : point central ("
        +(new Double (this.x)).toString()
        + " ,"
        +(new Double (this.y)).toString()
        +") rayon : "
        +(new Double (this.rayon)).toString();
      
        
    }
    
}
