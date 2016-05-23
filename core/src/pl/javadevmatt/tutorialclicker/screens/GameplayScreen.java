package pl.javadevmatt.tutorialclicker.screens;

import pl.javadevmatt.tutorialclicker.TutorialClickerGame;
import pl.javadevmatt.tutorialclicker.enteties.Player;

public class GameplayScreen extends AbstractScreen {

	private Player player;

	public GameplayScreen(TutorialClickerGame game) {
		super(game);
		init();
	}

	private void init() {
		initPlayer();

	}

	private void initPlayer() {
		player = new Player();
		stage.addActor(player);
		spriteBatch.begin();
		stage.draw();

		spriteBatch.end();

	}

	@Override
	public void render(float delta) {
		super.render(delta);
		update();

	}

	private void update() {
		stage.act();
	}
}
