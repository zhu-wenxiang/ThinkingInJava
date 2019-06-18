package operator;

class Tank{
	int level;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return level+"";
	}
}

public class Assigment {
	public static void main(String[] args) {
		Tank tank1=new Tank();
		Tank tank2=new Tank();
		tank1.level=9;
		tank2.level=47;
		System.out.println(tank1+";"+tank2);
		tank1=tank2;
		System.out.println(tank1+";"+tank2);
		tank1.level=27;
		System.out.print(tank1+";"+tank2);
	}
	//Tank tan3=new Tank();
	//tan3.level=32;
}
