package DisplayUnit.Processor;

public class AtMega32Factory implements ProcessorFactory{
    @Override
    public Processor createProcessor() {
        return new AtMega32();
    }
}
