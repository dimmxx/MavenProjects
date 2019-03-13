package lessons.lesson26_02032019_xml_parse.p3_denis_code;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomPa {

	public static void main(String[] args) {
		DocumentBuilderFactory factory=
				DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		DocumentBuilder builder=null;
		try {
			builder=factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		Document document=null;
		try {
			document=builder.parse(new File("Dota2.xml"));
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("OK");
		NodeList nodeListNames=document.getElementsByTagName("name");
		NodeList nodeListLevels=document.getElementsByTagName("level");
		for(int i=0;i<2;i++) {
		Node nodeName=nodeListNames.item(i);
		Node nodeLevel=nodeListLevels.item(i);
		System.out.print(nodeName.getNodeName()+"=");
		Element element=(Element) nodeName;
System.out.println(element.getTextContent());
System.out.print(nodeLevel.getNodeName()+"=");
Element elementL=(Element) nodeLevel;
System.out.println(elementL.getTextContent());

		}
		NodeList n=document.getElementsByTagNameNS("*","*");
		for(int i=1;i<n.getLength();i++) {
			System.out.println(n.item(i).getNodeName());
		}
	}

}
