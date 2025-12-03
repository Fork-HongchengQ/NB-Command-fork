package emu.nebula.nbcommand.service.command.manager;

import emu.nebula.nbcommand.model.Command;
import emu.nebula.nbcommand.model.command.Syntax;
import emu.nebula.nbcommand.service.command.BaseCommandManager;

public class ItemManager extends BaseCommandManager {

    /**
     * give命令 - 给予单个物品
     */
    public static Command createGiveCommand() {
        Syntax syntax = new Syntax().add("give")
                .add("items", i18n.getString("param.item_id"), Syntax.FieldMode.COMPLEX_MULTI_SELECT)
                .add("x(amount)", i18n.getString("param.amount"), Syntax.FieldMode.SPECIAL_PREFIX, "x");

        return createCommand("give", syntax);
    }

    /**
     * giveall命令 - 给予所有物品
     */
    public static Command createGiveAllCommand() {
        Syntax syntax = new Syntax()
                .add("giveall")
                .add("{characters | discs | materials}", i18n.getString("param.type"), Syntax.FieldMode.SIMPLE_MULTI_SELECT)
                .add("t(talent/crescendo level)", i18n.getString("param.talent_level"), Syntax.FieldMode.SPECIAL_PREFIX, "t")
                .add("s(skill level)", i18n.getString("param.skill_level"), Syntax.FieldMode.SPECIAL_PREFIX, "s");

        return createCommand("giveall", syntax);
    }

    /**
     * clean命令 - 批量删除物品
     */
    public static Command createCleanBatchCommand() {
        Syntax syntax = new Syntax()
                .add("clean")
                .add("{all | items | resources}", i18n.getString("param.clean_type"), Syntax.FieldMode.SIMPLE_MULTI_SELECT);

        return createCommand("clean_batch", syntax);
    }

    /**
     * clean命令 - 单独删除物品
     */
    public static Command createCleanSingleCommand() {
        Syntax syntax = new Syntax()
                .add("clean")
                .add("[id]", i18n.getString("param.id"));

        return createCommand("clean_single", syntax);
    }
}
