package Accessmodifier;

public class accessmodifyclass2  extends AccessModClass1
{

	public static void main(String[] args)
	{
		AccessModifierExample ob= new AccessModifierExample();
		System.out.println("Default Variable: " +ob.defaultVariable);
		System.out.println("Protected Variable: " +ob.protectVariable);
		System.out.println("Public Variable: " +ob.publicVariable);
		
	}

}
