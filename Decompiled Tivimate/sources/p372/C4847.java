package p372;

import android.os.Process;

/* JADX INFO: renamed from: ᵔٴ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C4847 extends Thread {

    /* JADX INFO: renamed from: ʾˋ */
    public final int f17144;

    public C4847(Runnable r2) {
        super(r2, "fonts-androidx");
        this.f17144 = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f17144);
        super.run();
    }
}
