import java.io.*;
/**
 * Décrivez votre classe File ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

public class File 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    public static void write(String filename, String text) throws IOException
    {
        if (File.exists(filename)){ throw new IOException("fichier existant!");}
        try{
            FileWriter fileWriter = new FileWriter(filename);
            
            fileWriter.write("<svg viewBox="
                               +"\" 0 0 220 100\""
                               +" xmlns="
                               +"\"http://www.w3.org/2000/svg\""
                               +"> ");
            fileWriter.write(text);
            fileWriter.write(" </svg>");
            fileWriter.close();
            
        } catch (IOException error){
            throw new RuntimeException("IOException");
            //
        }
    }
      
    private static boolean exists(String filename)
    {
        java.io.File f = new java.io.File(filename);
        return (f.exists() && !f.isDirectory());
       
    }
}
