
package InicioSesion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente {
     public static void main(String args[]) {
         
        
             final String HOST="127.0.0.1";
             final int PUERTO= 5000;
             DataInputStream in;
             DataOutputStream out;
         try {
             
             Socket sc= new Socket(HOST, PUERTO);
             in= new DataInputStream(sc.getInputStream());
             out= new DataOutputStream(sc.getOutputStream());
             out.writeUTF("Verificación de credenciales");
             
                     } catch (IOException ex) {
            
         }
     }
    
}
