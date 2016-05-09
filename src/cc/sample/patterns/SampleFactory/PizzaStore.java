package cc.sample.patterns.SampleFactory;

/**
 * 1. PizzaStore用于创建一个pizza实例
 * 2. 完成各个披萨的制作：准备材料（prepare）、烘烤（bake）、切片（cut）、装盒（box）
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
