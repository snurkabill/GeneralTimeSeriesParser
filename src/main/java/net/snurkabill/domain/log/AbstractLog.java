package net.snurkabill.domain.log;

import net.snurkabill.domain.TimeLog;

public class AbstractLog implements TimeLog {

    private final long time;

    public AbstractLog(long time) {
        this.time = time;
    }

    @Override
    public long getTime() {
        return time;
    }

}
