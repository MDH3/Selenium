package abcd;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.modifier.SynchronizationState;

public class Loop {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
      WebDriver driver;
      WebDriverManager.chromedriver().setup();
      
      driver=new ChromeDriver();
      driver.get("https://www.facebook.com/reg/?rs=3");	
      
      WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
      
      Select select=new Select(month);
      List Actualvale=new ArrayList();
      
     //List<WebElement>listmonth= select.getOptions();
     //System.out.println(listmonth.size());
      //System.out.println(totalmont);
     // for (int i=0;i<list.size();i++){
      
     
		
	
    	   
      for( WebElement element:select.getOptions()){
    	  Actualvale.add(element.getText());
      }
      
      List expectedvalues=new ArrayList();
      
      expectedvalues.add("Month");
      expectedvalues.add("Jan");
      expectedvalues.add("Feb");
      expectedvalues.add("Mar");
      expectedvalues.add("Apr");
      expectedvalues.add("May");
      expectedvalues.add("Jun");
      expectedvalues.add("Jul");
      expectedvalues.add("Aug");
      expectedvalues.add("Sep");
      expectedvalues.add("Oct");
      expectedvalues.add("Nov");
      expectedvalues.add("Dec");
      for(int i=0;i<Actualvale.size();i++){
    	  System.out.println("Actual= "+Actualvale.get(i)+ "  Expectedvalues = "+expectedvalues.get(i));
    	 Assert.assertTrue(Actualvale.get(i).equals(expectedvalues.get(i)));
    	 if(Actualvale.equals(expectedvalues)){
    		System.out.println("Test case is passed");
    	 }
    	 
    	 else{  
     		System.out.println("Test case is faiied");

    			
    		}
    		
    		
    	 }
    	 
    	 
        
     // }catch(Exception e){
    	 // e.printStackTrace();
      //}
}
		//String val=list.add(i.getText());
		//System.out.println(val);
		//if(listmonth.get(i).getText().equals("Dec")){
			//listmonth.get(i).click();
			//break;
			
		}
		
		

      
      
      
      
      
	


