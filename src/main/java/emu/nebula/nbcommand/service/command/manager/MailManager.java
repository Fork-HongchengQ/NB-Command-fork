package emu.nebula.nbcommand.service.command.manager;

import emu.nebula.nbcommand.model.Command;
import emu.nebula.nbcommand.model.command.Syntax;
import emu.nebula.nbcommand.service.command.BaseCommandManager;

public class MailManager extends BaseCommandManager {
    /**
     * mail命令 - 邮件系统
     */
    public static Command createMailCommand() {
        Syntax syntax = new Syntax()
                .add("mail");

        return createCommand("mail", syntax);
    }
}
