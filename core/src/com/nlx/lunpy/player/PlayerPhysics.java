package com.nlx.lunpy.player;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.nlx.lunpy.SimplePhisikBody;

public class PlayerPhysics {
    SimplePhisikBody dinamyc;
    public Body body;
    PlayerPhysics(World world){
            dinamyc = new SimplePhisikBody(world, 0f, 0f, 22, 42, 0.005f, 0.1f, 0.6f);
            body = dinamyc.getBody();
    }

    public void applyImpulse(Vector2 vector) {
        body.setLinearVelocity(vector);
    }

    public Vector2 getPosition(){
        return body.getPosition();
    }

    public void dispose(){
        dinamyc.dispose();
    }
}
