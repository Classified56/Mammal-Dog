public class Dog extends Mammal
	{
	int age = 5;
	
	public Dog()
		{
		System.out.println("I’m a dog.");
		}
	public Dog(String name)
		{
		System.out.println("I’m a dog named " + name);
		}
	public Dog(int age)
		{

		System.out.println("I'm " + age + " years old.");
		}
	public void makeNoise()
		{
		System.out.println("Woof woof");
		}
	public void doSomeCoolDogThing()
		{
		System.out.println("This is my cool dog thing.");
		}
	}