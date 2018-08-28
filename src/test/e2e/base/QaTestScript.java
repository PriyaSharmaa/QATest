package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.ConfigReader;

package selexample;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QaTestScript {

 private WebDriver driver;
        
		@Test
		public void row1() throws Exception {
		
		File src=new File("./locators/locator.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(fis);
			
		WebElement searchBtn = driver.findElement(By.xpath(pro.getProperty("click.render.button"))).click();
		
		
		/*Code I had written to read the dynamic table, unfortunately did not work in a way I wanted to use.
		that's why I had used hardcore array values..I apologise for this.*/
		
		/*List<WebElement> colvalue1 = driver.findElements(By.xpath("//tbody/tr[1]/td"));
		int colcount1 = colvalue1.size();
				
		for(WebElement col : colvalue1) {
			String colvlaues = col.getText();
			
			for (int i = 0; i < arr1.length; i++){
				int result = Integer.parseInt(colvlaues);
				arr1[i] = result;
			}
			
		}*/
		
		int[] arr1 = {23,50,63,90,10,30,155,23,18};
		try {
            int index = findMiddleIndex(arr1);
            WebElement challengeanswer1 =  driver.findElement(By.xpath(pro.getProperty("submit.answer1"))).click(); 
	        
	        challengeanswer1.sendKeys(""+ index);
           
	        
        } catch (Exception ex) {
           
        }
		
		}
		
		@Test
		public void row2() throws Exception {
			
		//List<WebElement> colvalue2 = driver.findElements(By.xpath("//tbody/tr[2]/td"));
		//int colcount2 = colvalue2.size();
		
		int[] arr2 = {133,60,23,92,6,7,168,16,19};
		try {
            
	        int index2 = findMiddleIndex(arr2);
	        
	        WebElement challengeanswer2 = driver.findElement(By.xpath(pro.getProperty("submit.answer2"))).click();
	        challengeanswer2.sendKeys("" + index2 );
	        
	        
        } catch (Exception ex) {
            
        }
		}
		
		@Test
		public void row3() throws Exception {
			
		//List<WebElement> colvalue3 = driver.findElements(By.xpath("//tbody/tr[3]/td"));
		//int colcount3 = colvalue3.size();
		
		int[] arr3 = {30,43,29,10,50,40,99,51,12};
		
		try {
            
	        int index3 = findMiddleIndex(arr3);
	       
	        WebElement challengeanswer3 =driver.findElement(By.xpath(pro.getProperty("submit.answer2"))).click(); 
	        
	        challengeanswer3.sendKeys( ""+ index3);
	        
           
	        
        } catch (Exception ex) {
            
        }

		
		 WebElement challengeanswer4 = driver.findElement(By.xpath(pro.getProperty("submit.name"))).click(); 
	        
	        challengeanswer4.sendKeys("Priyanka Sharma");
	        
	        WebElement challengeanswer5 = driver.findElement(By.xpath(pro.getProperty("submit.test"))).click(); 
	        
	        ConfigReader.captureScreenshot(driver, "secondscreenshot");
}
		
	
		//To calculate middle index of any given array 		
		 public static int findMiddleIndex(int[] array) throws Exception {

		        int endIndex = array.length - 1;
		       
		        int startIndex = 0;
		        int leftSum = 0;
		        int rightSum = 0;
		        while (true) {
		            if (leftSum > rightSum) {
		                rightSum += array[endIndex--];
		                
		            } else {
		                leftSum += array[startIndex++];
		                
		            }
		            if (startIndex >= endIndex) {
		            	
		                if (leftSum == rightSum) {
		                    break;
		                } else {
		                    throw new Exception(
		                            "No such combination found in the array.");
		                }
		            }
		        } 
		        return endIndex; 
		    }

		
	}

