package net.snurkabill.domain.comparators;

import net.snurkabill.domain.TimeLog;

import java.util.Comparator;

public abstract class AbstractTimeComparator implements Comparator<TimeLog> {

    public abstract int compare(TimeLog first, TimeLog second);

}
