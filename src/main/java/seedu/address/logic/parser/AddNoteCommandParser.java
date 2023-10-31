package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.AddNoteCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Note;

/**
 * Parses input arguments and creates a new NoteCommand object.
 */
public class AddNoteCommandParser implements Parser<AddNoteCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the NoteCommand
     * and returns a NoteCommand object for execution.
     * @throws ParseException if the user input does not conform to the expected format
     */
    public AddNoteCommand parse(String args) throws ParseException {
        try {
            // Split based on space
            String[] splitArgs = args.trim().split("\\s", 2);

            if (splitArgs.length < 2) {
                throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddNoteCommand.MESSAGE_USAGE));
            }

            Index index = ParserUtil.parseIndex(splitArgs[0]);
            Note note = new Note(splitArgs[1].trim());

            return new AddNoteCommand(index, note);
        } catch (ParseException pe) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddNoteCommand.MESSAGE_USAGE), pe);
        }
    }
}
