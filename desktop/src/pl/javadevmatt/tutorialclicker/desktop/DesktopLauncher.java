package pl.javadevmatt.tutorialclicker.desktop;

import pl.javadevmatt.tutorialclicker.TutorialClickerGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = TutorialClickerGame.GAME_NAME;
		config.width = TutorialClickerGame.WIDTH;
		config.height = TutorialClickerGame.HEIGHT;
		config.resizable = false;

		new LwjglApplication(new TutorialClickerGame(), config);
	}
}
