import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


/*Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utilizar un objeto HashMap para almacenar los pares de palabras.
Escoger al azar 5 palabras en español del mini diccionario.
Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
Al final debe mostrar por consola cuántas respuestas correctas e incorrectas tiene el usuario.*/

public class Main {
    public static void main(String[] args) {
        //Inicializar el HashMap con las palabras del diccionario
        HashMap<String, String> diccionario = new HashMap<String, String>();
        Scanner scan = new Scanner (System.in);

        diccionario.put("rosado", "pink");
        diccionario.put("gris", "grey");
        diccionario.put("mesa", "table");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("habitación", "bedroom");
        diccionario.put("cama", "bed");
        diccionario.put("arbol", "tree");
        diccionario.put("sol", "sun");
        diccionario.put("parque", "park");
        diccionario.put("iglesia", "church");
        diccionario.put("colegio", "school");
        diccionario.put("libro", "book");
        diccionario.put("biblioteca", "library");
        diccionario.put("calle", "street");
        diccionario.put("música", "music");
        diccionario.put("mar", "sea");
        diccionario.put("luz", "light");
        diccionario.put("edificio", "building");
        diccionario.put("camino", "road");

        // solicitar al usuario que traduzca las palabras aleatorias que se le darán

        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random aleatorio = new Random();
        String[] palabrasUsuario = new String[5];
        //se inicio un bucle para seleccionar las cinco palabras y mostrarselas al usuario
        for (int i = 0; i < 5; i++) {
            palabrasUsuario[i] = palabras[aleatorio.nextInt(palabras.length)];
        }

        //Solicitar al usuario que traduzca las palabras al inglés y verificar respuestas
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        for (String palabra : palabrasUsuario) {
            System.out.print("Traduzca '" + palabra + "' al inglés: ");
            String respuesta = scan.nextLine().trim().toLowerCase();
            if (respuesta.equals(diccionario.get(palabra))) {
                respuestasCorrectas++;
                System.out.println("¡Correcto!");
            } else {
                respuestasIncorrectas++;
                System.out.println("Te equivocaste. La respuesta correcta es '" + diccionario.get(palabra) + "'.");
            }
        }

        // imprirmir resultado en consola
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scan.close();
    }

}