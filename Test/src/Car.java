
public class Car implements Valuable {
private String name;
private double price;
	public Car(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	@Override
	public double estimateValue(int month)
	{
		
		return 0.8*price*(Math.pow(1-0.01, month));
	}
	public double estimateValue()
	{
		return 0.8*price*(Math.pow(1-0.01, 1));
		
	}
	public String toString()
	{
		return String.format("car name:"+name+"\n"+"initial price"+price);
		
	}
}
