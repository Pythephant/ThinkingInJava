package innerclass;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	private List<Event> eventList = new ArrayList<>();

	public void addEvent(Event e) {
		eventList.add(e);
	}

	public void run() {
		while (eventList.isEmpty() == false) {
			for (Event e : new ArrayList<Event>(eventList)) {
				if (e.ready()) {
					e.action();
					System.out.println(e);
					eventList.remove(e);
				}
			}
		}
	}
}
