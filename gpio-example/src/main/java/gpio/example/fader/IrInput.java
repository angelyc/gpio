package gpio.example.fader;

/**
 * @author Koert Zeilstra
 */
public enum IrInput {

    KEY_1("18.9.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.3.1.1.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1.79.18.4.1."),
    KEY_2("xxx18.9.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.3.1.1.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1.79.18.4.1."),
    KEY_ON("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.3.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.3.1.3.1"),
    KEY_OFF("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.3.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1.3.1.3.1"),
    KEY_DOWN("xxx18.9.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.3.1.1.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_UP("xxx18.9.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.3.1.1.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_FLASH("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1"),
    KEY_FADE("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_SMOOTH("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_RED1("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.3.1"),
    KEY_GREEN1("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1.3.1"),
    KEY_BLUE1("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.3.1.3.1.1.1.1.1.1.1.1.1.1.1.3.1.1.1.1.1.3.1.3.1.3.1.3.1.3.1"),
    KEY_RED2("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.1.1.1.1.3.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1"),
    KEY_GREEN2("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1"),
    KEY_BLUE2("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.3.1.1.1.3.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1"),
    KEY_RED3("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.1.1.3.1.3.1.1.1.1.1.1.1.1.1.3.1.3.1.1.1.1.1.3.1.3.1.3.1.3.1"),
    KEY_GREEN3("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.1.1.1.1.1.1.1.1.1.1.3.1.1.1.1.1.3.1.3.1.3.1.3.1"),
    KEY_BLUE3("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.1.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1"),
    KEY_RED4("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.1.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_GREEN4("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.1.1.1.1.3.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_BLUE4("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_RED5("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.1.1.3.1.1.1.3.1.1.1.1.1.1.1.3.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_GREEN5("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.3.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_BLUE5("1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.3.1.3.1.1.1.3.1.3.1.1.1.3.1.1.1.1.1.1.1.3.1.1.1.1.1.3.1.1.1.3.1.3.1.3.1"),
    KEY_R("xxx18.9.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.3.1.1.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1.79.18.4.1."),
    KEY_G("xxx18.9.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.3.1.1.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1.79.18.4.1."),
    KEY_B("xxx18.9.1.1.1.1.1.1.1.1.1.3.1.1.1.3.1.1.1.3.1.3.1.3.1.3.1.1.1.3.1.1.1.3.1.1.1.3.1.1.1.1.1.3.1.1.1.1.1.1.1.3.1.1.1.3.1.3.1.1.1.3.1.3.1.3.1.79.18.4.1.");

    private String sequence;

    private IrInput(String sequence) {
        this.sequence = sequence;
    }

    public static IrInput valueOfSequence(String sequence) {
        IrInput foundValue = null;
        for (IrInput value : values()) {
            if (value.sequence.equals(sequence)) {
                foundValue = value;
            }
        }
        return foundValue;
    }
}
