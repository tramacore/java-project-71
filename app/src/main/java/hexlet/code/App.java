package hexlet.code;
import hexlet.code.Differ;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import  picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;

import java.io.File;

@CommandLine.Command(name = "gendiff", mixinStandardHelpOptions = true,
        description = "Compares two configuration files and shows a difference.")

public class App implements Runnable {
    @Option(names = {"-f", "--format"}, description = "output format [default: stylish]")
    private String format = "stylish";

    @Parameters(index = "0", description = "path to first file")
    private File filepath1;

    @Parameters(index = "1", description = "path to second file")
    private File filepath2;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        if (exitCode != 0) {
            System.exit(exitCode);
        }
    }

    @Override
    public void run() {
        System.out.println("Hello world!");
    }
}