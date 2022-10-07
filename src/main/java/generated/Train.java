
package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Train complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Train"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locomotive-type" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="form-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="wagons"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="wagon" type="{}Wagon" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Train", propOrder = {
    "id",
    "name",
    "locomotiveType",
    "formDate",
    "wagons"
})
public class Train {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "locomotive-type", required = true)
    protected Object locomotiveType;
    @XmlElement(name = "form-date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar formDate;
    @XmlElement(required = true)
    protected Train.Wagons wagons;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the locomotiveType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocomotiveType() {
        return locomotiveType;
    }

    /**
     * Sets the value of the locomotiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocomotiveType(Object value) {
        this.locomotiveType = value;
    }

    /**
     * Gets the value of the formDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFormDate() {
        return formDate;
    }

    /**
     * Sets the value of the formDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFormDate(XMLGregorianCalendar value) {
        this.formDate = value;
    }

    /**
     * Gets the value of the wagons property.
     * 
     * @return
     *     possible object is
     *     {@link Train.Wagons }
     *     
     */
    public Train.Wagons getWagons() {
        return wagons;
    }

    /**
     * Sets the value of the wagons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Train.Wagons }
     *     
     */
    public void setWagons(Train.Wagons value) {
        this.wagons = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="wagon" type="{}Wagon" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "wagon"
    })
    public static class Wagons {

        @XmlElement(required = true)
        protected List<Wagon> wagon;

        /**
         * Gets the value of the wagon property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wagon property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWagon().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Wagon }
         * 
         * 
         */
        public List<Wagon> getWagon() {
            if (wagon == null) {
                wagon = new ArrayList<Wagon>();
            }
            return this.wagon;
        }

    }

}
