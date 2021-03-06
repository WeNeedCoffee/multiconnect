package net.earthcomputer.multiconnect.protocols.v1_12_2.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.CommandSource;

import static net.earthcomputer.multiconnect.protocols.v1_12_2.command.Commands_1_12_2.*;
import static net.minecraft.command.arguments.BlockPosArgumentType.*;

public class SetWorldSpawnCommand {

    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(literal("setworldspawn")
            .executes(ctx -> 0)
            .then(argument("pos", blockPos())
                .executes(ctx -> 0)));
    }

}
