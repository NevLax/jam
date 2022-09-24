package com.nlx.lunpy.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.nlx.lunpy.LoadResourse;

public class PlayerAnim {
    Texture atlas;


    PlayerAnim(LoadResourse res){
        atlas = res.player();
    }

    public void draw(SpriteBatch batch, Vector2 position){

        batch.draw(atlas,
                position.x - atlas.getWidth() / 4f,
                position.y - atlas.getHeight() / 4f,
                atlas.getWidth() / 2f,
                atlas.getHeight() / 2f);
    }
}
