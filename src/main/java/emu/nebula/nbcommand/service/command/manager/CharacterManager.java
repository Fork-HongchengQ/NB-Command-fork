package emu.nebula.nbcommand.service.command.manager;

import emu.nebula.nbcommand.model.Command;
import emu.nebula.nbcommand.model.command.Syntax;
import emu.nebula.nbcommand.service.command.BaseCommandManager;

public class CharacterManager extends BaseCommandManager {
    /**
     * character all命令 - 获取所有角色
     */
    public static Command createCharacterAllCommand() {
        Syntax syntax = new Syntax()
                .add("character")
                .add("all")
                .add("lv(level)", i18n.getString("param.level"), Syntax.FieldMode.SPECIAL_PREFIX, "lv")
                .add("a(ascension)", i18n.getString("param.ascension"), Syntax.FieldMode.SPECIAL_PREFIX, "a")
                .add("s(skill level)", i18n.getString("param.skill_level"), Syntax.FieldMode.SPECIAL_PREFIX, "s")
                .add("t(talent level)", i18n.getString("param.talent_level"), Syntax.FieldMode.SPECIAL_PREFIX, "t")
                .add("f(affinity level)", i18n.getString("param.affinity_level"), Syntax.FieldMode.SPECIAL_PREFIX, "f");

        return createCommand("character_all", syntax);
    }

    /**
     * character命令 - 获取单个角色
     */
    public static Command createCharacterSingleCommand() {
        Syntax syntax = new Syntax()
                .add("character")
                .add("characters", i18n.getString("param.character_id"), Syntax.FieldMode.COMPLEX_MULTI_SELECT)
                .add("lv(level)", i18n.getString("param.level"), Syntax.FieldMode.SPECIAL_PREFIX, "lv")
                .add("a(ascension)", i18n.getString("param.ascension"), Syntax.FieldMode.SPECIAL_PREFIX, "a")
                .add("s(skill level)", i18n.getString("param.skill_level"), Syntax.FieldMode.SPECIAL_PREFIX, "s")
                .add("t(talent level)", i18n.getString("param.talent_level"), Syntax.FieldMode.SPECIAL_PREFIX, "t")
                .add("f(affinity level)", i18n.getString("param.affinity_level"), Syntax.FieldMode.SPECIAL_PREFIX, "f");

        return createCommand("character_single", syntax);
    }

    /**
     * disc命令 - 未知功能
     */
    public static Command createDiscCommand() {
        Syntax syntax = new Syntax()
                .add("disc");

        return createCommand("disc", syntax);
    }
}
