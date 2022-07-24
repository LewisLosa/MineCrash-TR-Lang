package com.imjustdoom.minecrash.util;

import com.imjustdoom.minecrash.Main;
import com.imjustdoom.minecrash.config.Config;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class CrashUtil {

    public static EmbedBuilder getCrashEmbed(String solution, String crash) {
        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle(crash);
        embed.addField("Çözüm", solution, false);
        embed.setColor(Color.GREEN);
        embed.setFooter("Discord davet bağlantısı: " + Main.getInstance().getConfig().getServer());
        return embed;
    }
}
