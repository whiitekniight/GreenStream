package p334;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p022.AbstractC1327;

/* JADX INFO: renamed from: ᴵˋ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC4437 implements ThreadFactory {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ boolean f16204;

    /* JADX INFO: renamed from: ﹳٴ */
    public final AtomicInteger f16205;

    public ThreadFactoryC4437(boolean r2) {
        this.f16204 = r2;
        this.f16205 = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r4) {
        if (this.f16204 == false) goto L5;
        String r0 = "WM.task-";
    L6:
        StringBuilder r02 = AbstractC1327.m3731(r0);
        r02.append(this.f16205.incrementAndGet());
        return new Thread(r4, r02.toString());
    L5:
        r0 = "androidx.work-";
        goto L6
    }
}
