package testdata;

public enum SendKeyData {
Send_key("java");
	
private String sendkeys;

SendKeyData( String sendkeys) {
	this.sendkeys=sendkeys;
}
public String getsendkeys() {
	return sendkeys;
}

}
