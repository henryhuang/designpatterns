package cnhalo.twoa.designpatterns.behavior.observer;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月7日 下午1:38:15
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		PriceObserver priceObserver = new PriceObserver();
		NameObserver nameObserver = new NameObserver();
		
		// 加入观察者
		product.addObserver(priceObserver);
		product.addObserver(nameObserver);
		
		product.setName("名字");
		product.setPrice(10000);
		
	}
}
