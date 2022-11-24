package com.nlx.lunpy;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;

public interface MyInput {
    Vector2 getIn();
    Vector2 getCameraVector();
    boolean IsTouch();
    void setStage(Stage stage);

}