package example;

import WebServiceWeatherClient.GlobalWeather;
import WebServiceWeatherClient.GlobalWeatherSoap;

/**
 * Created by Dave on 10/10/2015.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
//    WebServiceWeatherClient.GlobalWeatherSoap service = new GlobalWeather().getPort();  // given this object creation
    WebServiceWeatherClient.GlobalWeatherSoap service = new GlobalWeather().getPort(GlobalWeatherSoap.class);  // required code
//    WebServiceWeatherClient.GlobalWeatherSoap service = new GlobalWeather().getGlobalWeatherSoap12();  // another option, not using port

    //invoke business method
//    service.getWeather();  // given this method
    String result = service.getWeather("Milwaukee","United States");  // required code, look for signature/javadoc for this method.
    System.out.println(result);
  }
}
