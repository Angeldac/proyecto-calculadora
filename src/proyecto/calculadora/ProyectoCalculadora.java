package proyecto.calculadora;


public class ProyectoCalculadora {

    public static void main(String[] args) {
       ventana cal = new ventana();
       cal.setTitle("calculadora");
       cal.setBounds(500,100, 700,600);
       cal.setResizable(false);
       cal.inserpanel();
       cal.textos();
       cal.botones();
    }
    
}
