package com.java.programs;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class RejexExample implements Comparable<RejexExample>{

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		
        // logger.debug("Parsing [" + mumPath + "]...");
        File mumFile = new File("C:\\Users\\rashmi-b\\Downloads\\Windows 10\\Windows10.0-KB4520011-x86.xml");
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document mumDoc = builder.parse(mumFile);
        mumDoc.getDocumentElement().normalize();

 

        Node assemblyIdentityNode = mumDoc.getElementsByTagName("assemblyIdentity").item(0);
        NamedNodeMap map = assemblyIdentityNode.getAttributes();
        //String name = map.getNamedItem("name") == null ? "" : map.getNamedItem("name").getNodeValue();
        String v = (map.getNamedItem("version") == null ? "" : map.getNamedItem("version").getNodeValue());
        System.out.println(v);
	}

	@Override
	public int compareTo(RejexExample arg0) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
