package me.chrr.pegsemotes.emote.source;

import net.minecraft.client.gui.DrawContext;

public interface EmoteSource {
    int getRenderedWidth();
    void draw(DrawContext context, float x, float y, float alpha);
}
