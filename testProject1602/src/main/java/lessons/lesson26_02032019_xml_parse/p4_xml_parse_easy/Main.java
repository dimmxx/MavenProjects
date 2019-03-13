package lessons.lesson26_02032019_xml_parse.p4_xml_parse_easy;

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

public class Main {

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



        NodeList nodeListNames = document.getElementsByTagName("hero");

        System.out.println(nodeListNames.getLength());
        System.out.println(nodeListNames.item(0).getTextContent());

        Element root = document.getDocumentElement();
        System.out.println(root.getTagName());

        NodeList ndlst = root.getElementsByTagNameNS("*", "*");


        System.out.println(ndlst.item(5).getTextContent());





    }






}
