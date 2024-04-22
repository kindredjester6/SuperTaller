/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Oscar Campos Argueda
 */
public class AnalizeXML {
    String docDir;
    NodeList nodeList;
    ArrayList<String> attrList;

    public AnalizeXML(String docDir) {
        this.docDir = docDir;
    }
    
    public void prepareXML() throws ParserConfigurationException, SAXException, IOException{
        System.out.println(docDir);
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(new File(docDir));
        doc.getDocumentElement().normalize();
        nodeList = doc.getChildNodes();
    }
    
    public ArrayList<String> convertXMLtoArrList(){
        
        return new ArrayList<>();
    }

    public ArrayList<String> getAttrList() {
        if(attrList.isEmpty()){
            convertXMLtoArrList();
        }
        return attrList;
    }

    public NodeList getNodeList() {
        return nodeList;
    }
    
}
