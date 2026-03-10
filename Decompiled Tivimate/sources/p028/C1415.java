package p028;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: renamed from: ʼ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C1415 extends Handler {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C1415 f4794 = null;

    static {
        f4794 = new C1415();
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord r5) {
        CopyOnWriteArraySet r0 = AbstractC1413.f4793;
        String r02 = r5.getLoggerName();
        int r1 = r5.getLevel().intValue();
        Level r2 = Level.INFO;
        if (r1 <= r2.intValue()) goto L6;
        int r12 = 5;
    L9:
        AbstractC1413.m3908(r02, r12, r5.getMessage(), r5.getThrown());
        return;
    L6:
        if (r5.getLevel().intValue() != r2.intValue()) goto L8;
        r12 = 4;
        goto L9
    L8:
        r12 = 3;
        goto L9
    }
}
