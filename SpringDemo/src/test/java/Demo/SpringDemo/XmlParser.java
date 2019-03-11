package Demo.SpringDemo;
import javax.xml.parsers.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.w3c.dom.*;
import java.io.*;

public class XmlParser {
	public static String getTagValue(String xml, String tagName){
	    return xml.split("<"+tagName+">")[1].split("</"+tagName+">")[0];
	    
	
	}
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		String xml= "<data>" +
			      " <employee>" +
			      "   <name>John</name>" +
			      "   <title>Manager</title>" +
			      " </employee>" +
			      " <employee>" +
			      "   <name>Sara</name>" +
			      "   <title>Clerk</title>" +
			      " </employee>" +
			      "</data>";
		String msg =  "<data>" +
			      " <employee>" +
			      "   <name>John</name>" +
			      "   <title>Manager</title>" +
			      " </employee>" +
			      " <employee>" +
			      "   <name>Sara</name>" +
			      "   <title>Clerk</title>" +
			      " </employee>" +
			      "</data>";
		DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document parse = newDocumentBuilder.parse(new ByteArrayInputStream(msg.getBytes()));
		System.out.println(parse.getFirstChild().getTextContent());
		
		
	
	}
	

}
