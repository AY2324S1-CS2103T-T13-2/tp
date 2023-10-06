package seedu.address.logic.commands;

import seedu.address.model.Model;

public class DumbCommand extends Command {
    @Override
    public CommandResult execute(Model model) {
        return new CommandResult("Playing dumb!");
    }
}

