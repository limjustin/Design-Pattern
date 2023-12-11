package DesignPattern.facade.ide;

import java.util.List;

public class ConcreteLinker implements Linker {
    @Override
    public Executable link(String exeFileName, ObjectCode[] objFiles) {
        StringBuilder linkedArrayFiles = new StringBuilder();

        for (ObjectCode objFile : objFiles) {
            linkedArrayFiles.append("\n").append(objFile.getFileName());
        }

        Executable executable = new Executable(exeFileName, linkedArrayFiles.toString());
        System.out.println("Linking" + linkedArrayFiles);
        return executable;
    }

    @Override
    public Executable link(String exeFileName, List<ObjectCode> objFiles) {
        StringBuilder linkedListFiles = new StringBuilder();

        for (ObjectCode objFile : objFiles) {
            linkedListFiles.append("\n").append(objFile.getFileName());
        }

        Executable executable = new Executable(exeFileName, linkedListFiles.toString());
        System.out.println("Linking" + linkedListFiles);
        return executable;
    }
}
