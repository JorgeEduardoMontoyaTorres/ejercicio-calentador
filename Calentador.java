
/**
 Crear un nuevo proyecto en BlueJ: ejercicio-calentador. Crear una clase Calentador que contenga una sola variable
 de instancia de tipo entero: temperatura. Defina un constructor sin parámetros.
 La temperatura debe ser inicializada en el constructor con un valor de 15º.
 Defina los métodos de modificación calentar y enfriar cuyo efecto es aumentar o
 disminuir el valor de la temperatura en 5º respectivamente. Defina un método de
 acceso que retorne el valor de la temperatura. Hacer pruebas del proyecto creando un
 objeto calentador y enviándole los mensajes de calentar y enfriar para verificar su temperatura.

 Crear un nuevo repositorio en GitHub: ejercicio-calentador y subir (compartir) el proyecto de BlueJ en el repositorio de GitHub.

 Descargar el proyecto desde GitHub ejercicio-calentador y asignarle el nombre ejercicio-calentador-descargado.
 
 En el proyecto ejercicio-calentador-descargado, modificar la clase Calentador agregando
 una nueva variable de instancia entera: incremento. Modificar el constructor de tal
 manera que el valor inicial del incremento sea 3º. Registre los cambios realizados presionando
 el botón Commit y agregando un comentario desde BlueJ.

 Modifique los métodos calentar y enfriar de modo que usen el valor del incremento en lugar
 del valor explícito de 3º y que el valor mínimo del calefactor no sea menor que -10º ni mayor que 30º.
 Registre los cambios realizados presionando el botón Commit y agregando un comentario desde BlueJ.

 Finalmente, actualice el repositorio en GitHub presionando el botón Push.
 Verifique desde el navegador que se hayan subido los cambios.
 */

public class Calentador
{
    // instance variables
    private int temperatura;
    private int incremento;

    /**
     * Constructor for objects of class Calentador
     */
    public Calentador()
    {
        // initialise instance variables
        temperatura = 15;
        incremento = 3;
    }

    /**
     * Metodos de modificación
     */
    public void calentar()
    {
        if(temperatura <= 30)
            temperatura = temperatura + incremento;
    }
    
    public void enfriar()
    {
        if(temperatura >= -10)
            temperatura = temperatura - incremento;
    }
    
    /**
     * Metodo de acceso
     */
    public int actualizar()
    {
        return temperatura;
    }
}
