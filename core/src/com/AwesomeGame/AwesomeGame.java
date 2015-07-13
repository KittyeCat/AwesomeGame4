package com.AwesomeGame;

import com.badlogic.gdx.Game;

public class AwesomeGame extends Game {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "AwesomeGame";
	public static final String VERSION = "0.0.0.1";

	@Override
	public void create () {
		Assets.load();
		setScreen(new Play(this));
	}

	@Override
	public void dispose () {
		Assets.load();
	}
}
