package ar.tvplayer.p002tv;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedAppComponentFactory extends AppComponentFactory {
    private AppComponentFactory factory;

    public ProtectedAppComponentFactory() {
    }

    private AppComponentFactory getAppComponentFactory() {
        AppComponentFactory r0 = this.factory;
        if (r0 == null) goto L5;
        return r0;
    L5:
        String r02 = Application.getProcessName();
        if (r02 != null) goto L8;
    L26:
        this.factory = (AppComponentFactory) Class.forName("androidx.core.app.CoreComponentFactory").newInstance();     // Catch: ClassNotFoundException -> L15 Throwable -> L17 InstantiationException -> L19
    L25:
        return this.factory;
    L17:
        e = move-exception;
        if (Process.isIsolated() == true) goto L23;
        Log.e("LoadedApk", "Unable to instantiate appComponentFactory", e);
    L23:
        this.factory = new AppComponentFactory();
        goto L25
    L8:
        if (r02.contains(":pefaf0413d113d09769c5bb9c") == false) goto L10;
    L11:
        Log.i("LoadedApk", "Fast path. Process name: " + r02);
        AppComponentFactory r1 = new AppComponentFactory();
        this.factory = r1;
        return r1;
    L10:
        if (r02.contains(":p03aac83735be0669ff5d1ac4") == false) goto L26;
        goto L11
    }

    public Activity instantiateActivity(ClassLoader r2, String r3, Intent r4) {
        return getAppComponentFactory().instantiateActivity(r2, r3, r4);
    }

    public Application instantiateApplication(ClassLoader r2, String r3) {
        return (Application) r2.loadClass(r3).newInstance();
    }

    public ContentProvider instantiateProvider(ClassLoader r2, String r3) {
        return getAppComponentFactory().instantiateProvider(r2, r3);
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader r2, String r3, Intent r4) {
        return getAppComponentFactory().instantiateReceiver(r2, r3, r4);
    }

    public Service instantiateService(ClassLoader r2, String r3, Intent r4) {
        return getAppComponentFactory().instantiateService(r2, r3, r4);
    }
}
