/*
 * This file is part of SampleSpongePlugin, licensed under the BSD 3-Clause License
 *
 * Copyright (c) SiboRoc <http://siboroc.net>
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of the copyright holder nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.sibomots.plugin.sample;


import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameAboutToStartServerEvent;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

@Plugin(id = "spongesampleplugin", name = "SampleSpongePlugin", version = "1.0.0", description = "SampleSpongePlugin Time!")

public class SampleSpongePlugin 
{

    public static SampleSpongePlugin instance;
    public static final String MOD_ID = "SampleSpongePlugin";
    @Inject
    public PluginContainer pluginContainer;

    public SampleSpongePlugin()
    {
        instance = this;
    }

    @Inject private Game game;
    @Inject private Logger logger;

    @Listener
    public void onPreInitialization(GamePreInitializationEvent event) {
         LogMessage("onPreInit");
    }

    @Listener
    public void onInitialization(GameInitializationEvent event) {
         LogMessage("onInit");
    }

    @Listener
    public void onAboutToStart(GameAboutToStartServerEvent event) {
        LogMessage("onAboutToStart");
    }

    @Listener
    public void onServerStarted(GameStartedServerEvent event) {
        LogMessage("onServerStarted");
    }

    public static void LogMessage(String msg)
    {
        SampleSpongePlugin.instance.logger.info(msg);
    }
}
