package week4.day1;

public class APIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient obj=new APIClient();
		obj.sendRequest("end");
		obj.sendRequest("end","body",true);
	}

	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint);

	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println(endpoint+requestBody+requestStatus);

	}
}
