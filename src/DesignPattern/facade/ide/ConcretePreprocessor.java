package DesignPattern.facade.ide;

public class ConcretePreprocessor implements Preprocessor {
    @Override
    public SourceCode preprocess(SourceCode code) {
        System.out.println("Preprocessing code: " + code.getFileName());
        SourceCode preprocessedSourceCode = new SourceCode("preprocessed_" + code.getFileName());
        System.out.println("Generating a new code: " + preprocessedSourceCode.getFileName());
        return preprocessedSourceCode;
    }
}
