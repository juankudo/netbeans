package com.mycompany.guiarel_2.entities;

public class Player {

    private int id;
    private String name;
    private boolean gotWet;

    public Player() {
        gotWet = true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getGotWet() {
        return gotWet;
    }

    public void setId(int id) {
        this.id = id;
        name="Player "+id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGotWet(boolean gotWet) {
        this.gotWet = gotWet;
    }

    public boolean  shoot(Revolver revolver) {
        boolean flag=false;
        if (revolver.wet()) {
            gotWet = false;
            flag=true;
        }
        revolver.nextShoot();
        return flag;
    }
}
