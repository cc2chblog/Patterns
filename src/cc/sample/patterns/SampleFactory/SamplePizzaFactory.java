package cc.sample.patterns.SampleFactory;

/**
 * 可以根据pizza的类型，生成一个pizza实例
 * 
 * @author cc
 *
 */
public class SamplePizzaFactory {

	private Pizza pizza;

	public SamplePizzaFactory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 根据客户要求的pizza类型，创建一个pizza的实例
	 * 
	 * @return Pizza
	 */
	public Pizza createPizza(String type) {
		if ("clam".equalsIgnoreCase(type)) {
			pizza = new ClamPizza();
		} else if ("greek".equalsIgnoreCase(type)) {
			pizza = new GreekPizza();
		} else {
			pizza = new VeggiePizza();
		}
		return pizza;
	}

}
