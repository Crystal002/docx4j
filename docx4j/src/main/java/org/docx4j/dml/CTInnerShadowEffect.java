
package org.docx4j.dml;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_InnerShadowEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_InnerShadowEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://schemas.openxmlformats.org/drawingml/2006/main}EG_ColorChoice"/>
 *       &lt;/sequence>
 *       &lt;attribute name="blurRad" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_PositiveCoordinate" default="0" />
 *       &lt;attribute name="dist" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_PositiveCoordinate" default="0" />
 *       &lt;attribute name="dir" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_PositiveFixedAngle" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_InnerShadowEffect", propOrder = {
    "scrgbClr",
    "srgbClr",
    "hslClr",
    "sysClr",
    "schemeClr",
    "prstClr"
})
public class CTInnerShadowEffect implements Child
{

    protected CTScRgbColor scrgbClr;
    protected CTSRgbColor srgbClr;
    protected CTHslColor hslClr;
    protected CTSystemColor sysClr;
    protected CTSchemeColor schemeClr;
    protected CTPresetColor prstClr;
    @XmlAttribute
    protected Long blurRad;
    @XmlAttribute
    protected Long dist;
    @XmlAttribute
    protected Integer dir;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the scrgbClr property.
     * 
     * @return
     *     possible object is
     *     {@link CTScRgbColor }
     *     
     */
    public CTScRgbColor getScrgbClr() {
        return scrgbClr;
    }

    /**
     * Sets the value of the scrgbClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTScRgbColor }
     *     
     */
    public void setScrgbClr(CTScRgbColor value) {
        this.scrgbClr = value;
    }

    /**
     * Gets the value of the srgbClr property.
     * 
     * @return
     *     possible object is
     *     {@link CTSRgbColor }
     *     
     */
    public CTSRgbColor getSrgbClr() {
        return srgbClr;
    }

    /**
     * Sets the value of the srgbClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSRgbColor }
     *     
     */
    public void setSrgbClr(CTSRgbColor value) {
        this.srgbClr = value;
    }

    /**
     * Gets the value of the hslClr property.
     * 
     * @return
     *     possible object is
     *     {@link CTHslColor }
     *     
     */
    public CTHslColor getHslClr() {
        return hslClr;
    }

    /**
     * Sets the value of the hslClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTHslColor }
     *     
     */
    public void setHslClr(CTHslColor value) {
        this.hslClr = value;
    }

    /**
     * Gets the value of the sysClr property.
     * 
     * @return
     *     possible object is
     *     {@link CTSystemColor }
     *     
     */
    public CTSystemColor getSysClr() {
        return sysClr;
    }

    /**
     * Sets the value of the sysClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSystemColor }
     *     
     */
    public void setSysClr(CTSystemColor value) {
        this.sysClr = value;
    }

    /**
     * Gets the value of the schemeClr property.
     * 
     * @return
     *     possible object is
     *     {@link CTSchemeColor }
     *     
     */
    public CTSchemeColor getSchemeClr() {
        return schemeClr;
    }

    /**
     * Sets the value of the schemeClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSchemeColor }
     *     
     */
    public void setSchemeClr(CTSchemeColor value) {
        this.schemeClr = value;
    }

    /**
     * Gets the value of the prstClr property.
     * 
     * @return
     *     possible object is
     *     {@link CTPresetColor }
     *     
     */
    public CTPresetColor getPrstClr() {
        return prstClr;
    }

    /**
     * Sets the value of the prstClr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPresetColor }
     *     
     */
    public void setPrstClr(CTPresetColor value) {
        this.prstClr = value;
    }

    /**
     * Gets the value of the blurRad property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getBlurRad() {
        if (blurRad == null) {
            return  0L;
        } else {
            return blurRad;
        }
    }

    /**
     * Sets the value of the blurRad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBlurRad(Long value) {
        this.blurRad = value;
    }

    /**
     * Gets the value of the dist property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getDist() {
        if (dist == null) {
            return  0L;
        } else {
            return dist;
        }
    }

    /**
     * Sets the value of the dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDist(Long value) {
        this.dist = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDir() {
        if (dir == null) {
            return  0;
        } else {
            return dir;
        }
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDir(Integer value) {
        this.dir = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}