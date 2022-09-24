package com.nlx.lunpy.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.Vector2;

public class PlayerController {
    final int speed = 100;
    Interpolation interpol = new Interpolation.SwingOut(0.2f);
    Vector2 buff = new Vector2();

    public Vector2 update(Vector2 vec){
        vec.nor();
        vec.x *= speed;
        vec.y *= speed;

        buff.set(interpol.apply(buff.x, vec.x, Gdx.graphics.getDeltaTime()),
                interpol.apply(buff.y, vec.y, Gdx.graphics.getDeltaTime()));

        return buff;
    }
}
