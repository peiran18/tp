package seedu.application.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_COMPANY = new Prefix("c/");
    public static final Prefix PREFIX_ROLE = new Prefix("r/");
    public static final Prefix PREFIX_STATUS = new Prefix("s/");
    public static final Prefix PREFIX_INDUSTRY = new Prefix("i/");
    public static final Prefix PREFIX_DEADLINE = new Prefix("d/");
    public static final Prefix PREFIX_JOB_TYPE = new Prefix("t/");
    public static final Prefix PREFIX_INTERVIEW_TYPE = new Prefix("t/");
    public static final Prefix PREFIX_INTERVIEW_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_INTERVIEW_DATETIME = new Prefix("d/");
    public static final Prefix PREFIX_JOB_SOURCE = new Prefix("from/");

}
