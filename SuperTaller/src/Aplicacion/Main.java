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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
/**
 *
 * @author Oscar Campos Argueda
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        String filePath = "../XML/mecanicos.xml";
        AnalizeXML node = new AnalizeXML(filePath);
        node.prepareXML("mecanico");
        node.convertXMLtoArrList();
        System.out.println("------------------");
        //System.out.println(node.getAttrList());
        System.out.println(node.getNodeList().item(0).getChildNodes().item(3).getChildNodes().item(0).getNodeType());
        System.out.println("".equals(node.getNodeList().item(0).getChildNodes().item(2).getTextContent().trim()));
        System.out.println(node.getAttrList());
//        Node first = node.getNodeList().item(0);
//        first.normalize();
//        System.out.println(node.getNodeList().getLength());
//        System.out.println(first.getChildNodes().item(1).getNodeType() == Node.ELEMENT_NODE);
//        System.out.println();
//        int n = first.getChildNodes().getLength();
//        int m = node.getNodeList().getLength();
//        Node current;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                current = node.getNodeList().item(i).getChildNodes().item(j);
//                if(current.getNodeType() == Node.ELEMENT_NODE) {
//                    System.out.println(
//                      current.getNodeName() + ": " + current.getTextContent());
//                }
//            }
//        }
        //MenuTaller vent = new MenuTaller();
        
        //vent.main(args);
    }
    
}
