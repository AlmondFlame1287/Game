package org.game.objs;

import java.awt.*;

public abstract class Entity {
    private String name;

    private float x;
    private float y;

    private float velX;
    private float velY;

    private Image texture;


    public Entity() {

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Image getTexture() {
        return texture;
    }

    public float getVelX() {
        return velX;
    }

    public float getVelY() {
        return velY;
    }
}
