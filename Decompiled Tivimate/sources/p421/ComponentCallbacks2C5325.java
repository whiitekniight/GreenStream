package p421;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ﹳˊ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C5325 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final ComponentCallbacks2C5325 f19103 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final ArrayList f19104;

    /* JADX INFO: renamed from: ʾˋ */
    public final AtomicBoolean f19105;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f19106;

    /* JADX INFO: renamed from: ᴵˊ */
    public final AtomicBoolean f19107;

    static {
        f19103 = new ComponentCallbacks2C5325();
    }

    public ComponentCallbacks2C5325() {
        this.f19105 = new AtomicBoolean();
        this.f19107 = new AtomicBoolean();
        this.f19104 = new ArrayList();
        this.f19106 = false;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m10364(Application r2) {
        ComponentCallbacks2C5325 r0 = f19103;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r0.f19106 == true) goto L9;
        r2.registerActivityLifecycleCallbacks(r0);     // Catch: Throwable -> L7
        r2.registerComponentCallbacks(r0);     // Catch: Throwable -> L7
        r0.f19106 = true;     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r3, Bundle r4) {
        boolean r32 = this.f19105.compareAndSet(true, false);
        this.f19107.set(true);
        if (r32 == false) goto L6;
        m10365(false);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r4) {
        boolean r42 = this.f19105.compareAndSet(true, false);
        this.f19107.set(true);
        if (r42 == false) goto L6;
        m10365(false);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r1) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
        if (r3 == 20) goto L5;
        return;
    L5:
        if (this.f19105.compareAndSet(false, true) == false) goto L9;
        this.f19107.set(true);
        m10365(true);
        return;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m10365(boolean r6) {
        ComponentCallbacks2C5325 r0 = f19103;
        monitor-enter(r0);
        ArrayList r1 = this.f19104;     // Catch: Throwable -> L7
        int r2 = r1.size();     // Catch: Throwable -> L7
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L9;
        Object r4 = r1.get(r3);     // Catch: Throwable -> L7
        r3 = r3 + 1;     // Catch: Throwable -> L7
        ((InterfaceC5337) r4).mo6216(r6);     // Catch: Throwable -> L7
        goto L5
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m10366(InterfaceC5337 r3) {
        ComponentCallbacks2C5325 r0 = f19103;
        monitor-enter(r0);
        this.f19104.add(r3);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
