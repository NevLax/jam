package com.nlx.lunpy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class LoadResorse {

    private final Texture badLogo;

    LoadResorse(){
        badLogo = new Texture(Gdx.files.internal("badlogic.jpg"));
    }

    public Texture getBadLogo(){
        return badLogo;
    }

    public void dispose(){
        badLogo.dispose();
    }
}
