package p012;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* JADX INFO: renamed from: ʻʻ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC1247 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f4092;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ Object f4093;

    public /* synthetic */ ChoreographerFrameCallbackC1247(ProfileInstallerInitializer r1, Context r2) {
        this.f4092 = 0;
        this.f4093 = r2;
    }

    public /* synthetic */ ChoreographerFrameCallbackC1247(Runnable r2) {
        this.f4092 = 1;
        this.f4093 = r2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r5) {
        switch(this.f4092) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((Runnable) this.f4093).run();
        return;
    L6:
        Context r52 = (Context) this.f4093;
        if (Build.VERSION.SDK_INT < 28) goto L9;
        Handler r6 = AbstractC1243.m3497(Looper.getMainLooper());
    L10:
        int r0 = new Random().nextInt(Math.max(1000, 1));
        r6.postDelayed(new RunnableC1242(r52, 0), r0 + 5000);
        return;
    L9:
        r6 = new Handler(Looper.getMainLooper());
        goto L10
    }
}
