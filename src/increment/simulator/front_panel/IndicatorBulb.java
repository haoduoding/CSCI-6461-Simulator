package increment.simulator.front_panel;

import increment.simulator.Chip;
/**
 * A simulated bulb, which can be on and off, indicating its input. It's going to take a bit input that is
 * either true or false, indicating whether it is to be turned to on or off.
 * 
 * A switch has one input: <br>
 * 		* input[1] indicating whether it's on or off.
 * @author Xu Ke
 *
 */
public class IndicatorBulb extends Chip {
	protected boolean status = false;
	public IndicatorBulb() {
		addPort("input", 1);
	}
	/**
	 * 
	 * @return The related bulb should be on or off.
	 */
	public boolean isOn() {
		return status;
	}
	
	@Override
	public boolean evaluate() {
		status = getPort("input").getBit(0);
		return false;
	}
}
