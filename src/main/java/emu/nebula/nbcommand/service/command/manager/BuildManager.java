package emu.nebula.nbcommand.service.command.manager;

import emu.nebula.nbcommand.model.Command;
import emu.nebula.nbcommand.model.command.Syntax;
import emu.nebula.nbcommand.service.command.BaseCommandManager;

public class BuildManager extends BaseCommandManager {
    /**
     * build 命令 - ???
     * todo ids 多选框实现
     */
    public static Command createBuildCommand() {
        Syntax syntax = new Syntax()
                .add("build")
                .add("char ids", i18n.getString("param.ids"))
                .add("disc ids", i18n.getString("param.ids"))
                .add("potential ids", i18n.getString("param.ids"))
                .add("melody ids", i18n.getString("param.ids"))
                ;

        return createCommand("build", syntax);
    }
}
