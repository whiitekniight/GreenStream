package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import com.bumptech.glide.ʽ;
import p178.C3085;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    public InitializationProvider() {
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri r1, String r2, String[] r3) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri r1, ContentValues r2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context r0 = getContext();
        if (r0 == null) goto L19;
        if (r0.getApplicationContext() == null) goto L16;
        C3085 r02 = C3085.m6558(r0);
        Class<?> r1 = getClass();
        Context r2 = r02.f10785;
        Trace.beginSection(ʽ.ˊʻ("Startup"));     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        ComponentName r3 = new ComponentName(r2, r1);     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        r02.m6560(r2.getPackageManager().getProviderInfo(r3, 128).metaData);     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        Trace.endSection();
        return true;
    L11:
        e = move-exception;
        throw new StartupException(e);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        Trace.endSection();
        throw th;
    L16:
        return true;
    L19:
        throw new StartupException("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri r1, String[] r2, String r3, String[] r4, String r5) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        throw new IllegalStateException("Not allowed.");
    }
}
