package p005j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: j$.util.stream.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1143j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3922a = 0;

    static {
        EnumC1133h r0 = EnumC1133h.CONCURRENT;
        EnumC1133h r1 = EnumC1133h.UNORDERED;
        EnumC1133h r2 = EnumC1133h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(r0, r1, r2));
        Collections.unmodifiableSet(EnumSet.of(r0, r1));
        Collections.unmodifiableSet(EnumSet.of(r2));
        Collections.unmodifiableSet(EnumSet.of(r1, r2));
        Set r02 = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(r1));
    }

    /* JADX INFO: renamed from: a */
    public static void m3365a(double[] r6, double r7) {
        double r72 = r7 - r6[1];
        double r2 = r6[0];
        double r4 = r2 + r72;
        r6[1] = (r4 - r2) - r72;
        r6[0] = r4;
    }
}
