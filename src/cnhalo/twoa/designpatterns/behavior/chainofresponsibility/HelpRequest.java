package cnhalo.twoa.designpatterns.behavior.chainofresponsibility;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��7�� ����1:48:37
 * 
 */
public class HelpRequest extends Request {

	/**
	 *
	 * @param type
	 */
	public HelpRequest(String type) {
		super(type);
	}

	@Override
	public void execute() {
		System.out.println("ִ��Help > " + type);
	}

}
