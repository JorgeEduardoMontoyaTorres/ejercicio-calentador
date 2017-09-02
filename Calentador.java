/**
 REALICE LAS SIGUIENTES MODIFICACIONES AL EJERCICIO-CALENTADOR
 Y ACTUALICE LOS CAMBIOS EN EL REPOSITORIO DE GITHUB.

 Agregar dos nuevos campos enteros: min y max. Los valores iniciales
 de min y max deben establecerse mediante parámetros del constructor.
 Modifique el método calentar para que la temperatura no pueda recibir
 un valor mayor que max. De manera similar modifique enfriar para que no
 permita que la temperatura tome un valor menor que min. Revise que la
 clase funcione correctamente creando algunos objetos Calentador en BlueJ.
 Registre los cambios realizados presionando el botón Commit y agregando
 un comentario desde BlueJ.

 Agregue un método modificarIncremento, que tiene un sólo parámetro entero
 que se usa para establecer el valor del incremento. Revise que la clase
 funcione correctamente creando algunos objetos Calentador en BlueJ.
 Si se pasa un valor negativo al método modificarIncremento,
 ¿sigue funcionando todo tal como se esperaba? Realice las validaciones
 necesarias para que este método no permita que se asigne un valor negativo.
 Registre los cambios realizados presionando el botón Commit y agregando
 un comentario desde BlueJ.

 Finalmente, actualice el repositorio en GitHub presionando el botón Push.
 Verifique desde el navegador que se hayan subido los cambios.
 */

public class Calentador
{
    // instance variables
    private int temperatura;
    private int incre;
    private int min;
    private int max;

    /**
     * Constructor para los objetos de la clase Calentador.
     * @param minimo Mínimo de temperatura a mostrar.
     * @param maximo Máximo de temperatura a mostrar.
     */
    public Calentador(int minimo, int maximo)
    {
        // initialise instance variables
        temperatura = 15;
        incre = 3;
        min = minimo;
        max = maximo;
    }

    /**
     * Metodos de modificación
     * Sube la temperatura segun el incremento definido.
     */
    public void calentar()
    {
        if(temperatura < max)
            temperatura = temperatura + incre;
    }
    
    /**
     * Baja la temperatura según el incremento definido.
     */
    public void enfriar()
    {
        if(temperatura > min)
            temperatura = temperatura - incre;
    }
    
    /**
     * Modifica el incremento de temperatura a la que uno desee.
     */
    public void modificarIncremento(int incremento)
    {
        if(incremento > 0)
            incre = incremento;
    }
    
    /**
     * Metodo de acceso
     * Actualiza la temperatura mostrandola.
     * @return Muestra la temperatura actual.
     */
    public int actualizar()
    {
        return temperatura;
    }
}