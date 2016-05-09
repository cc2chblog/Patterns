package cc.sample.patterns.SampleFactory;

/**
 * Pizza的对外统一接口 1.生成各种口味的pizza
 * 
 * @author cc
 *
 */
public class Pizza {
	public Pizza() {

	}

	public void prepare() {
		System.out.println("Pizza Prepare!");
	}

	public void bake() {
		System.out.println("Pizza bake!");
	}

	public void cut() {
		System.out.println("Pizza cut!");
	}

	public void box() {
		System.out.println("Pizza box!");
	}
}
