package com.lukaapplications.heroquest.model.item;

import com.lukaapplications.heroquest.model.player.AttributeEnum;
import java.util.HashMap;

public class Item {

    private HashMap<AttributeEnum, Integer> mBonuses = new HashMap<AttributeEnum, Integer>();

    public ItemTypeEnum Type;

    public Item(ItemTypeEnum type) {
        Type = type;
    }

    public Item AddBonus(AttributeEnum attribute, int bonus) {
        mBonuses.put(attribute, bonus);

        return this;
    }
}
