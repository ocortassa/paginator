package org.github.ocortassa.paginator.cli;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.github.ocortassa.paginator.SequenceGenerator;

import java.util.Scanner;

public class Paginator {

    @Parameter(names = {"--pages", "-p"}, description = "Number of pages of the document")
    private int pages;

    @Parameter(names = {"--help", "-h"}, help = true)
    private boolean help;

    public static void main(String[] args) {
        Paginator paginator = new Paginator();
        JCommander jc = JCommander.newBuilder()
                .addObject(paginator)
                .build();
        jc.parse(args);
        if (paginator.needsHelp()) {
            jc.usage();
        } else {
            paginator.run();
        }
    }

    public void run() {
        int pagesNum = pages != 0 ? pages : readUserInput();
        SequenceGenerator sg = new SequenceGenerator();
        System.out.print("Page sequence: ");
        System.out.println( sg.generateFoldedProgression(pagesNum) );
    }

    private int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Page number: ");
        return scanner.nextInt();
    }

    private boolean needsHelp() {
        return help;
    }

}
