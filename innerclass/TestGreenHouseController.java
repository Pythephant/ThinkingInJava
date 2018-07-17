package innerclass;

public class TestGreenHouseController {
	public static void main(String[] args) {
		System.out.println("=========");
		GreenHouseController gc = new GreenHouseController();
		gc.addEvent(gc.ringTheBell(900));
		Event[] el = { gc.changeThermostat(0), gc.turningLight(200), gc.turningLight(400), gc.turningWater(600),
				gc.turningWater(800), gc.changeThermostat(1400) };
		gc.addEvent(gc.getRestart(2000, el));
		if (args.length == 1)
			gc.addEvent(gc.getTerminate(new Integer(args[0])));
		gc.run();
	}
}
