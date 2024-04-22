/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

import Interfaz.MenuTaller;
import java.io.File;
import Util.AnalizeXML;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
/**
 *
 * @author Oscar Campos Argueda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String filePath = "../../../XML's/clientes.xml";
//        //AnalizeXML node = new AnalizeXML(filePath);
//        File file = new File(filePath);
//        System.out.println(file.getPath());
//        System.out.println(file.exists());
        //  node.prepareXML();
        MenuTaller vent = new MenuTaller();
        
        vent.main(args);
    }
    
}
