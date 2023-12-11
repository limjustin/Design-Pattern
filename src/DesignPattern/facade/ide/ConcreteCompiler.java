package DesignPattern.facade.ide;

public class ConcreteCompiler implements Compiler {
    @Override
    public ObjectCode compile(SourceCode code) {
        System.out.println("Compiling code: " + code.getFileName());
        String objFileName = code.getFileName().replace(".c", ".obj");
        ObjectCode objectCode = new ObjectCode(objFileName);
        System.out.println("Generating object code: " + objectCode.getFileName());
        return objectCode;
    }
}
