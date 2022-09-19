package com.nlx.lunpy.player;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.nlx.lunpy.LoadResorse;

public class Player {
    PlayerAnim anim;
    PlayerController control;
    PlayerPhisics phisics;
    Vector2 move;

    public Player(World world, LoadResorse res){
        anim = new PlayerAnim(res);
        phisics = new PlayerPhisics(world);
        control = new PlayerController();
    }

    public void update(){
        move = control.update();
        phisics.applyImpulse(move);
    }

    public void draw(SpriteBatch batch){
        anim.draw(batch, phisics.getPosition());
    }
}