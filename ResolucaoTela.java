package aula4.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Jose Lourenço
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        
        Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();
                      
            System.out.println("Resolução da Tela é: " + d.width + " x " + d.height + "px. ");
    }
}
