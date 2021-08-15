package jo.secondstep.singleton;

public class Refrigerator {

	public static void main(String[] args) {

		WiFi wifi=WiFi.getInstanceWifi();
		System.out.println("Refrigerator \n"+wifi);


	}

}
