;
/**
 * Décrivez votre classe Square ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Square
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private double x;
    private double y;
    private double largeur;
    private double longueur;
     
    
    /**
     * Constructeur d'objets de classe Square
     */
    public Square(double x, double y, double largeur, double longeur)
    {
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.longueur = longueur;
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
        return "carre : ("
        +(new Double (this.x)).toString()
        + " ,"
        +(new Double (this.y)).toString()
        +") hauteur : "
        +(new Double (this.largeur)).toString()
        +"longueur : "
        +(new Double (this.longueur)).toString();
        
    }
    
    public String toXML()
    {
        return "<rect x=\""
        +(new Double (this.x)).toString()
        +"\" y\""
        +(new Double (this.y)).toString()
        +"\" longueur cote = \""
        +(new Double (this.longueur)).toString()
        +"\" largeur cote = \""
        +(new Double (this.largeur)).toString();
    }
}
