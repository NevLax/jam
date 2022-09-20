package com.nlx.lunpy.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.nlx.lunpy.LoadResorse;

public class PlayerAnim {
    Texture atlas;
    TextureRegion[] Walk;
    Animation<TextureRegion> animWalk;

    Array<TextureRegion> walk;
    final int tile = 32;
    float times;


    PlayerAnim(LoadResorse res){
        atlas = res.player();
        walk = new Array<>();
        for (int i = 0; i < (atlas.getWidth() / tile); i++) {
            walk.add(new TextureRegion(atlas, tile*i, tile, tile, tile));
        }

        animWalk = new Animation<TextureRegion>(0.3f, walk);
    }

    public void draw(SpriteBatch batch, Vector2 position){
        times += Gdx.graphics.getDeltaTime();
        batch.draw(animWalk.getKeyFrame(times, true), position.x, position.y);
    }
}
