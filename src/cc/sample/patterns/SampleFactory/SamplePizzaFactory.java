package cc.sample.patterns.SampleFactory;

/**
 * ���Ը���pizza�����ͣ�����һ��pizzaʵ��
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
	 * ���ݿͻ�Ҫ���pizza���ͣ�����һ��pizza��ʵ��
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
