package DisplayUnit.Processor;

public class RaspberryPiFactory implements ProcessorFactory{
    @Override
    public Processor createProcessor() {
        return new RaspberryPi();
    }
}
