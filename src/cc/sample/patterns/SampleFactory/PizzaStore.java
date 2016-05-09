package cc.sample.patterns.SampleFactory;

/**
 * 1. PizzaStore���ڴ���һ��pizzaʵ��
 * 2. ��ɸ���������������׼�����ϣ�prepare�����濾��bake������Ƭ��cut����װ�У�box��
 * @author cc
 *
 */
public class PizzaStore {
	private Pizza pizza;
	private SamplePizzaFactory pizzaFactory;
	public PizzaStore(SamplePizzaFactory pizzaFactory) {
		// TODO Auto-generated constructor stub
		this.pizzaFactory =  pizzaFactory;
	}
	
	public Pizza oderPizza(String type){
		pizza = pizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
