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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Oscar Campos Argueda
 */
public class AnalizeXML {
    String docDir;
    NodeList nodeList;
    ArrayList<String[]> attrList;

    public AnalizeXML(String docDir) {
        this.docDir = docDir;
        attrList = new ArrayList<>(); 
    }
    
    public void prepareXML(String etiqueta) throws ParserConfigurationException, SAXException, IOException{
        System.out.println(docDir);
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(new File(docDir));
        doc.getDocumentElement().normalize();
        this.nodeList = doc.getElementsByTagName(etiqueta);
    }
    
    public void convertXMLtoArrList(){
        Node first = nodeList.item(0);
        first.normalize();
        System.out.println(nodeList.getLength());
        System.out.println(first.getChildNodes().item(1).getNodeType() == Node.ELEMENT_NODE);
        System.out.println();
        int n = first.getChildNodes().getLength();
        int m = nodeList.getLength();
        Node firstNode;
        Node SecondNode;
        String[] Atributos;
        int count;
        for (int i = 0; i < m; i++) {
            Atributos = new String[n];
            count = 0;
            firstNode = nodeList.item(i);
            Atributos[count] = firstNode.getAttributes().item(0).getNodeValue();
            count ++;
            for (int j = 0; j < n; j++) {
                SecondNode = firstNode.getChildNodes().item(j);
                //"".equals(node.getNodeList().item(0).getChildNodes().item(2).getTextContent().trim()
                if(!"".equals(SecondNode.getTextContent().trim())) 
                {
                    //System.out.println(SecondNode.getTextContent().trim() + SecondNode.getChildNodes().getLength());
                    if(SecondNode.getChildNodes().getLength() > 1){
                        for (int k = 0; k < SecondNode.getChildNodes().getLength(); k++) {
                            if(Node.ELEMENT_NODE == SecondNode.getChildNodes().item(k).getNodeType()){
                                Atributos[count] = SecondNode.getChildNodes().item(k).getTextContent().trim();
                                count ++;
                            }
                        }
                    }else{
                        Atributos[count] = SecondNode.getTextContent();
                                count ++;
                    }
                }
            }
            attrList.add(Atributos);
        }
    }

    public ArrayList<String[]> getAttrList() {
        if(attrList.isEmpty()){
            convertXMLtoArrList();
        }
        return attrList;
    }

    public NodeList getNodeList() {
        return nodeList;
    }
    
}
