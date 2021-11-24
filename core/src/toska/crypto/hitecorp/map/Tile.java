package toska.crypto.hitecorp.map;

import com.badlogic.gdx.graphics.Texture;
import toska.crypto.hitecorp.Entity;
import toska.crypto.hitecorp.Enums;
import toska.crypto.hitecorp.Enums.TILETYPE;


public class Tile extends Entity {
    public int size;
    public int row;
    public int col;
    public String code;
    public Texture secondary_texture;
    public Texture texture;
    public Enums.TILETYPE type;

    public Tile(float x, float y, int size, TILETYPE type, Texture texture){
        super();
        pos.x = x*size;
        pos.y = y*size;
        this.size = size;
        this.texture = texture;
        this.col = (int) x;
        this.row = (int) y;
        this.type = type;
        this.code = "";
    }

    public String details(){
        return "x: " + pos.x + " y: " + pos.y + " row: " + row + " col: " + col + " code: " + code + " type: " + type.toString();
    }

    public boolean is_grass() {
        return type == TILETYPE.GRASS;
    }

    public boolean is_water() {
        return type == TILETYPE.WATER;
    }

    public boolean is_cliff() {
        return type == TILETYPE.CLIFF;
    }

    public boolean is_passable() {
        return !is_water() && !is_cliff();
    }

    public boolean is_not_passable() {
        return !is_passable();
    }
}