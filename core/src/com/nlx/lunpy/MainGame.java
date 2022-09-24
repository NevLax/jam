package com.nlx.lunpy;

import com.badlogic.gdx.Game;

public class MainGame extends Game {
    MyInput input;
    MainGame(MyInput input){
        this.input = input;
    }

    @Override
    public void create() {
        this.setScreen(new MenuScreen(this, input));
    }

    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
    }
}
