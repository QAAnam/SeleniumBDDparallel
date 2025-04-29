package utilClass;

abstract class Abs
{
	abstract void legs();
	public static void animal()
	{
		System.out.println("Hi i am a complete method");
	}
	public abstract void color();
}

interface Car
{
	public void wheels();
	abstract void pane();
	public static void color1()
	{
		System.out.println("I am from interface class complete method");
	}
}

public class Practice1 extends Abs implements Car {

	@Override
	public void wheels() {
		System.out.println(" i am a incompete method from Car");
		
	}

	@Override
	public void color() {
		System.out.println(" i am a incompete method");
		
	}

	public static void main(String[] args) {
		Practice1 obj = new Practice1();
		obj.color();
		obj.wheels();
		obj.animal();
		Car.color1();
	}

	@Override
	public void pane() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void legs() {
		// TODO Auto-generated method stub
		
	}


}
