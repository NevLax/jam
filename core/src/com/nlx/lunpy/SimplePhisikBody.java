package com.nlx.lunpy;

import com.badlogic.gdx.physics.box2d.*;

public class SimplePhisikBody {

    BodyDef bodyDef;
    Body body;
    PolygonShape shape;
    FixtureDef fixtureDef;
    float density = 0.5f;
    float friction = 0.4f;
    float restitution = 0.6f;
    Fixture fixture;

    SimplePhisikBody(World world){
        bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(1, 1);

        body = world.createBody(bodyDef);

        shape = new PolygonShape();
        shape.setAsBox(1, 1);

        fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = density;
        fixtureDef.friction = friction;
        fixtureDef.restitution = restitution;

        fixture = body.createFixture(fixtureDef);
    }

    SimplePhisikBody(World world, float x, float y){
        bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(x, y);

        body = world.createBody(bodyDef);

        shape = new PolygonShape();
        shape.setAsBox(1, 1);

        fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = density;
        fixtureDef.friction = friction;
        fixtureDef.restitution = restitution;

        fixture = body.createFixture(fixtureDef);
    }

    SimplePhisikBody(World world, float x, float y, float hx, float hy){
        bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(x, y);

        body = world.createBody(bodyDef);

        shape = new PolygonShape();
        shape.setAsBox(hx, hy);

        fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = density;
        fixtureDef.friction = friction;
        fixtureDef.restitution = restitution;

        fixture = body.createFixture(fixtureDef);
    }

    public void dispose(){
        shape.dispose();
    }
}
