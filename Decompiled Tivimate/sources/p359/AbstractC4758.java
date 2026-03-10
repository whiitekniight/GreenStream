package p359;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.support.v4.media.session.ⁱˊ;
import com.google.android.gms.internal.common.zzac;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p308.AbstractC4142;

/* JADX INFO: renamed from: ᵎᴵ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4758 {

    /* JADX INFO: renamed from: ʽ */
    public static Boolean f16795;

    /* JADX INFO: renamed from: ⁱˊ */
    public static int f16796;

    /* JADX INFO: renamed from: ﹳٴ */
    public static String f16797;

    /* JADX INFO: renamed from: ⁱˊ */
    public static boolean m9366() {
        Boolean r0 = f16795;
        if (r0 != null) goto L15;
        if (Build.VERSION.SDK_INT < 28) goto L16;
        r0 = Boolean.valueOf(Process.isIsolated());
    L13:
        f16795 = r0;
        goto L15
    L16:
        Object r02 = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);     // Catch: ReflectiveOperationException -> L12
        Object[] r1 = new Object[0];     // Catch: ReflectiveOperationException -> L12
        if (r02 == null) goto L11;
        r0 = (Boolean) r02;     // Catch: ReflectiveOperationException -> L12
        goto L13
    L11:
        throw new zzac(ⁱˊ.ᵢˏ(r1));     // Catch: ReflectiveOperationException -> L12
    L12:
        r0 = Boolean.FALSE;
    L15:
        return r0.booleanValue();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m9367() {
        if (f16797 != null) goto L34;
        if (Build.VERSION.SDK_INT < 28) goto L7;
        f16797 = Application.getProcessName();
        goto L34
    L7:
        int r1 = f16796;
        if (r1 != 0) goto L10;
        r1 = Process.myPid();
        f16796 = r1;
    L10:
        String r2 = null;
        r2 = null;
        r2 = null;
        BufferedReader r22 = null;
        if (r1 > 0) goto L46;
    L32:
        f16797 = r2;
        goto L34
    L46:
        String r0 = "/proc/" + r1 + "/cmdline";     // Catch: Throwable -> L21 IOException -> L29
        StrictMode.ThreadPolicy r12 = StrictMode.allowThreadDiskReads();     // Catch: Throwable -> L21 IOException -> L29
        BufferedReader r3 = new BufferedReader(new FileReader(r0));     // Catch: Throwable -> L23
        StrictMode.setThreadPolicy(r12);     // Catch: Throwable -> L21 IOException -> L29
        String r02 = r3.readLine();     // Catch: Throwable -> L19 IOException -> L36
        AbstractC4142.m8398(r02);     // Catch: Throwable -> L19 IOException -> L36
        r2 = r02.trim();     // Catch: Throwable -> L19 IOException -> L36
    L38:
        r3.close();     // Catch: IOException -> L37
        goto L32
    L19:
        th = th;
        r22 = r3;
    L26:
        if (r22 != null) goto L42;
    L28:
        throw th;
    L42:
        r22.close();     // Catch: IOException -> L35
    L30:
        if (r3 == null) goto L32;
    L23:
        th = move-exception;
        StrictMode.setThreadPolicy(r12);     // Catch: Throwable -> L21 IOException -> L29
        throw th;     // Catch: Throwable -> L21 IOException -> L29
    L29:
        r3 = null;
    L21:
        th = th;
    L34:
        return f16797;
    }
}
