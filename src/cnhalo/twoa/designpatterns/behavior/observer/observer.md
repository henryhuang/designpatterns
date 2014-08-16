
# ** 设计模式之Observer**

转自 [解道](http://www.jdon.com)

所有的代码都在 [Github](http://henryhuang.github.com)

Observer(观察者)模式是比较常用的一个模式,尤其在界面设计中应用广泛,而本站所关注的是Java在电子商务系统中应用,因此想从电子商务实例中分析Observer的应用.

虽然网上商店形式多样,每个站点有自己的特色,但也有其一般的共性,单就"商品的变化,以便及时通知订户"这一点,是很多网上商店共有的模式,这一模式类似Observer patern观察者模式.
具体的说,如果网上商店中商品在名称 价格等方面有变化,如果系统能自动通知会员,将是网上商店区别传统商店的一大特色.这就需要在商品product中加入Observer这样角色,以便product细节发生变化时,Observer能自动观察到这种变化,并能进行及时的update或notify动作.

Java的API还为为我们提供现成的Observer接口Java.util.Observer.我们只要直接使用它就可以.

我们必须extends Java.util.Observer才能真正使用它:

1. 提供Add/Delete observer的方法;
2. 提供通知(notisfy) 所有observer的方法;


```
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
```

我们注意到,在product类中 的setXXX方法中,我们设置了 notify(通知)方法, 当Jsp表单调用setXXX(如何调用见我的另外一篇文章),实际上就触发了notisfyObservers方法,这将通知相应观察者应该采取行动了.

下面看看这些观察者的代码,他们究竟采取了什么行动:

```
//观察者NameObserver主要用来对产品名称(name)进行观察的
import java.util.Observable;
import java.util.Observer;

/**
 *
 *
 * @author	HuangYijie
 * @date	2014年8月7日 下午1:33:00
 * 
 */
public class NameObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("name change to : " + arg);
	}

}

public class PriceObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Price change to : " + arg);
	}

}

```

以下是场景类：

```

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
```