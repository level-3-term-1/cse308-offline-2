package DisplayUnit;

import DisplayUnit.Display.Display;
import DisplayUnit.Display.DisplayFactory;
import DisplayUnit.Display.LCDDisplayFactory;
import DisplayUnit.Display.LEDDisplayFactory;
import DisplayUnit.Processor.*;

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

    public double getCost(){
        return processor.getPrice() + display.getPrice();
    }

    public void setProcessor(Utils.Processor processor) {
        switch (processor) {
            case ATMEGA32 -> this.processorFactory = new AtMega32Factory();
            case ARDUINO_MEGA -> this.processorFactory = new ArduinoMegaFactory();
            case RASPBERRY_PI -> this.processorFactory = new RaspberryPiFactory();
            default -> this.processorFactory = null;
        }
        this.processor = this.processorFactory.createProcessor();
    }

    public void setDisplay(Utils.Display display) {
        switch (display) {
            case LCD -> this.displayFactory = new LCDDisplayFactory();
            case LED -> this.displayFactory = new LEDDisplayFactory();
            default -> this.displayFactory = null;
        }
        this.display = displayFactory.createDisplay();
    }
}
