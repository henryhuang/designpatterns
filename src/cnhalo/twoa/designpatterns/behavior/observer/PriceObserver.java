package cnhalo.twoa.designpatterns.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��7�� ����1:33:14
 * 
 */
public class PriceObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Price change to : " + arg);
	}

}
