package p264;

import android.util.Log;

/* JADX INFO: renamed from: יˎ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3792 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C3792 f13677 = null;

    static {
        f13677 = new C3792();
    }

    /* JADX INFO: renamed from: ʽ */
    public void m7832(String r3) {
        if (m7835(2) == true) goto L5;
        return;
    }

    /* JADX INFO: renamed from: ˈ */
    public void m7833(String r2, Exception r3) {
        if (m7835(5) == true) goto L5;
        return;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public void m7834(String r3) {
        if (m7835(3) == true) goto L5;
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public boolean m7835(int r2) {
        if (4 > r2) goto L5;
        return true;
    L5:
        if (Log.isLoggable("FirebaseCrashlytics", r2) == true) goto L11;
        return false;
    L11:
        return true;
    }
}
