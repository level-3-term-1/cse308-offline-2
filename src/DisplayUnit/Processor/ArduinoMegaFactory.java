package DisplayUnit.Processor;

public class ArduinoMegaFactory implements ProcessorFactory{
    @Override
    public Processor createProcessor() {
        return new ArduinoMega();
    }
}
