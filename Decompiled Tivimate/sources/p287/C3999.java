package p287;

import java.util.concurrent.ThreadPoolExecutor;
import ˉᵎ.ⁱˊ;
import ˏˆ.ﹳٴ;

/* JADX INFO: renamed from: ـﹶ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C3999 extends ⁱˊ {

    /* JADX INFO: renamed from: ˉˆ */
    public final /* synthetic */ ThreadPoolExecutor f14792;

    /* JADX INFO: renamed from: ᵔʾ */
    public final /* synthetic */ ⁱˊ f14793;

    public C3999(ⁱˊ r1, ThreadPoolExecutor r2) {
        this.f14793 = r1;
        this.f14792 = r2;
    }

    /* JADX INFO: renamed from: ˉٴ */
    public final void m8193(Throwable r3) {
        ThreadPoolExecutor r0 = this.f14792;
        this.f14793.ˉٴ(r3);     // Catch: Throwable -> L6
        r0.shutdown();
        return;
    L6:
        th = move-exception;
        r0.shutdown();
        throw th;
    }

    /* JADX INFO: renamed from: ᵎⁱ */
    public final void m8194(ﹳٴ r3) {
        ThreadPoolExecutor r0 = this.f14792;
        this.f14793.ᵎⁱ(r3);     // Catch: Throwable -> L6
        r0.shutdown();
        return;
    L6:
        th = move-exception;
        r0.shutdown();
        throw th;
    }
}
