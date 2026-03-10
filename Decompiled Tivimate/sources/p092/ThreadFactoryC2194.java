package p092;

import java.util.concurrent.ThreadFactory;
import p372.C4847;

/* JADX INFO: renamed from: ʿʾ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2194 implements ThreadFactory {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f7947;

    public /* synthetic */ ThreadFactoryC2194(int r1) {
        this.f7947 = r1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r4) {
        switch(this.f7947) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C4847(r4);
    L7:
        return new Thread(new RunnableC2195(r4, 0), "glide-active-resources");
    }
}
