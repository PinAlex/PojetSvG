import java.io.*;
/**
 * Décrivez votre classe rectangle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class rectangle
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private double x;
    private double y;
    private double largeur;
    private double longueur;
     
    
    /**
     * Constructeur d'objets de classe rectangle
     */
    public rectangle(double x, double y, double largeur, double longueur)
    {
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.longueur = longueur;
        //Dddd
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
    
    public void scale(double facteur)
    {
       this.largeur *= facteur;
       this.longueur *= facteur;
    }
    
    public double [] boundingBox()
    {
       double [] tab = new double[4];
       tab[0] = this.x ;
       tab[1] = this.y;
       tab[2] = this.x+this.largeur;
       tab[3] = this.y+this.longueur;
       return tab;
    }
    public String toString()
    {
        return "rectangle : ("
        +(new Double (this.x)).toString()
        + ", "
        +(new Double (this.y)).toString()
        +" hauteur : "
        +(new Double (this.largeur)).toString()
        +"longueur : "
        +(new Double (this.longueur)).toString();
        
    }
    
    public String toXML()
    {
        return "<rect x=\""
        +(new Double (this.x)).toString()
        +"\" y=\""
        +(new Double (this.y)).toString()
        +"\" width= \""
        +(new Double (this.longueur)).toString()
        +"\" height = \""
        +(new Double (this.largeur)).toString()
        +"\" />";
                
        //<rect x="200" y="100" width="60" height="30" fill="red" stroke="blue" stroke-width="3" />
    }
    
   
    
    
}
