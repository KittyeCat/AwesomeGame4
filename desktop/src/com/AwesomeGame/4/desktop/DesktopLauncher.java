package com.AwesomeGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new AwesomeGame(), config);
		config.title = AwesomeGame.TITLE + " v" + AwesomeGame.VERSION;
		config.vSyncEnabled = true;
		config.width = AwesomeGame.WIDTH;
		config.height = AwesomeGame.HEIGHT;
	}
}
