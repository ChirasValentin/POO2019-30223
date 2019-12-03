package javasmmr.zoowsome.repositories;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public abstract class EntityRepository<T extends XML_Parsable> {
	private final String xmlFilename;
	private final String entityTag;
		public EntityRepository(String xmlFilename,String entityTag)
		{
			this.xmlFilename=xmlFilename;
			this.entityTag=entityTag;
		}
		public void save(ArrayList<Animals> Animals) throws FileNotFoundException, XMLStreamException {
			XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
			XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.xmlFilename));

			XMLEventFactory eventFactory = XMLEventFactory.newInstance();
			XMLEvent end = eventFactory.createDTD("\n");
			StartDocument startDocument = eventFactory.createStartDocument();
			StartElement configStartElement = eventFactory.createStartElement("", "", "content");
			eventWriter.add(configStartElement);
			eventWriter.add(end);
			for (XML_Parsable animal : Animals) {
				StartElement sElement = eventFactory.createStartElement("", "", this.entityTag);
				eventWriter.add(sElement);
				eventWriter.add(end);
				animal.encodeToXml(eventWriter);
				EndElement eElement = eventFactory.createEndElement("", "", entityTag);
				eventWriter.add(eElement);
				eventWriter.add(end);
			}
			eventWriter.add(eventFactory.createEndElement("", "", "content"));
			eventWriter.add(eventFactory.createEndDocument());
			eventWriter.close();
			}

		protected abstract T getEntityFromXmlElement(Element element);
}
