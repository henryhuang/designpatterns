package cnhalo.twoa.designpatterns.behavior.chainofresponsibility;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��7�� ����1:47:10
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
			System.out.println("�����Ǵ���Help�ľ������");
			request.execute();
		} else {
			// ���ݵ���һ��
			if(successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}
