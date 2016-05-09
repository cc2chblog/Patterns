package cc.sample.patterns.SampleFactory;

/**
 * Pizza�Ķ���ͳһ�ӿ� 1.���ɸ��ֿ�ζ��pizza
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
