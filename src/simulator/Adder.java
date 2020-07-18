package simulator;

import simulator.control.Simulator;
import simulator.gates.combinational.And;
import simulator.gates.combinational.Xor;
import simulator.network.Link;
import simulator.wrapper.Wrapper;

public class Adder extends Wrapper {
    public Adder(String label, String stream, Link... links) {
        super(label, stream, links);
    }

    @Override
    public void initialize() {

        HalfAdder h1 = new HalfAdder("h1" , "2X2" , getInput(3) , getInput(7));
        FullAdder f1 = new FullAdder("f1" , "3X2" , getInput(2) , getInput(6) , h1.getOutput(1));
        FullAdder f2 = new FullAdder("f2" , "3X2" , getInput(1) , getInput(5) , f1.getOutput(1));
        FullAdder f3 = new FullAdder("f3" , "3X2" , getInput(0) , getInput(4) , f2.getOutput(1));

        addOutput(f3.getOutput(1) , f3.getOutput(0) , f2.getOutput(0) , f1.getOutput(0) , h1.getOutput(0));

    }
}
