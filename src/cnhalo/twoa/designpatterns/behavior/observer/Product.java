package cnhalo.twoa.designpatterns.behavior.observer;

import java.util.Observable;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��7�� ����1:32:37
 * 
 */
public class Product extends Observable {

	private String name;
	private float price;
	
	public void setName(String name) {
		this.name = name;
		// ���ñ仯��
		setChanged();
		notifyObservers(name);
	}
	
	public void setPrice(float price) {
		this.price = price;
		// ���ñ仯��
		setChanged();
		notifyObservers(price);
	}
	
	public String getName() {
		return name;
	}
	
	public float getPrice() {
		return price;
	}
	
}
