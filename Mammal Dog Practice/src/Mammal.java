public class Mammal
	{
	int age = 10;
	
	public Mammal()
		{
		System.out.println("I’m a mammal.");
		}
	public Mammal(String name)
		{
		System.out.println("I’m a mammal named " + name);
		}
	public Mammal(int age)
		{
		System.out.println("I'm " + age + " years old.");
		}
	public void makeNoise()
		{
		System.out.println("Growl");
		}
	public void doSomeCoolMammalThing()
		{
		System.out.println("This is my cool mammal thing.");
		}
	}