package jo.secondstep.singleton;

public class WiFi {
    
	private WiFi() {
		
		this.setUserName("dlink");
	}
	
	private volatile static WiFi instanceWifi;
	
	String userName;

	@Override
	public String toString() {
		return "WiFi [userName=" + userName + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public static void setInstanceWifi(WiFi instanceWifi) {
		WiFi.instanceWifi = instanceWifi;
	}
	

	public static WiFi getInstanceWifi() {
		
		if (instanceWifi ==null)
		{
			synchronized (WiFi.class)
			{
				instanceWifi=new WiFi();
			}
		}
		return instanceWifi;
	}

	
	
	
}
