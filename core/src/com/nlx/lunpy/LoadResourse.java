package com.nlx.lunpy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class LoadResourse {

    private final Texture playerAtlas;

    LoadResourse(){
        playerAtlas = new Texture(Gdx.files.internal("aprpa.png"));
    }

    public Texture player(){
        return playerAtlas;
    }

    public void dispose(){
        playerAtlas.dispose();
    }
}
