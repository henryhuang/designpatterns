package cnhalo.twoa.designpatterns.structure.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月6日 下午1:42:47
 * 
 */
public class Decorator implements Work{
	
	private Work work;
	
	// 额外增加的功能被打包在List中
	private List<String> others = new ArrayList<String>();
	
	// 在构造器中使用组合new方式，引入Work对象
	public Decorator(Work work) {
		this.work = work;
		others.add("挖坑");
		others.add("钉木板");
	}
	
	@Override
	public void insert() {
		newMethod();
	}

	//在新方法中，在insert之前增加其他方法，这里次序先后由用户灵活指定
	public void newMethod() {
		otherMethod();
		work.insert();
	}
	
	public void otherMethod() {
		ListIterator<String> iterator = others.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
