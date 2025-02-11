package com.brandon3055.draconicevolution.api.modules.data;

import com.brandon3055.draconicevolution.api.modules.lib.ModuleContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;

import java.util.Map;

/**
 * Created by brandon3055 on 3/5/20.
 */
public class AutoFeedData implements ModuleData<AutoFeedData> {
    private final double foodStorage;

    public AutoFeedData(double foodStorage) {
        this.foodStorage = foodStorage;
    }

    public double getFoodStorage() {
        return foodStorage;
    }

    @Override
    public AutoFeedData combine(AutoFeedData other) {
        return other;
    }

    @Override
    public void addInformation(Map<Component, Component> map, ModuleContext context, boolean stack) {
        map.put(new TranslatableComponent("module.draconicevolution.auto_feed.name"), new TranslatableComponent("module.draconicevolution.auto_feed.value", (int)foodStorage));
    }
}
