package cnhalo.twoa.designpatterns.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��7�� ����1:33:00
 * 
 */
public class NameObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("name change to : " + arg);
	}

}
