package Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class brokenLinkSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String linkUrl = "https://www.jmu.edu/admissions/applying.shtml";
		
		URL url = new URL(linkUrl);

        //Now we will be creating url connection and getting the response code
        HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
        httpURLConnect.setConnectTimeout(5000);
        httpURLConnect.connect();
        if(httpURLConnect.getResponseCode()>=400)
        {
        	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"-is a broken link");
        }    
   
        //Fetching and Printing the response code obtained
        else{
            System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
        }

	}

}
