package com.AwesomeGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Basil on 13/07/2015.
 */
public class Play extends ScreenAdapter {
    protected AwesomeGame game;
    protected OrthographicCamera camera;

    public static final float WOLRD_WIDTH = 25;
    public static final float WORLD_HEIGHT = 25;

    private SpriteBatch batch;

    private Player player;

    public Play(AwesomeGame game) {
        this.game = game;
        camera = new OrthographicCamera(AwesomeGame.WIDTH, AwesomeGame.HEIGHT);
        batch = new SpriteBatch();
    }

    @Override
    public void resize(int width, int height) {
        camera.setToOrtho(false, width, height);
    }

    @Override
    public void render(float delta) {
        //Process input here
        //Get actors to act here

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        //Draw stuff here
        batch.end();
    }

}
