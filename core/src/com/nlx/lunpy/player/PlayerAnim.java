package com.nlx.lunpy.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.nlx.lunpy.LoadResorse;

public class PlayerAnim {
    Texture atlas;
    TextureRegion[] Walk;
    TextureRegion[] Up;
    TextureRegion[] Down;


    PlayerAnim(LoadResorse res){
        atlas = res.player();
    }

    public void draw(SpriteBatch batch, Vector2 position){

    }
}
