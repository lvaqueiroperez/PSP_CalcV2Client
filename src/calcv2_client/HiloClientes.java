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

    @Override
    public void run() {

        UICliente obj = new UICliente();
        obj.setVisible(true);

        System.out.println("acabando hilo");

    }

}
