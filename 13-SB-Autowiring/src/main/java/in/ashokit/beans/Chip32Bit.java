package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip32")
@Primary
public class Chip32Bit implements IChip {
	
	public Chip32Bit() {
		System.out.println("32Bit Chip :: Constructor");
	}

	@Override
	public boolean process() {
		System.out.println("Chip32bit processing started...");
		return true;
	}

}
