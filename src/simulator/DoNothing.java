package simulator;

import simulator.network.Link;
import simulator.wrapper.Wrapper;

public class DoNothing extends Wrapper {
    public DoNothing(String label, String stream, Link... links) {
        super(label, stream, links);
    }

    @Override
    public void initialize() {
        addOutput(getInput(0) , getInput(1) , getInput(2) , getInput(3));
    }
}
