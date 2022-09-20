package com.nlx.lunpy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public class MenuScreen implements Screen {
    final MainGame game;
    MenuScreen(final MainGame mainGame) {
        game = mainGame;
    }

    @Override
    public void render(float delta) {
        if (Gdx.input.isTouched()) {
            game.setScreen(new MyGdxScreen(game));
            dispose();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }


    @Override
    public void show() {

    }

    @Override
    public void dispose() {

    }
}
