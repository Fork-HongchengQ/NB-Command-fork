package emu.nebula.nbcommand.service.command.manager;

import emu.nebula.nbcommand.model.Command;
import emu.nebula.nbcommand.model.command.Syntax;
import emu.nebula.nbcommand.service.command.BaseCommandManager;

public class PlayerManager extends BaseCommandManager {
    /**
     * account命令 - 账户相关操作
     */
    public static Command createAccountCommand() {
        Syntax syntax = new Syntax()
                .add("account")
                .add("{create | delete}", i18n.getString("param.action"), Syntax.FieldMode.SIMPLE_MULTI_SELECT)
                .add("[email]", i18n.getString("param.email"))
//                .add("(uid)", i18n.getString("param.uid"), Syntax.FieldMode.SPECIAL_PREFIX, "")
                ;

        return createCommand("account", syntax);
    }

    /**
     * setlevel命令 - 设置等级
     */
    public static Command createSetLevelCommand() {
        Syntax syntax = new Syntax()
                .add("setlevel")
                .add("[level]", i18n.getString("param.level"));

        return createCommand("setlevel", syntax);
    }
}
