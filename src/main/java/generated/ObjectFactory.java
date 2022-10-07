
package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Train_QNAME = new QName("", "train");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Train }
     * 
     */
    public Train createTrain() {
        return new Train();
    }

    /**
     * Create an instance of {@link AddTrain }
     * 
     */
    public AddTrain createAddTrain() {
        return new AddTrain();
    }

    /**
     * Create an instance of {@link AddTrainResponse }
     * 
     */
    public AddTrainResponse createAddTrainResponse() {
        return new AddTrainResponse();
    }

    /**
     * Create an instance of {@link Wagon }
     * 
     */
    public Wagon createWagon() {
        return new Wagon();
    }

    /**
     * Create an instance of {@link Train.Wagons }
     * 
     */
    public Train.Wagons createTrainWagons() {
        return new Train.Wagons();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Train }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Train }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "train")
    public JAXBElement<Train> createTrain(Train value) {
        return new JAXBElement<Train>(_Train_QNAME, Train.class, null, value);
    }

}
