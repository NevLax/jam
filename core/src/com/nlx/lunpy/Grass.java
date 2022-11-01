package com.nlx.lunpy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Grass {
    private final Texture texture;
    private float x;
    private float y;

    public Grass() {
        texture = new Texture(Gdx.files.internal("grass.png"));
    }

    public Grass(float x, float y) {
        texture = new Texture(Gdx.files.internal("grass.png"));
        this.x = x;
        this.y = y;
    }

    public void draw(SpriteBatch batch) {
        batch.draw(texture, x, y);
    }

    public void draw(SpriteBatch batch, float x, float y) {
        batch.draw(texture, x, y);
    }

    public void dispose() {
        texture.dispose();
    }
    public float getY() {
        return (y + (texture.getHeight() / 2));
    }
}
