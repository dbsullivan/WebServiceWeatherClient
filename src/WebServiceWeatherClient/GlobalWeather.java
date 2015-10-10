
package WebServiceWeatherClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GlobalWeather", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "http://www.webservicex.com/globalweather.asmx?WSDL")
public class GlobalWeather
    extends Service
{

    private final static URL GLOBALWEATHER_WSDL_LOCATION;
    private final static WebServiceException GLOBALWEATHER_EXCEPTION;
    private final static QName GLOBALWEATHER_QNAME = new QName("http://www.webserviceX.NET", "GlobalWeather");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.com/globalweather.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GLOBALWEATHER_WSDL_LOCATION = url;
        GLOBALWEATHER_EXCEPTION = e;
    }

    public GlobalWeather() {
        super(__getWsdlLocation(), GLOBALWEATHER_QNAME);
    }

    public GlobalWeather(WebServiceFeature... features) {
        super(__getWsdlLocation(), GLOBALWEATHER_QNAME, features);
    }

    public GlobalWeather(URL wsdlLocation) {
        super(wsdlLocation, GLOBALWEATHER_QNAME);
    }

    public GlobalWeather(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GLOBALWEATHER_QNAME, features);
    }

    public GlobalWeather(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GlobalWeather(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GlobalWeatherSoap
     */
    @WebEndpoint(name = "GlobalWeatherSoap")
    public GlobalWeatherSoap getGlobalWeatherSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET", "GlobalWeatherSoap"), GlobalWeatherSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GlobalWeatherSoap
     */
    @WebEndpoint(name = "GlobalWeatherSoap")
    public GlobalWeatherSoap getGlobalWeatherSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "GlobalWeatherSoap"), GlobalWeatherSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns GlobalWeatherSoap
     */
    @WebEndpoint(name = "GlobalWeatherSoap12")
    public GlobalWeatherSoap getGlobalWeatherSoap12() {
        return super.getPort(new QName("http://www.webserviceX.NET", "GlobalWeatherSoap12"), GlobalWeatherSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GlobalWeatherSoap
     */
    @WebEndpoint(name = "GlobalWeatherSoap12")
    public GlobalWeatherSoap getGlobalWeatherSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "GlobalWeatherSoap12"), GlobalWeatherSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns GlobalWeatherHttpGet
     */
    @WebEndpoint(name = "GlobalWeatherHttpGet")
    public GlobalWeatherHttpGet getGlobalWeatherHttpGet() {
        return super.getPort(new QName("http://www.webserviceX.NET", "GlobalWeatherHttpGet"), GlobalWeatherHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GlobalWeatherHttpGet
     */
    @WebEndpoint(name = "GlobalWeatherHttpGet")
    public GlobalWeatherHttpGet getGlobalWeatherHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "GlobalWeatherHttpGet"), GlobalWeatherHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns GlobalWeatherHttpPost
     */
    @WebEndpoint(name = "GlobalWeatherHttpPost")
    public GlobalWeatherHttpPost getGlobalWeatherHttpPost() {
        return super.getPort(new QName("http://www.webserviceX.NET", "GlobalWeatherHttpPost"), GlobalWeatherHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GlobalWeatherHttpPost
     */
    @WebEndpoint(name = "GlobalWeatherHttpPost")
    public GlobalWeatherHttpPost getGlobalWeatherHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "GlobalWeatherHttpPost"), GlobalWeatherHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GLOBALWEATHER_EXCEPTION!= null) {
            throw GLOBALWEATHER_EXCEPTION;
        }
        return GLOBALWEATHER_WSDL_LOCATION;
    }

}
