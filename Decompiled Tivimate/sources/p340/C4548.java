package p340;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᴵᵔ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C4548 {

    /* JADX INFO: renamed from: ˈ */
    public static final ThreadLocal f16408 = null;

    /* JADX INFO: renamed from: ʽ */
    public boolean f16409;

    /* JADX INFO: renamed from: ⁱˊ */
    public final ArrayList f16410;

    /* JADX INFO: renamed from: ﹳٴ */
    public final ChoreographerFrameCallbackC4563 f16411;

    static {
        f16408 = new ThreadLocal();
    }

    public C4548() {
        this.f16410 = new ArrayList();
        this.f16409 = false;
        this.f16411 = new ChoreographerFrameCallbackC4563(this);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C4548 m8986() {
        ThreadLocal r0 = f16408;
        if (r0.get() != null) goto L6;
        r0.set(new C4548());
    L6:
        return (C4548) r0.get();
    }
}
