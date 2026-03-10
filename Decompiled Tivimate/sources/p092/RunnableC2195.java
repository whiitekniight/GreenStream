package p092;

import android.os.Process;
import ˉᵎ.ⁱˊ;

/* JADX INFO: renamed from: ʿʾ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2195 implements Runnable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f7948;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Runnable f7949;

    public /* synthetic */ RunnableC2195(Runnable r1, int r2) {
        this.f7948 = r2;
        this.f7949 = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f7948) {
            case 0: goto L11;
            case 1: goto L13;
            default: goto L4;
        };
    L4:
        this.f7949.run();
        return;
    L11:
        Process.setThreadPriority(10);
        this.f7949.run();
        return;
    L13:
        this.f7949.run();     // Catch: Exception -> L8
        return;
    L8:
        e = move-exception;
        ⁱˊ.ʼˎ("Executor", "Background execution failure.", e);
    }

    public String toString() {
        switch(this.f7948) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return this.f7949.toString();
    }
}
