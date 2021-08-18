package ru.devray.day6.hash;

public class FileDescriptor {
    String name;
    int size;
    boolean isWritable = true;

    public FileDescriptor(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + size + (isWritable ? 0 : 1);
    }
}
