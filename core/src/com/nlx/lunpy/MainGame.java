package com.nlx.lunpy;

import com.badlogic.gdx.Game;

public class MainGame extends Game {
    @Override
    public void create() {
        this.setScreen(new MenuScreen(this));
    }

    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
    }
}
