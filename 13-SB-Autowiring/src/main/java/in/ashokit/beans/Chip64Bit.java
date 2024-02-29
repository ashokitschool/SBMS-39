package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component("chip64")
public class Chip64Bit implements IChip{
	
	public Chip64Bit() {
		System.out.println("Chip64Bit : Constructor");
	}
	
	@Override
	public boolean process() {
		System.out.println("Chip64bit processing started...");
		return true;
	}


}
