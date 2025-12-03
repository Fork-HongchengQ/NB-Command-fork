package emu.nebula.nbcommand.service.command.manager;

import emu.nebula.nbcommand.model.Command;
import emu.nebula.nbcommand.model.command.Syntax;
import emu.nebula.nbcommand.service.command.BaseCommandManager;

public class DiscManager extends BaseCommandManager {
    /**
     * disc all命令 - 获取所有秘纹
     */
    public static Command createDiscAllCommand() {
        Syntax syntax = new Syntax()
                .add("disc all")
                .add("lv(level)", i18n.getString("param.level"), Syntax.FieldMode.SPECIAL_PREFIX, "lv")
                .add("a(ascension)", i18n.getString("param.ascension"), Syntax.FieldMode.SPECIAL_PREFIX, "a")
                .add("c(crescendo level)", i18n.getString("param.talent_level"), Syntax.FieldMode.SPECIAL_PREFIX, "c")
                ;

        return createCommand("disc_all", syntax);
    }

    /**
     * disc 命令 - 获取单一秘纹
     */
    public static Command createDiscCommand() {
        Syntax syntax = new Syntax()
                .add("disc")
                .add("discs", i18n.getString("param.id"), Syntax.FieldMode.COMPLEX_MULTI_SELECT) //todo
                .add("lv(level)", i18n.getString("param.level"), Syntax.FieldMode.SPECIAL_PREFIX, "lv")
                .add("a(ascension)", i18n.getString("param.ascension"), Syntax.FieldMode.SPECIAL_PREFIX, "a")
                .add("c(crescendo level)", i18n.getString("param.talent_level"), Syntax.FieldMode.SPECIAL_PREFIX, "c")
                ;

        return createCommand("disc_single", syntax);
    }
}
