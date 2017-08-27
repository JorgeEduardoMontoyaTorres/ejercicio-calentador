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
     * Constructor for objects of class Calentador
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
     */
    public void calentar()
    {
        if(temperatura < max)
            temperatura = temperatura + incre;
    }
    
    public void enfriar()
    {
        if(temperatura > min)
            temperatura = temperatura - incre;
    }
    
    public void modificarIncremento(int incremento)
    {
        if(incremento > 0)
            incre = incremento;
    }
    
    /**
     * Metodo de acceso
     */
    public int actualizar()
    {
        return temperatura;
    }
}