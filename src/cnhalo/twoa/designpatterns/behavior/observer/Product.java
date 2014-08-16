package cnhalo.twoa.designpatterns.behavior.observer;

import java.util.Observable;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月7日 下午1:32:37
 * 
 */
public class Product extends Observable {

	private String name;
	private float price;
	
	public void setName(String name) {
		this.name = name;
		// 设置变化点
		setChanged();
		notifyObservers(name);
	}
	
	public void setPrice(float price) {
		this.price = price;
		// 设置变化点
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
