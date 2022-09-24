package com.nlx.lunpy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class AndroidInput implements MyInput{
    Touchpad.TouchpadStyle style;
    Touchpad pad;
    @Override
    public Vector2 getIn() {
        return new Vector2(pad.getKnobPercentX() / 100f,
                                pad.getKnobPercentY() / 100f);
    }

    @Override
    public void setTable(Table table) {
        style = new Touchpad.TouchpadStyle(
                new TextureRegionDrawable(new Texture(Gdx.files.internal("joy/Joystick.png"))),
                new TextureRegionDrawable(new Texture(Gdx.files.internal("joy/Handle.png")))
        );
        pad = new Touchpad(50f, style);
        table.add(pad);
    }
}
