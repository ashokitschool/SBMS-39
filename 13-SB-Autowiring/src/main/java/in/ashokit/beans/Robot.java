package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Robot {

	private IChip chip;
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public Robot(IChip chip) {
		this.chip = chip;
	}

	public void doWork() {

		System.out.println("Injected :: " + chip.getClass().getName());

		boolean status = chip.process();

		if (status) {
			System.out.println("Robot is working...");
		} else {
			System.out.println("Robot is having fault...");
		}
	}

}
