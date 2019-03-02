package lesson26_02032019.p2_xml_parse;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DomPa {

    public static void main(String[] args) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(false);

        DocumentBuilder builder = null;

        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        Document document = null;

        try {
            document = builder.parse(new File("dota2.xml"));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("OK");

        NodeList nodeListNames = document.getElementsByTagName("name");
        NodeList nodeListLevels = document.getElementsByTagName("level");

        Node nodeName = nodeListNames.item(0);
        Node nodeLevel = nodeListLevels.item(0);


        System.out.println(nodeName.getNodeName());
        Element element = (Element) nodeName;
        System.out.println(element.getTextContent());







        NodeList n = document.getElementsByTagNameNS("*", "*");
        for(int i = 1; i < n.getLength(); i++){
            System.out.println(n.item(i).getNodeName());
        }
    }



}
