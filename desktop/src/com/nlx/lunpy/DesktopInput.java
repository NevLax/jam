package com.nlx.lunpy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class DesktopInput implements MyInput{
    boolean Up;
    boolean Down;
    boolean Right;
    boolean Left;
    Vector2 vec = new Vector2();

    @Override
    public Vector2 getIn() {
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

        return vec;
    }

    @Override
    public void setStage(Stage stage) {

    }

    private void touch(){
        Up = Gdx.input.isKeyPressed(Input.Keys.W) |
                Gdx.input.isKeyPressed(Input.Keys.UP);

        Down = Gdx.input.isKeyPressed(Input.Keys.S) |
                Gdx.input.isKeyPressed(Input.Keys.DOWN);

        Right = Gdx.input.isKeyPressed(Input.Keys.D) |
                Gdx.input.isKeyPressed(Input.Keys.RIGHT);

        Left = Gdx.input.isKeyPressed(Input.Keys.A) |
                Gdx.input.isKeyPressed(Input.Keys.LEFT);
    }
}
