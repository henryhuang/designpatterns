package cnhalo.twoa.designpatterns.behavior.chainofresponsibility;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月7日 下午1:47:10
 * 
 */
public class HelpHandler implements Handler {

	private Handler successor;
	
	public HelpHandler(Handler successor) {
		this.successor = successor;
	}
	
	@Override
	public void handleRequest(Request request) {
		if(request instanceof HelpRequest) {
			System.out.println("这里是处理Help的具体代码");
			request.execute();
		} else {
			// 传递到下一个
			if(successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}
