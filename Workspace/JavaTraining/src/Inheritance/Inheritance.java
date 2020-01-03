package Inheritance;

abstract class Animal{
	abstract void makeNoise();
	abstract void roam();
	abstract void eat();
	void sleep() {
		System.out.println("Animal Sleeps");
	}
}

abstract 

class Feline extends Animal{
	
	@Override
	void roam() {
		// TODO Auto-generated method stub
		System.out.println("Feline Roams");
	}

}

class Cat extends Feline{
	@Override
	void eat() {
		System.out.println("Drinks milk");
	}

	@Override
	void makeNoise() {
		System.out.println("Meow");
	}


}

class Lion extends Feline{
	@Override
	void eat() {
		System.out.println("Lion hunts deer");
	}
	
	@Override
	void makeNoise() {
		System.out.println("Lion roar");
	}
}

class Tiger extends Feline{
	@Override
	void eat() {
		System.out.println("Tiger hunts buffallo");
	}
	
	@Override
	void makeNoise() {
		System.out.println("Tiger roar");
	}
}

 abstract class Hippo extends Animal{

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Hippo Roar");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats fish");
	}
	
}
 
class bharat extends Hippo{

	@Override
	void roam() {
		// TODO Auto-generated method stub
		System.out.println("Roams in CMR");
	}
	
	
}

abstract class Canine extends Animal{


	@Override
	void roam() {
		// TODO Auto-generated method stub
		System.out.println("Canine Roams");
	}
}

class Dog extends Canine{

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Barks");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eats");
	}
}

class Wolf extends Canine{

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Wolf eats");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Wolf eats");
	}
	
}


public class Inheritance {
public static void main(String[] args) {
	Animal Tommy=new Dog();
	Tommy.eat();
	Animal b=new bharat();
	b.eat();
	Animal tigre=new Tiger();
	tigre.makeNoise();
}
}
