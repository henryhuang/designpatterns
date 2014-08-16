package cnhalo.twoa.designpatterns.behavior.chainofresponsibility;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��7�� ����1:49:20
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
		System.out.println("ִ��WriteRequest > " + type);
	}

}
