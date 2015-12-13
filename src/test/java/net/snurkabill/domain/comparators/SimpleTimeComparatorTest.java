package net.snurkabill.domain.comparators;

import net.snurkabill.GeneralTest;
import net.snurkabill.domain.TimeLog;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class SimpleTimeComparatorTest extends GeneralTest {

    private final Logger logger = LoggerFactory.getLogger(SimpleTimeComparator.class.getSimpleName());

    public class TestingLog implements TimeLog {

        private final long time;

        public TestingLog(long time) {
            this.time = time;
        }

        public long getTime() {
            return time;
        }
    }

    @Test
    public void simpleTest() {
        List<TimeLog> list = Arrays.asList(new TestingLog(42), new TestingLog(10000), new TestingLog(-5),
                new TestingLog(20));
        list.sort(new SimpleTimeComparator());
        Assert.assertTrue(isSorted(list));
    }

    private boolean isSorted(List<TimeLog> timeLogs) {
        long last = timeLogs.get(0).getTime();
        for (int i = 1; i < timeLogs.size(); i++) {
            if(timeLogs.get(i).getTime() < last) {
                return false;
            } else {
                last = timeLogs.get(i).getTime();
            }
        }
        return true;
    }



}
