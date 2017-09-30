package com.lukaapplications.heroquest.model.player;

public class Player {

    // Basic info
    public String Name;
    public long ID;

    // Attributes
    public int Intelligence = 1;
    public int Strength = 1;
    public int Charisma = 1;
    public int Good = 1;
    public int Evil = 1;

    @Override
    public  String toString() {
        return String.format("%s [%d]; int=%d; str=%d; chr=%d; g=%d; e=%d", Name, ID, Intelligence, Strength, Charisma, Good, Evil);
    }
}
