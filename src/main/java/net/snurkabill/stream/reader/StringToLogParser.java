package net.snurkabill.stream.reader;

import net.snurkabill.domain.log.AbstractLog;
import net.snurkabill.domain.log.AbstractLogFactory;

import java.util.Iterator;
import java.util.stream.Stream;

public class StringToLogParser implements Iterator<AbstractLog> {

    private final Iterator<String> stream;
    private final AbstractLogFactory factory;

    public StringToLogParser(final Stream<String> stream, AbstractLogFactory factory) {
        this.stream = stream.iterator();
        this.factory = factory;
    }

    @Override
    public boolean hasNext() {
        return stream.hasNext();
    }

    @Override
    public AbstractLog next() {
        return factory.parseLog(stream.next());
    }
}
