package com.AwesomeGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

/**
 * Created by Basil on 13/07/2015.
 */
public class Play extends ScreenAdapter {
    protected AwesomeGame game;

    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;
    private Batch batch;

    private Player player;

    public Play(AwesomeGame game) {
        this.game = game;
        camera = new OrthographicCamera(AwesomeGame.WIDTH, AwesomeGame.HEIGHT);
        camera = new OrthographicCamera();
        player = new Player(new Sprite(Assets.player));
    }

    @Override
    public void show() {
        TmxMapLoader loader = new TmxMapLoader();
        map = loader.load(Assets.getMap());
        renderer = new OrthogonalTiledMapRenderer(map);
        batch = renderer.getBatch();
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
        renderer.setView(camera);
        renderer.render();
        batch.begin();
        player.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {

        map.dispose();
        renderer.dispose();
    }


}
