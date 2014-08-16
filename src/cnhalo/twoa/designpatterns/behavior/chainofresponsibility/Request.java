package cnhalo.twoa.designpatterns.behavior.chainofresponsibility;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��7�� ����1:45:45
 * 
 */
public abstract class Request {

	String type;
	
	/**
	 * 
	 *
	 * @param type
	 */
	public Request(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	/**
	 * request����������Ϊ����
	 */
	public abstract void execute();
	
}
