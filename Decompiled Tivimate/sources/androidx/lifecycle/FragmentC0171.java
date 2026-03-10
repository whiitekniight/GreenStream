package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: androidx.lifecycle.ˈʿ */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC0171 extends Fragment {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ int f1058 = 0;

    /* JADX INFO: renamed from: ʾˋ */
    public ﹳי.ʽ f1059;

    /* JADX INFO: renamed from: androidx.lifecycle.ˈʿ$ﹳٴ, reason: contains not printable characters */
    public static final class C5903 implements Application.ActivityLifecycleCallbacks {
        public static final C0200 Companion = null;

        static {
            Companion = new C0200();
        }

        public C5903() {
        }

        public static final void registerIn(Activity r1) {
            Companion.getClass();
            C0200.m735(r1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity r1, Bundle r2) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity r1) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity r1) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity r1, Bundle r2) {
            int r22 = FragmentC0171.f1058;
            AbstractC0169.m696(r1, EnumC0174.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity r2) {
            int r0 = FragmentC0171.f1058;
            AbstractC0169.m696(r2, EnumC0174.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity r2) {
            int r0 = FragmentC0171.f1058;
            AbstractC0169.m696(r2, EnumC0174.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity r2) {
            int r0 = FragmentC0171.f1058;
            AbstractC0169.m696(r2, EnumC0174.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity r2) {
            int r0 = FragmentC0171.f1058;
            AbstractC0169.m696(r2, EnumC0174.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity r2) {
            int r0 = FragmentC0171.f1058;
            AbstractC0169.m696(r2, EnumC0174.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity r1) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity r1, Bundle r2) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity r1) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity r1) {
        }
    }

    public FragmentC0171() {
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle r1) {
        super.onActivityCreated(r1);
        m699(EnumC0174.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m699(EnumC0174.ON_DESTROY);
        this.f1059 = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m699(EnumC0174.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ﹳי.ʽ r0 = this.f1059;
        if (r0 == null) goto L5;
        ((C0199) r0.ʾˋ).m734();
    L5:
        m699(EnumC0174.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ﹳי.ʽ r0 = this.f1059;
        if (r0 == null) goto L9;
        C0199 r02 = (C0199) r0.ʾˋ;
        int r1 = r02.f1108 + 1;
        r02.f1108 = r1;
        if (r1 != 1) goto L9;
        if (r02.f1109 == false) goto L9;
        r02.f1111.m710(EnumC0174.ON_START);
        r02.f1109 = false;
    L9:
        m699(EnumC0174.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m699(EnumC0174.ON_STOP);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m699(EnumC0174 r3) {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        AbstractC0169.m696(getActivity(), r3);
        return;
    }
}
