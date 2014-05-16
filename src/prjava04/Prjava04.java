/*

To change this template, choose Tools | Templates 

and open the template in the editor. 

*/

package prjava04;

import java.io.*; import java.net.*;

/**

*

* @author “El teu correu electrònic” */

public class Prjava04 {

/**

* @param args the command line arguments */

public static void main(String[] args) { try {

InetAddress addr = InetAddress.getLocalHost(); byte[] ipAddr = addr.getAddress();

String hostname = addr.getHostName(); System.out.println("hostname="+hostname);

System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));

System.out.println("gfdgdfg");
System.out.println("sdf");
System.out.println("234");
System.out.println("sdf");
System.out.println("erwe");
System.out.println("werwerwer");
System.out.println("23444");
System.out.println("erwe");
System.out.println("4we54");
System.out.println("23444");

}

catch (IOException e) { e.printStackTrace();
}

}

}
