package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: androidx.lifecycle.ᵎˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C0194 extends AbstractC0197 {
    final /* synthetic */ C0199 this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.ᵎˊ$ﹳٴ, reason: contains not printable characters */
    public static final class C5904 extends AbstractC0197 {
        final /* synthetic */ C0199 this$0;

        public C5904(C0199 r1) {
            this.this$0 = r1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity r1) {
            this.this$0.m734();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity r3) {
            C0199 r32 = this.this$0;
            int r0 = r32.f1108 + 1;
            r32.f1108 = r0;
            if (r0 == 1) goto L5;
            return;
        L5:
            if (r32.f1109 == false) goto L9;
            r32.f1111.m710(EnumC0174.ON_START);
            r32.f1109 = false;
            return;
        }
    }

    public C0194(C0199 r1) {
        this.this$0 = r1;
    }

    @Override // androidx.lifecycle.AbstractC0197, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r2, Bundle r3) {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        int r32 = FragmentC0171.f1058;
        FragmentC0171 r22 = (FragmentC0171) r2.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
        r22.f1059 = this.this$0.f1110;
        return;
    }

    @Override // androidx.lifecycle.AbstractC0197, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity r4) {
        C0199 r42 = this.this$0;
        int r0 = r42.f1113 - 1;
        r42.f1113 = r0;
        if (r0 != 0) goto L6;
        r42.f1114.postDelayed(r42.f1112, 700);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity r2, Bundle r3) {
        AbstractC0186.m717(r2, new C5904(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0197, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity r3) {
        C0199 r32 = this.this$0;
        int r0 = r32.f1108 - 1;
        r32.f1108 = r0;
        if (r0 == 0) goto L5;
        return;
    L5:
        if (r32.f1107 == false) goto L9;
        r32.f1111.m710(EnumC0174.ON_STOP);
        r32.f1109 = true;
        return;
    }
}
