package p152;

import android.media.MediaCodec;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p233.ScheduledExecutorServiceC3527;

/* JADX INFO: renamed from: ˉˏ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2859 {
    /* JADX INFO: renamed from: ʽ */
    public static /* synthetic */ void m6161(ExecutorServiceC2857 r5) {
        if (Build.VERSION.SDK_INT > 23) goto L5;
    L7:
        boolean r0 = r5.isTerminated();
        if (r0 == true) goto L26;
        r5.shutdown();
        boolean r1 = false;
    L10:
        if (r0 == true) goto L15;
        r0 = r5.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L13
    L13:
        if (r1 == true) goto L10;
        r5.shutdownNow();
        r1 = true;
        goto L10
    L15:
        if (r1 == false) goto L27;
        Thread.currentThread().interrupt();
        return;
    L27:
        return;
    L26:
        return;
    L5:
        if (r5 != ForkJoinPool.commonPool()) goto L7;
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m6162(ScheduledExecutorServiceC3527 r2) {
        if (Build.VERSION.SDK_INT <= 23) goto L8;
        if (r2 != ForkJoinPool.commonPool()) goto L8;
        return;
    L8:
        if (r2.f12530.isTerminated() == false) goto L10;
        return;
    L10:
        r2.shutdown();
        throw null;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static /* synthetic */ void m6163(ExecutorService r5) {
        if (Build.VERSION.SDK_INT > 23) goto L5;
    L7:
        boolean r0 = r5.isTerminated();
        if (r0 == true) goto L26;
        r5.shutdown();
        boolean r1 = false;
    L10:
        if (r0 == true) goto L15;
        r0 = r5.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L13
    L13:
        if (r1 == true) goto L10;
        r5.shutdownNow();
        r1 = true;
        goto L10
    L15:
        if (r1 == false) goto L27;
        Thread.currentThread().interrupt();
        return;
    L27:
        return;
    L26:
        return;
    L5:
        if (r5 != ForkJoinPool.commonPool()) goto L7;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern m6164() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }
}
