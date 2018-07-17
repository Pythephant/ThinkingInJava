package innerclass;

public class GreenHouseController extends Controller {
	private boolean light = false;

	public Event turningLight(long delayTime) {
		return new Event(delayTime) {

			@Override
			public void action() {
				light = !light;

			}

			public String toString() {
				return "Turning the lightOn to " + light;
			}
		};
	}

	private boolean water = false;

	public Event turningWater(long delayTime) {
		return new Event(delayTime) {

			@Override
			public void action() {
				water = !water;
			}

			public String toString() {
				return "Turning the waterOn to " + water;
			}
		};
	}

	private String thermostat = "Day";

	public Event changeThermostat(long delayTime) {
		return new Event(delayTime) {

			@Override
			public void action() {
				if (thermostat == "Day")
					thermostat = "Night";
				else
					thermostat = "Day";
			}

			public String toString() {
				
				return "Changing the thermostat to " + thermostat;
			}
		};

	}

	public Event ringTheBell(long delayTime) {
		return new Event(delayTime) {

			@Override
			public void action() {
				// TODO Auto-generated method stub
				this.start();
				addEvent(this);
			}

			public String toString() {
				return "Bing!";
			}
		};
	}

	public Event getRestart(long delayTime, Event[] el) {
		return new Restart(delayTime, el);
	}

	private class Restart extends Event {
		private Event[] eventList;

		public Restart(long delayTime, Event[] el) {
			super(delayTime);
			this.eventList = el;
			for (Event e : el)
				addEvent(e);
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}

		public String toString() {
			return "Restarting system;";
		}

	}

	public static Event getTerminate(long delayTime) {
		return new Event(delayTime) {

			@Override
			public void action() {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			public String toString() {
				return "Terminating";
			}
		};
	}

}
