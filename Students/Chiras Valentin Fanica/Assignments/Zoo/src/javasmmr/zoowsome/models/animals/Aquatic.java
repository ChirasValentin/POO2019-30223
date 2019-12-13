package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.models.animals.waterType;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;



public abstract class Aquatic extends Animal {
	
	private Integer avgSwimDepth;
	private waterType waterType;
	public Aquatic(String name, Integer nrOfLegs, Double maintenanceCost, Double dangerPerc,
			Integer avg,waterType waterType) {
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.avgSwimDepth= avg;
		this.waterType=waterType;
	}

	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avg) {
		this.avgSwimDepth = avg;
	}

	public waterType getWaterType() {
		return this.waterType;
	}

	public void setWaterType(waterType waterType) {
		this.waterType = waterType;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"avgSwimDepth",String.valueOf(this.avgSwimDepth));
		createNode(eventWriter,"waterType",String.valueOf(this.waterType));
	}
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(javasmmr.zoowsome.models.animals.waterType.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}
