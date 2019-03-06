package factory;

/**
 * @author raguiarperez
 */
public abstract class Dialogo implements MetodosComunes{
   
    enum Tipo{CONSOLA,VENTANA}
    
     public static Dialogo crearDialogo(Tipo tipo){
        Dialogo dialogoCreado;
        switch (tipo){
            case CONSOLA:
                dialogoCreado=new ConsDialogo();
                return dialogoCreado;
            case VENTANA:
                dialogoCreado= new WinDialogo();
                return dialogoCreado;
            default:
                dialogoCreado=null;
                
        }
        return dialogoCreado;
    }
}