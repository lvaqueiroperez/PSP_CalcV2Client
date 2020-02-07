package calcv2_client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.Thread.sleep;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//IMPORTAR PROJECTO DEL SERVER EN EL CLIENTE PARA PODER CAMBIAR EL PUERTO E IP???
public class CalcV2_Client {

    public static void main(String[] args) {

        //cada cliente será un hilo REFLEJADO EN EL SERVIDOR
        //(en un caso real, cada cliente estaría en una máquina diferente o al menos en una ejecución diferente (?))
        //SE INICIAN N HILOS CON UN PUERTO E IP PREDETERMINADOS
        HiloClientes h = new HiloClientes();
        h.start();

    }

}
