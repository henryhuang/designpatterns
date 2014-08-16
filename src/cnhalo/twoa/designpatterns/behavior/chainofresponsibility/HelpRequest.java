package cnhalo.twoa.designpatterns.behavior.chainofresponsibility;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月7日 下午1:48:37
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
		System.out.println("执行Help > " + type);
	}

}
