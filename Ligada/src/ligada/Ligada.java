
package ligada;

import javax.swing.JOptionPane;

/**
 *
 * @author redlds
 */
public class Ligada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista li = new Lista();
        int opc=0,el;
        do{
            try{
                opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un elemento al inicio de las lista"
                        +"\n2.Agregar un elemnto al final de la lista"
                        + "\n3. Mostrar Datos\n"
                        + "4. Salir"));
                switch (opc){
                    case 1:
                        try{
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta Elemento" ));
                            // agregar el Nodo
                              li.agregarI(el);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Esta mal"+n.getMessage());
                        }
                        break;
                        case 2:try{
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta Elemento" ));
                            // agregar el Nodo
                              li.Agregarfin(el);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Esta mal"+n.getMessage());
                        }
                        break;
                          
                        case 3:
                            li.imprimir();
                        break;
                        default:
                            JOptionPane.showMessageDialog(null,"Sigue estando mal");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Esta mal"+e.getMessage());
            }
        }while (opc!=3);
    }
    
}
