package boundless_Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public abstract class Basedriver {
	private static FileInputStream url_file=null;
	private static Properties url_properties=null;
	public static WebDriver Driver=null;
	
	@Test
	public static void method_config() throws IOException{
		url_file=new FileInputStream(System.getProperty("user.dir")+"\\src\\boundless_Properties\\Boundless_URL's.properties");
		url_properties=new Properties();
		url_properties.load(url_file);
		Driver=new FirefoxDriver();
		Driver.get(url_properties.getProperty("boundless_home"));
	}
	/*public static void main(String args[]) throws IOException{
		method_config();
	}*/
}
