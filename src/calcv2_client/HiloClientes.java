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

public class HiloClientes extends Thread {

    //CADA CLIENTE DEBE TENER SU PUERTO Y SU OP
    @Override
    public void run() {
        //OJO!! EN UN CLIENTE REAL NO SE USARÍAN ESTOS HILOS
        //AQUÍ SE USAN HILOS PARA SIMULAR QUE HAY VARIOS CLIENTES CONECTADOS,
        //EN LA REALIDAD HABRÍA VARIOS PROGRAMAS A LA VEZ CONECTADOS
        UICliente obj = new UICliente();
        obj.setVisible(true);

        System.out.println("iniciando hilo cliente");

    }

}
