package cc.sample.patterns.SampleFactory;

public class PizzaFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamplePizzaFactory factory = new SamplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		store.oderPizza("veggie");
	}

}
