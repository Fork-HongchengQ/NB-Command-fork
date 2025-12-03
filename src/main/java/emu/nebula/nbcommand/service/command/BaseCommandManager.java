package emu.nebula.nbcommand.service.command;

import emu.nebula.nbcommand.model.Command;
import emu.nebula.nbcommand.model.command.Syntax;
import emu.nebula.nbcommand.service.I18nManager;

public class BaseCommandManager {
    public static I18nManager i18n = I18nManager.getInstance();

    /**
     * 通用创建命令方法
     * @param commandKey 用于多语言查找
     * @param syntax 指令需要的参数
     */
    protected static Command createCommand(String commandKey, Syntax syntax) {
        return new Command(
                i18n.getString("command." + commandKey + ".name"),
                i18n.getString("command." + commandKey + ".description"),
                syntax.add("@(uid)", "uid", Syntax.FieldMode.SPECIAL_PREFIX, "@"),
                i18n.getString("command." + commandKey + ".full_description")
        );
    }
}
