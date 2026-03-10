package p289;

import com.parse.ٴʼ;
import p342.C4594;
import p342.C4645;

/* JADX INFO: renamed from: ٴʻ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C4012 {

    /* JADX INFO: renamed from: ʽ */
    public static final C4012 f14811 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final C4012 f14812 = null;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final C4012 f14813 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object f14814;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f14815;

    static {
        int r2 = 0;
        f14811 = new C4012(r2, "ENABLED");
        f14812 = new C4012(r2, "DISABLED");
        f14813 = new C4012(r2, "DESTROYED");
    }

    public /* synthetic */ C4012(int r1, Object r2) {
        this.f14815 = r1;
        this.f14814 = r2;
    }

    public String toString() {
        switch(this.f14815) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return (String) this.f14814;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public synchronized ٴʼ m8201() {
        monitor-enter(this);
        ٴʼ r0 = ٴʼ.ˆﾞ((C4594) ((C4645) this.f14814).m2542());     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }
}
