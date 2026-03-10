package p287;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: ـﹶ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC4006 implements ThreadFactory {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ String f14804;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f14805;

    public /* synthetic */ ThreadFactoryC4006(int r1, String r2) {
        this.f14805 = r1;
        this.f14804 = r2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        switch(this.f14805) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Thread r0 = new Thread(r3, this.f14804);
        r0.setPriority(10);
        return r0;
    L5:
        return new Thread(r3, this.f14804);
    }
}
