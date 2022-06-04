package DisplayUnit;

import DisplayUnit.Display.Display;
import DisplayUnit.Display.DisplayFactory;
import DisplayUnit.Processor.Processor;
import DisplayUnit.Processor.ProcessorFactory;

public class DisplayUnit {
    private Processor processor;
    private ProcessorFactory processorFactory;

    private Display display;
    private DisplayFactory displayFactory;



    public Processor getProcessor() {
        return processor;
    }

    public Display getDisplay() {
        return display;
    }
}
