package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Tells user that they have been dumbed.
 */
public class DumbCommand extends Command {
    @Override
    public CommandResult execute(Model model) {
        return new CommandResult("Playing dumb!");
    }
}


