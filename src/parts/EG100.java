package parts;

public class EG100 extends Engine
{
	@Override
	protected void initialize() 
	{
		this.gasType = GasType.Gasoline;
		this.power = "100kW";
	}
}