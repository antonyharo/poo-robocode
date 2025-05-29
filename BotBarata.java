package antony;
import robocode.*;

public class BotBarata extends Robot
{
	public double degrees;
	
	public void run() {
		while (true) {
			ahead(99999);
		}
    }
	
	public void onHitWall(HitWallEvent event) {
		setDebugProperty("angulo da colisao da parede", String.valueOf(event.getBearing()));
		degrees = 90 - event.getBearing();

		turnLeft(degrees);
	}
}
