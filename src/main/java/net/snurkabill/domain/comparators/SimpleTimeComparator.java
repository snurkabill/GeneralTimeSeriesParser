package net.snurkabill.domain.comparators;

import net.snurkabill.domain.TimeLog;

public class SimpleTimeComparator extends AbstractTimeComparator {

    @Override
    public int compare(TimeLog first, TimeLog second) {
        return first.getTime() == second.getTime() ? 0 : (first.getTime() > second.getTime() ? 1 : -1);
    }
}
