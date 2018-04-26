package myPackage;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Class1 {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException, SAXException, IOException {
		
		//create content of xml
		
	
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document doc=db.newDocument();
		
		Element ele=doc.createElement("Html");
		Element ele1=doc.createElement("Head");
		Element ele2=doc.createElement("Body");
		Element ele3=doc.createElement("Title");
		
		ele3.setAttribute("name", "xml-page");
		ele3.setTextContent("Java based XML example");
		
		Element ele4=doc.createElement("H1");
		
		ele4.setAttribute("id", "1");
		ele4.setTextContent("Heading text");
		
		doc.appendChild(ele);
		ele.appendChild(ele1);
		ele1.appendChild(ele2);
		ele2.appendChild(ele3);
		ele2.appendChild(ele4);
		
		
		DOMSource source=new DOMSource(doc);
		StreamResult dest=new StreamResult(new File("myXml.xml"));
		
		TransformerFactory tf=TransformerFactory.newInstance();
		Transformer t=tf.newTransformer();
		
		t.transform(source, dest);
		
		//reading xml
		
		Document doc1=db.parse("myXml.xml");
		System.out.println(doc1.getDocumentElement().getNodeName());
	
	}
}
