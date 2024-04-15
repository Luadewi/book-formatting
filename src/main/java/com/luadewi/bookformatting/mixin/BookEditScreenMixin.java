package com.luadewi.bookformatting.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.BookEditScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.SelectionManager;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BookEditScreen.class)
public class BookEditScreenMixin extends Screen {
    protected BookEditScreenMixin(Text title) {
        super(title);
    }

    @Shadow
    @Final
    private SelectionManager currentPageSelectionManager;

    @Inject(method = "keyPressedEditMode", at = @At("HEAD"))
    private void addSectionSignKey(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir){
        if(keyCode == GLFW.GLFW_KEY_LEFT_ALT){
            this.currentPageSelectionManager.insert("§");
        }
    }

    @Inject(method = "init", at = @At("HEAD"))
    private void addFormattingButtons(CallbackInfo ci){

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§lB"), button -> {
            this.currentPageSelectionManager.insert("§l");
        }).dimensions(this.width / 2 - 120, 10, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§oI"), button -> {
            this.currentPageSelectionManager.insert("§o");
        }).dimensions(this.width / 2 - 120, 10+22, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§nU"), button -> {
            this.currentPageSelectionManager.insert("§n");
        }).dimensions(this.width / 2 - 120, 10+22*2, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§mS"), button -> {
            this.currentPageSelectionManager.insert("§m");
        }).dimensions(this.width / 2 - 120, 10+22*3, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§kO"), button -> {
            this.currentPageSelectionManager.insert("§k");
        }).dimensions(this.width / 2 - 120, 10+22*4, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§rR"), button -> {
            this.currentPageSelectionManager.insert("§r");
        }).dimensions(this.width / 2 - 120, 10+22*5, 20, 20).build());


        this.addDrawableChild(ButtonWidget.builder(Text.literal("§0█"), button -> {
            this.currentPageSelectionManager.insert("§0");
        }).dimensions(this.width / 2 - 164, 10, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§8█"), button -> {
            this.currentPageSelectionManager.insert("§8");
        }).dimensions(this.width / 2 - 164, 10+22, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§1█"), button -> {
            this.currentPageSelectionManager.insert("§1");
        }).dimensions(this.width / 2 - 164, 10+22*2, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§2█"), button -> {
            this.currentPageSelectionManager.insert("§2");
        }).dimensions(this.width / 2 - 164, 10+22*3, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§3█"), button -> {
            this.currentPageSelectionManager.insert("§3");
        }).dimensions(this.width / 2 - 164, 10+22*4, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§4█"), button -> {
            this.currentPageSelectionManager.insert("§4");
        }).dimensions(this.width / 2 - 164, 10+22*5, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§5█"), button -> {
            this.currentPageSelectionManager.insert("§5");
        }).dimensions(this.width / 2 - 164, 10+22*6, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§6█"), button -> {
            this.currentPageSelectionManager.insert("§6");
        }).dimensions(this.width / 2 - 164, 10+22*7, 20, 20).build());


        this.addDrawableChild(ButtonWidget.builder(Text.literal("§f█"), button -> {
            this.currentPageSelectionManager.insert("§f");
        }).dimensions(this.width / 2 - 142, 10, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§7█"), button -> {
            this.currentPageSelectionManager.insert("§7");
        }).dimensions(this.width / 2 - 142, 10+22, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§9█"), button -> {
            this.currentPageSelectionManager.insert("§9");
        }).dimensions(this.width / 2 - 142, 10+22*2, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§a█"), button -> {
            this.currentPageSelectionManager.insert("§a");
        }).dimensions(this.width / 2 - 142, 10+22*3, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§b█"), button -> {
            this.currentPageSelectionManager.insert("§b");
        }).dimensions(this.width / 2 - 142, 10+22*4, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§c█"), button -> {
            this.currentPageSelectionManager.insert("§c");
        }).dimensions(this.width / 2 - 142, 10+22*5, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§d█"), button -> {
            this.currentPageSelectionManager.insert("§d");
        }).dimensions(this.width / 2 - 142, 10+22*6, 20, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("§e█"), button -> {
            this.currentPageSelectionManager.insert("§e");
        }).dimensions(this.width / 2 - 142, 10+22*7, 20, 20).build());
    }
}
