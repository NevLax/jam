package com.nlx.lunpy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public class MenuScreen implements Screen {
    Stage stage;
    Table table;
    TextButton butt;
    TextureRegionDrawable up;
    TextureRegionDrawable down;
    TextureRegionDrawable check;
    BitmapFont font;
    final MainGame game;

    MenuScreen(final MainGame mainGame) {
        stage = new Stage(new ExtendViewport(1280,720));
        game = mainGame;

        table = new Table();
        table.setFillParent(true);
        stage.addActor(table);

        table.setDebug(true);

        up = new TextureRegionDrawable(new Texture(Gdx.files.internal("buttNinePatch/butt_up.png")));
        down = new TextureRegionDrawable(new Texture(Gdx.files.internal("buttNinePatch/butt_down.png")));
        check = new TextureRegionDrawable(new Texture(Gdx.files.internal("buttNinePatch/butt_check.png")));
        font = new BitmapFont();

        TextButton.TextButtonStyle style = new ImageTextButton.ImageTextButtonStyle();
        style.up = up;
        style.down = down;
        style.checked = check;
        style.font = font;
        butt = new TextButton("Start", style);
        table.add(butt);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (Gdx.input.isTouched()) {
            game.setScreen(new MyGdxScreen(game));
            dispose();
        }
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
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
