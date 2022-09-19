package com.nlx.lunpy.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.Vector2;
import sun.security.krb5.internal.ktab.KeyTabInputStream;

public class PlayerController {
    boolean Up;
    boolean Down;
    boolean Right;
    boolean Left;
    final int speed = 100;
    int timeKoff = 120;
    Interpolation interpol = new Interpolation.SwingOut(0.2f);
    Vector2 vec = new Vector2();
    Vector2 buff = new Vector2();

    public Vector2 update(){
        touch();

        if (Up) {
            if (Down) {
                vec.y = 0;
            } else vec.y = 1;
        } else if (Down) vec.y = -1;
        else vec.y = 0;

        if (Left){
            if (Right) {
                vec.x = 0;
            } else vec.x = -1;
        } else if (Right) vec.x = 1;
        else vec.x = 0;

        vec.nor();
        vec.x *= speed;
        vec.y *= speed;

        buff.set(interpol.apply(buff.x, vec.x, Gdx.graphics.getDeltaTime()),
                interpol.apply(buff.y, vec.y, Gdx.graphics.getDeltaTime()));

        return buff;
    }

    public void touch(){
        if (Gdx.input.isKeyPressed(Input.Keys.W) |
                Gdx.input.isKeyPressed(Input.Keys.UP)) Up = true;
        else Up = false;

        if (Gdx.input.isKeyPressed(Input.Keys.S) |
                Gdx.input.isKeyPressed(Input.Keys.DOWN)) Down = true;
        else Down = false;

        if (Gdx.input.isKeyPressed(Input.Keys.D) |
                Gdx.input.isKeyPressed(Input.Keys.RIGHT)) Right = true;
        else Right = false;
        if (Gdx.input.isKeyPressed(Input.Keys.A) |
                Gdx.input.isKeyPressed(Input.Keys.LEFT)) Left = true;
        else Left = false;
    }
}
