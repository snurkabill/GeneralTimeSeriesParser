package net.snurkabill.domain.log;

public interface AbstractLogFactory {

    AbstractLog parseLog(String string);
}
