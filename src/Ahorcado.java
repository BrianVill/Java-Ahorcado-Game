import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        //Scaner para que el usuario pueda ingresar datos
        Scanner scanner = new Scanner(System.in); 

        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia"; 
        int intentosMax = 5; 
        int intentos = 0; 
        boolean palabrasAdivinadas= false;
        
        //Arrays
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        //Bucle
        for (int i = 0; i < letrasAdivinadas.length; i++){

            letrasAdivinadas [i] = '_';
        }

        //Bucle 
        while (!palabrasAdivinadas && intentos < intentosMax){
            System.out.println("");
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor");
            
            char letra = Character.toLowerCase(scanner.next().charAt(0)); 
            
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++){

                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;   
                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto! Te quedan "+ (intentosMax - intentos) +" intentos.");
                
            }
            
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabrasAdivinadas = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta: " + palabraSecreta);
            }

        }

        if (!palabrasAdivinadas) {
            System.out.println("¡Que lastima te quedaste sin intentos.. GAME OVER!");
        }

        scanner.close();

    }
}
