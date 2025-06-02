package antony;
import robocode.*;

public class BotBarataKiller extends Robot
{
	public void run() {
		while(true) {
      // fica girando infinitamente para escanear um robo
			turnGunRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
    // vira a arma um pouco mais para a direita, fazendo um predict de onde o robo estará (supondo que ele ande infinitamente pelas paredes na direção da direita)
		turnGunRight(10);
		fire(1);
	}
}
