package x.snowroller.plugin;

import x.snowroller.spi.Page;

public class SwedishPage implements Page {

    @Override
    public void execute() {
        System.out.println("Detta är på svenska");
    }
}
