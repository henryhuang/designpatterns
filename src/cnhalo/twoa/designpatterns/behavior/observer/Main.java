package cnhalo.twoa.designpatterns.behavior.observer;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014��8��7�� ����1:38:15
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		PriceObserver priceObserver = new PriceObserver();
		NameObserver nameObserver = new NameObserver();
		
		// ����۲���
		product.addObserver(priceObserver);
		product.addObserver(nameObserver);
		
		product.setName("����");
		product.setPrice(10000);
		
	}
}
