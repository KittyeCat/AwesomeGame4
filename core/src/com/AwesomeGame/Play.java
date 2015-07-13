package com.AwesomeGame;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

/**
 * Created by Basil on 13/07/2015.
 */
public class Play extends ScreenAdapter {

    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;


    @Override
    public void show() {

        TmxMapLoader loader = new TmxMapLoader();
        map = loader.load("core/assets/TestMap.tmx");

        renderer = new OrthogonalTiledMapRenderer(map);

        camera = new OrthographicCamera();


    }
    @Override
    public void dispose() {

        map.dispose();
        renderer.dispose();
    }

    @Override
    public void render(float delta) {
        renderer.setView(camera);
        renderer.render();

    }

    @Override
    public void resize(int width, int height) {
        camera.viewportWidth = width;
        camera.viewportHeight = height;
        camera.update();

    }
}
