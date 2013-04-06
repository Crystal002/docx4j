package org.docx4j.openpackaging.parts.WordprocessingML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;
import org.docx4j.XmlUtils;
import org.docx4j.bibliography.CTSourceType;
import org.docx4j.bibliography.CTSources;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.parts.JaxbCustomXmlDataStoragePart;
import org.docx4j.openpackaging.parts.PartName;

/**
 * @since 2.7
 */
public class BibliographyPart extends JaxbCustomXmlDataStoragePart<JAXBElement<org.docx4j.bibliography.CTSources>> {
	
	private static Logger log = Logger.getLogger(BibliographyPart.class);		

	public BibliographyPart() throws InvalidFormatException {
		super(new PartName("/customXml/item1.xml"));
		init();
	}
	
	
	public BibliographyPart(PartName partName) throws InvalidFormatException {
		super(partName);
		init();
	}

	public BibliographyPart(PartName partName, JAXBContext jc) throws InvalidFormatException {
		super(partName, jc);
		init();
	}
	
	public void importSources(BibliographyPart otherPart) {
		
		org.docx4j.bibliography.CTSources ourSources = (CTSources)XmlUtils.unwrap(this.getJaxbElement());
		
		org.docx4j.bibliography.CTSources otherSourcesTmp = (CTSources)XmlUtils.unwrap(otherPart.getJaxbElement());		
		org.docx4j.bibliography.CTSources otherSourcesCloned = XmlUtils.deepCopy(otherSourcesTmp);
		
		for (CTSourceType sourceType : otherSourcesCloned.getSource()) {
		
			// TODO duplicate detection.
			
			ourSources.getSource().add(sourceType);
		}
	}

}
