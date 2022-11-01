package com.nlx.lunpy.player;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.nlx.lunpy.LoadResourse;
import com.nlx.lunpy.MyInput;

public class Player {

    MyInput input;
    PlayerAnim anim;
    public PlayerController control;
    public PlayerPhysics phisics;
    Vector2 move;

    public Player(World world, LoadResourse res, MyInput input){
        anim = new PlayerAnim(res);
        phisics = new PlayerPhysics(world);
        control = new PlayerController();
        this.input = input;
    }

    public void update(){
        move = control.update(getPreMove());
        phisics.applyImpulse(move);
        anim.direction(move);
    }

    public void draw(SpriteBatch batch){
        anim.draw(batch, phisics.getPosition());
    }

    public void dispose() {
        phisics.dispose();
    }

    private Vector2 getPreMove(){
        return input.getIn();
    }

    public float getY() {
        return phisics.body.getPosition().y;
    }
}