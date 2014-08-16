package cnhalo.twoa.designpatterns.behavior.chainofresponsibility;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月7日 下午1:49:20
 * 
 */
public class WriteRequest extends Request {

	/**
	 *
	 * @param type
	 */
	public WriteRequest(String type) {
		super(type);
	}

	@Override
	public void execute() {
		System.out.println("执行WriteRequest > " + type);
	}

}
