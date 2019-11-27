package javasmmr.zoowsome.models.employees;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.*;

public interface Caretaker_I {
	public String takeCareOf(Animals animal);

	void decodeFromXml(Element element);
}
