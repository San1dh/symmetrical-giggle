// Multiple Inheritance using Interface

interface launchSequence
{
	public void countDown();
	public void engineStart();
}

interface guidance
{
	public void active();
	public void altitude();
}

interface endSequence
{
	public void shutDown();
	public void staging();
}

class Rocket implements launchSequence, guidance, endSequence
{
	public void countDown()
	{
		System.out.println("Countdown starting");
	}
	public void engineStart()
	{
		System.out.println("Engines starting");
	}

	public void active()
	{
		System.out.println("Guidance is active");
	}
	public void altitude()
	{
		System.out.println("Current altitude : -----");
	}
	
	public void shutDown()
	{
		System.out.println("Engines cut-off");
	}
	public void staging()
	{
		System.out.println("Staging");
	}
}

class multipleInheritance1
{
	public static void main(String args[])
	{
		Rocket ob1 = new Rocket();
		ob1.countDown();
		ob1.engineStart();
		ob1.active();
		ob1.altitude();
		ob1.shutDown();
		ob1.staging();
	}
}
