package cnhalo.twoa.designpatterns.structure.decorator;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月6日 下午1:42:34
 * 
 */
public class SquarePeg implements Work {

	@Override
	public void insert() {
		System.out.println("方形桩插入");
	}

}
