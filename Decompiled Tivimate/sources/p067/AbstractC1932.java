package p067;

import java.util.HashSet;

/* JADX INFO: renamed from: ʽⁱ.ʽʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1932 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static String f6586;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final HashSet f6587 = null;

    static {
        f6587 = new HashSet();
        f6586 = "media3.common";
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static synchronized void m4952(String r3) {
        monitor-enter(AbstractC1932.class);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (f6587.add(r3) == false) goto L10;
        f6586 += ", " + r3;
    L10:
        monitor-exit(AbstractC1932.class);
    }
}
