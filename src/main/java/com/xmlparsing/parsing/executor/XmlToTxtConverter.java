package com.xmlparsing.parsing.executor;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class XmlToTxtConverter {
    public static void main(String[] args) {
        String xmlFilePath = "C:\\Users\\ramgo\\Desktop\\parsing\\parsing\\input1.xml"; // Replace with your XML file path
        String txtFilePath = "C:\\Users\\ramgo\\Desktop\\parsing\\parsing\\output1.txt"; // Replace with your desired TXT output file path

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFilePath);

            // Create a BufferedWriter to write to the TXT file
            BufferedWriter writer = new BufferedWriter(new FileWriter(txtFilePath));

            // Process the XML data and write it to the TXT file
            processElement(document.getDocumentElement(), writer);

            // Close the writer
            writer.close();

            System.out.println("XML data has been converted to " + txtFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processElement(Element element, BufferedWriter writer) throws IOException {
        NodeList children = element.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child instanceof Element) {
                Element childElement = (Element) child;

                    writer.write(childElement.getAttribute("CONNECTOR") + ":" + childElement.getAttribute("FROMINSTANCE"));
                    writer.newLine();
                // Write the element's tag name and text content to the TXT file



                // Recursively process child elements
                processElement(childElement, writer);
            }
        }
    }
}
