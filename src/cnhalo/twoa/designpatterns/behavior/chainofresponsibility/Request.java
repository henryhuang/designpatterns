package cnhalo.twoa.designpatterns.behavior.chainofresponsibility;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月7日 下午1:45:45
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
	 * request真正具体行为代码
	 */
	public abstract void execute();
	
}
