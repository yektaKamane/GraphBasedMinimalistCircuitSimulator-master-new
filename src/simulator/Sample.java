//Dedicated to Goli

package simulator;

import simulator.control.Simulator;
import simulator.gates.combinational.And;
import simulator.gates.combinational.Not;
import simulator.gates.sequential.Clock;
import simulator.gates.sequential.flipflops.DFlipFlop;
import simulator.wrapper.wrappers.FullAdder;
import simulator.wrapper.wrappers.RealDFlipFlop;

import java.util.concurrent.TimeUnit;

public class Sample {
    public static void main(String[] args) throws InterruptedException {

        Register r1 = new Register();
        Register r2 = new Register();
        Clock c1 = new Clock("clock", 200);
        /*
        for (int i = 0; i < 32; i++) {
            DFlipFlop d1 = new DFlipFlop("d1", c1.getOutput(0), Simulator.trueLogic);
            DFlipFlop d2 = new DFlipFlop("d2", c1.getOutput(0) , Simulator.falseLogic );
            r1.getFlipFlops().add(d1);
            r2.getFlipFlops().add(d2);
            Simulator.debugger.addTrackItem(d1 , d2);
            Simulator.debugger.setDelay(100);
        }*/



        //Adder adder = new Adder("Adder" , "8X5" , r1.flipFlops.get(3).getOutput(0) , r1.flipFlops.get(2).getOutput(0) , r1.flipFlops.get(1).getOutput(0) , r1.flipFlops.get(0).getOutput(0) , r2.flipFlops.get(3).getOutput(0) , r2.flipFlops.get(2).getOutput(0) , r2.flipFlops.get(1).getOutput(0) , r2.flipFlops.get(0).getOutput(0));
        //FullAdder f = new FullAdder("FA" , "3X2" , r2.flipFlops.get(0).getOutput(0) , r2.flipFlops.get(0).getOutput(0) , r1.flipFlops.get(0).getOutput(0));
        //HalfAdder h = new HalfAdder("H1" , "2X2" , r1.flipFlops.get(0).getOutput(0) , r2.flipFlops.get(0).getOutput(0));
        //DoNothing doNothing = new DoNothing("D" , "4X4" , r1.flipFlops.get(3).getOutput(0) , r1.flipFlops.get(2).getOutput(0) , r1.flipFlops.get(1).getOutput(0) , r1.flipFlops.get(0).getOutput(0) );
        //Dec5X32 dec5X32 = new Dec5X32("DEC", "5X9", Simulator.falseLogic , Simulator.falseLogic , Simulator.trueLogic, Simulator.falseLogic , Simulator.falseLogic);


        Simulator.debugger.addTrackItem();
        Simulator.debugger.setDelay(100);
        Simulator.circuit.startCircuit("FAST");
    }
}