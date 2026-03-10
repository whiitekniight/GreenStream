package p015;

import android.media.metrics.LogSessionId;
import android.os.Build;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ʻʿ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C1266 {

    /* JADX INFO: renamed from: ʽ */
    public final Object f4210;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C1273 f4211;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f4212;

    static {
        new C1266("");
    }

    public C1266(String r2) {
        this.f4212 = r2;
        if (Build.VERSION.SDK_INT < 31) goto L5;
        C1273 r22 = new C1273();
    L6:
        this.f4211 = r22;
        this.f4210 = new Object();
        return;
    L5:
        r22 = null;
        goto L6
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1266) == true) goto L8;
        return false;
    L8:
        C1266 r52 = (C1266) r5;
        if (Objects.equals(this.f4212, r52.f4212) == true) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equals(this.f4211, r52.f4211) == false) goto L15;
        if (Objects.equals(this.f4210, r52.f4210) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f4212, this.f4211, this.f4210});
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final synchronized LogSessionId m3589() {
        monitor-enter(this);
        C1273 r0 = this.f4211;     // Catch: Throwable -> L6
        r0.getClass();     // Catch: Throwable -> L6
        LogSessionId r02 = (LogSessionId) r0.f4230;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }
}
