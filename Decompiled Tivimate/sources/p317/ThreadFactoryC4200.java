package p317;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: ᐧˎ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC4200 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        return new Thread(r3, "ExoPlayer:AudioTrackReleaseThread");
    }
}
