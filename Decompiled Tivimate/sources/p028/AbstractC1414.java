package p028;

import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: ʼ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1414 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m3909() {
        Conscrypt.Version r0 = Conscrypt.version();
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r0.major() == 2) goto L11;
        if (r0.major() > 2) goto L17;
        return false;
    L17:
        return true;
    L11:
        if (r0.minor() == 1) goto L16;
        if (r0.minor() > 1) goto L17;
        return false;
    L16:
        if (r0.patch() >= 0) goto L17;
        return false;
    }
}
