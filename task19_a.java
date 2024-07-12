package task;
abstract class Employee 
{
	int code;
	String name;
	public abstract void salary();
	public abstract void fly();
	public Employee()
	{
		System.out.println("emp base ctor");
	}
	public Employee(int id , String n )
	{System.out.println("emp base ctor.para");
	code=id; name=n;
	}
}
class Manager extends Employee
{double bonus;
	public Manager(int i, String n)
{
	super(i,n);
	System.out.println("ctor..manager");
}
	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("Rs 50,000 salary");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Moon....");
	}
}
class Supervisor extends Employee
{double bonus;
public Supervisor(int i, String n)
{
	super(i,n);
	System.out.println("ctor. Supervisor");
}

@Override
public void salary() {
	// TODO Auto-generated method stub
	System.out.println("Rs 30,000"+this.code+this.name);
}
@Override
public void fly() {
	// TODO Auto-generated method stub
	System.out.println("sun....");
	}
}
public class task19_a {
	public static void main(String[] args) {	
	//is A relation
	//has A relation (containment)
	//stream,console classes
	//string tokenizer
	//Overridden,overloading
	//super allow to access parent class from this
	//this allow u to current object	
		Manager m=new Manager(1,"ram");
		Employee p=new Manager(1,"ram");
		p.salary();	
		p=new Supervisor(2,"rama");
		p.salary();
	}
}