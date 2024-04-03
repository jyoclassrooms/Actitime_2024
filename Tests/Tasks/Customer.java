package Tasks;

import org.testng.annotations.Test;

import Base.Actitime_web_Login;
import dataprovider.Customer_dp;
import pageObject.Tasks_page;
import pageObject.Time_Track_page;
import utility.Log_Report;

public class Customer extends Actitime_web_Login
{
	private Time_Track_page time_track=null;
	private Tasks_page task=null;
	@Test(dataProvider ="createcustomer" ,dataProviderClass = Customer_dp.class)
	public void create_customer(String customer,String customer_description) throws InterruptedException
	{
		time_track=new Time_Track_page(driver);
		task=new Tasks_page(driver);
		time_track.tasks().click();
		Thread.sleep(2000);
		task.project_cust().click();
		task.create_new_cust().click();
		task.cust_name().sendKeys(customer);
		Log_Report log=new Log_Report();
		log.log_info(customer);
		log.log_info(customer_description);	
		task.cust_desc().sendKeys(customer_description);
		task.create_cust_btn().click();
		Thread.sleep(2000);
	}

}
