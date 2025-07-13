package week3.day2;

public class Chrome extends Browser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome ch=new Chrome();
		ch.openURL();
		ch.closeBrowser();
		ch.clearCache();
	}
  public void openIncognito()
  {
	  System.out.println("open Incognito ");
  }
  public void clearCache()
  {
	  System.out.println("Clear cache");
  }
}
