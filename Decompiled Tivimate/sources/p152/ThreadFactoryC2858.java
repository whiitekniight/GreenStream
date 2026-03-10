package p152;

import java.util.concurrent.ThreadFactory;
import p132.C2494;

/* JADX INFO: renamed from: ˉˏ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC2858 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r2) {
        return new C2494(r2);
    }
}
