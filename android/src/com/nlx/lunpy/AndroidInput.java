package com.nlx.lunpy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class AndroidInput implements MyInput{
    Touchpad.TouchpadStyle style;
    Touchpad pad;
    Touchpad padCamera;
    final float tpdp = 20f;
    final float multiKoffCamera = 300f;
    @Override
    public Vector2 getIn() {
        return new Vector2(pad.getKnobPercentX() / 100f,
                                pad.getKnobPercentY() / 100f);
    }

    @Override
    public Vector2 getCameraVector() {
        return new Vector2(
                padCamera.getKnobPercentX() * multiKoffCamera,
                padCamera.getKnobPercentY()* multiKoffCamera
                );
    }

    @Override
    public boolean IsTouch() {
        return padCamera.isTouched();
    }

    @Override
    public void setStage(Stage stage) {
        style = new Touchpad.TouchpadStyle(
                new TextureRegionDrawable(new Texture(Gdx.files.internal("joy/Joystick.png"))),
                new TextureRegionDrawable(new Texture(Gdx.files.internal("joy/Handle.png")))
        );
        pad = new Touchpad(0f, style);
        pad.setPosition(tpdp, tpdp);

        padCamera = new Touchpad(0f, style);
        padCamera.setPosition(Gdx.graphics.getWidth()-padCamera.getWidth()-tpdp, tpdp);

        stage.addActor(pad);
        stage.addActor(padCamera);
    }
}
