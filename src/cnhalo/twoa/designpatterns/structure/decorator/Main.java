package cnhalo.twoa.designpatterns.structure.decorator;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��6�� ����2:21:25
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Work squrePeg = new SquarePeg();
		Work decorator = new Decorator(squrePeg);
		decorator.insert();
		
	}
}
