package DesignPattern.facade.ide;

import java.util.List;

public class IDE implements Builder {
    private Preprocessor preprocessor;
    private Compiler compiler;
    private Linker linker;
    private String projectName;

    public IDE(Preprocessor preprocessor, Compiler compiler, Linker linker) {
        this.preprocessor = preprocessor;
        this.compiler = compiler;
        this.linker = linker;
    }

    @Override
    public void createProject(String projectName) {
        this.projectName = projectName + ".exe";
    }

    @Override
    public void build(SourceCode[] codeFiles) {
        ObjectCode[] objFiles = new ObjectCode[codeFiles.length];

        for (int i = 0; i < codeFiles.length; i++) {
            SourceCode preprocess = preprocessor.preprocess(codeFiles[i]);
            objFiles[i] = compiler.compile(preprocess);
        }

        Executable exe = linker.link(projectName, objFiles);
        exe.execute();
    }

    @Override
    public void build(List<SourceCode> codeFiles) {
        ObjectCode[] objFiles = new ObjectCode[codeFiles.size()];

        for (int i = 0; i < codeFiles.size(); i++) {
            SourceCode preprocess = preprocessor.preprocess(codeFiles.get(i));
            objFiles[i] = compiler.compile(preprocess);
        }

        Executable exe = linker.link(projectName, objFiles);
        exe.execute();
    }
}
