/**
 * 
 */
package Interface;

/**
 * @author GZhi·Dao
 * @time 2017年2月13日 下午5:35:19
 * @functions
 */
public class AnimalsTwo implements Animals {

	// 1.implements 是实现多个接口，接口的方法一般为空，必须重写才能使用 ;
	// C,D,C比如： class A extends B implements
	// 2.extends是继承父类，除了 final或者abstract
	// 3.abstract:可以增加子类，但是不能直接实例化

	public void eat() {
		System.out.println("eat");
	}

	public void travel() {
		System.out.println("travel");
	}

	public int noOfLegs() {
		return 0;
	}

	public static void main(String[] args) {
		AnimalsTwo m = new AnimalsTwo();
		m.eat();
		m.travel();
	}

}
