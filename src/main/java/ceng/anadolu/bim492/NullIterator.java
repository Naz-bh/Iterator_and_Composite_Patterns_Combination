package ceng.anadolu.bim492;

public class NullIterator implements Iteratorr{
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}