package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
    import java.lang.Integer;
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande

        for (int i=0; i<args.length; i++){ 
        int fahrenheit = Integer.parseInt(args[i]);
        float celsius = fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                                                                                // format
                                                                                // imposés
        }                                                   
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float c = (((float)f-32)*5)/9;
        int intc = (int)(c*10);
        c = (float)intc/10; 
        return c; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
    }

}
