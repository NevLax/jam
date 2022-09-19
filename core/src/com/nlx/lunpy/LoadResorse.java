package com.nlx.lunpy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class LoadResorse {

    private final Texture playerAtlas;

    LoadResorse(){
        playerAtlas = new Texture(Gdx.files.internal("player.png"));
    }

    public Texture player(){
        return playerAtlas;
    }

    public void dispose(){
        playerAtlas.dispose();
    }
}
