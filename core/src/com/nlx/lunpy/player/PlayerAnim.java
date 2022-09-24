package com.nlx.lunpy.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.nlx.lunpy.LoadResourse;

public class PlayerAnim {
    Texture atlas;
    boolean toLeft;


    PlayerAnim(LoadResourse res){
        atlas = res.player();
    }

    public void draw(SpriteBatch batch, Vector2 position){

        if (toLeft) batch.draw(atlas,
                        position.x + atlas.getWidth() / 4f,
                        position.y - atlas.getHeight() / 4f,
                        atlas.getWidth() / 2f * -1,
                        atlas.getHeight() / 2f);
        else batch.draw(atlas,
                        position.x - atlas.getWidth() / 4f,
                        position.y - atlas.getHeight() / 4f,
                        atlas.getWidth() / 2f,
                        atlas.getHeight() / 2f);

    }

    public void direction(Vector2 move){
        if (move.x > 0) toLeft = false;
        if (move.x < 0) toLeft = true;
    }

}
