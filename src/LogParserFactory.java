
/**
 * This factory creates the appropriate {@link LogParser} for the supported {@link FileType}s
 */
public class LogParserFactory {
    private LogParserFactory() {
    }

    public static LogParser getParser(FileType type) {
        return switch (type) {
            case TSV -> TSVLogParser.getInstance();
        };
    }
}
