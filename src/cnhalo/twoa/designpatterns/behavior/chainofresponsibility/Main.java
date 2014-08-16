package cnhalo.twoa.designpatterns.behavior.chainofresponsibility;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月7日 下午1:52:20
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Request[] requests = new Request[] {
				new HelpRequest("help1"),
				new HelpRequest("help2"),
				new WriteRequest("write1"),
				new WriteRequest("write2"),
				new HelpRequest("help3"),
				new HelpRequest("help4")
		};
		
		for(Request request : requests) {
			processRequest(request);
		}
		
	}
	
	private static void processRequest(Request request) {
		Handler helpHandler = new HelpHandler(null);
		Handler writeHelper = new WriteHandler(helpHandler);
		writeHelper.handleRequest(request);
	}
}
