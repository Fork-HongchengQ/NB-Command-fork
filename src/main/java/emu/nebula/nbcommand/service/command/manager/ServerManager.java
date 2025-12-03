package emu.nebula.nbcommand.service.command.manager;

import emu.nebula.nbcommand.model.Command;
import emu.nebula.nbcommand.model.command.Syntax;
import emu.nebula.nbcommand.service.command.BaseCommandManager;

public class ServerManager extends BaseCommandManager {
    /**
     * reload命令 - 服务器重载
     */
    public static Command createReloadCommand() {
        Syntax syntax = new Syntax()
                .add("reload");

        return createCommand("reload", syntax);
    }

    /**
     * test666命令 - 测试
     */
    public static Command createTestCommand() {
        Syntax syntax = new Syntax()
                .add("test666");

        return createCommand("test666", syntax);
    }
}
