package factory;

import javax.swing.JOptionPane;

/**
 * @author raguiarperez
 */
public class WinDialogo extends Dialogo {

    @Override
    public void mostrar(String mensage) {
        JOptionPane.showMessageDialog(null,mensage);
    }
}