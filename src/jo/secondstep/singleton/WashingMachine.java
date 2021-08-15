package jo.secondstep.singleton;

public class WashingMachine {

	public static void main(String[] args) {

		WiFi wifi=WiFi.getInstanceWifi();
		wifi.setUserName("WLAND");
		System.out.println("Washing Machine \n"+wifi);
		
		
		
		

	}

}
