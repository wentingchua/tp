package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.AddressBook;
import seedu.address.model.Model;
import seedu.address.model.person.PersonId;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Address book has been cleared!";
    private boolean hasCleared = false;


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setAddressBook(new AddressBook());
        hasCleared = true;
        PersonId.reset();
        return new CommandResult(MESSAGE_SUCCESS);
    }

    /**
     * Returns whether this command has cleared the address book.
     */
    public boolean hasCleared() {
        return hasCleared;
    }
}
