package p361;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p155.C2871;
import p155.C2878;
import p372.C4852;
import ﹳˋ.ʽʽ;
import ﹳˋ.ٴﹶ;

/* JADX INFO: renamed from: ᵎⁱ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public class C4777 extends ٴﹶ {

    /* JADX INFO: renamed from: ˆﾞ */
    public static Method f16835;

    /* JADX INFO: renamed from: ˈʿ */
    public static boolean f16836;

    /* JADX INFO: renamed from: ᵎˊ */
    public static Class f16837;

    /* JADX INFO: renamed from: ᵔי */
    public static Constructor f16838;

    /* JADX INFO: renamed from: ᵔٴ */
    public static Method f16839;

    /* JADX INFO: renamed from: ˏᵢ */
    public static void m9415() {
        if (f16836 == false) goto L5;
        return;
    L5:
        f16836 = true;
        Constructor<?> r1 = null;
        Class<?> r2 = Class.forName("android.graphics.FontFamily");     // Catch: NoSuchMethodException -> L8 Throwable -> L10
        Constructor<?> r3 = r2.getConstructor(null);     // Catch: NoSuchMethodException -> L8 Throwable -> L10
        Method r4 = r2.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});     // Catch: NoSuchMethodException -> L8 Throwable -> L10
        Method r0 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(r2, 1).getClass()});     // Catch: NoSuchMethodException -> L8 Throwable -> L10
        r1 = r3;
    L12:
        f16838 = r1;
        f16837 = r2;
        f16835 = r4;
        f16839 = r0;
        return;
    L10:
        e = move-exception;
        e.getClass().getName();
        r0 = null;
        r2 = null;
        r4 = null;
        goto L12
    }

    /* JADX INFO: renamed from: ᐧᴵ */
    public static boolean m9416(Object r3, String r4, int r5, boolean r6) {
        m9415();
    L10:
        e = e;
    L12:
        throw new RuntimeException(e);
    L13:
        return ((Boolean) f16835.invoke(r3, new Object[]{r4, Integer.valueOf(r5), Boolean.valueOf(r6)})).booleanValue();
    L8:
        e = e;
        goto L12
    }

    /* JADX INFO: renamed from: ˆʾ */
    public Typeface mo9401(Context r9, C2871 r10, Resources r11, int r12) {
        m9415();
        Object r122 = f16838.newInstance(null);     // Catch: Throwable -> L31 InstantiationException -> L33 IllegalAccessException -> L35
        C2878[] r102 = r10.f10158;
        int r1 = r102.length;
        int r3 = 0;
    L5:
        if (r3 >= r1) goto L23;
        C2878 r4 = r102[r3];
        File r5 = ʽʽ.ʼᐧ(r9);
        if (r5 == null) goto L8;
        if (ʽʽ.ˑﹳ(r5, r11, r4.f10198) == false) goto L11;
        if (m9416(r122, r5.getPath(), r4.f10196, r4.f10193) == false) goto L15;
        r5.delete();
        r3 = r3 + 1;
        goto L5
    L15:
        r5.delete();
        return null;
    L11:
        r5.delete();
        return null;
    L21:
        r5.delete();
        return null;
    L18:
        th = move-exception;
        r5.delete();
        throw th;
    L8:
        return null;
    L23:
        m9415();
        Object r92 = Array.newInstance(f16837, 1);     // Catch: InvocationTargetException -> L26 Throwable -> L28
        Array.set(r92, 0, r122);     // Catch: InvocationTargetException -> L26 Throwable -> L28
        return (Typeface) f16839.invoke(null, new Object[]{r92});
    L28:
        e = move-exception;
        throw new RuntimeException(e);
    L31:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public Typeface mo9403(Context r4, C4852[] r5, int r6) {
        if (r5.length < 1) goto L42;
        C4852 r52 = יـ(r5, r6);
        ParcelFileDescriptor r53 = r4.getContentResolver().openFileDescriptor(r52.f17167, "r", null);     // Catch: IOException -> L44
        if (r53 != null) goto L47;
        if (r53 == null) goto L42;
        r53.close();     // Catch: IOException -> L44
        return null;
    L47:
        String r62 = Os.readlink("/proc/self/fd/" + r53.getFd());     // Catch: ErrnoException -> L43 Throwable -> L24
        if (OsConstants.S_ISREG(Os.stat(r62).st_mode) == false) goto L16;
        File r0 = new File(r62);     // Catch: ErrnoException -> L43 Throwable -> L24
    L17:
        if (r0 != null) goto L19;
    L26:
        FileInputStream r63 = new FileInputStream(r53.getFileDescriptor());     // Catch: Throwable -> L24
        Typeface r42 = ˉʿ(r4, r63);     // Catch: Throwable -> L31
        r63.close();     // Catch: Throwable -> L24
        r53.close();     // Catch: IOException -> L44
        return r42;
    L31:
        th = move-exception;
        r63.close();     // Catch: Throwable -> L34
    L36:
        throw th;     // Catch: Throwable -> L24
    L34:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L24
        goto L36
    L19:
        if (r0.canRead() == false) goto L26;
        Typeface r43 = Typeface.createFromFile(r0);     // Catch: Throwable -> L24
        r53.close();     // Catch: IOException -> L44
        return r43;
    L24:
        th = move-exception;
        r53.close();     // Catch: Throwable -> L39
    L41:
        throw th;     // Catch: IOException -> L44
    L39:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L44
    L16:
        r0 = null;
    L42:
        return null;
    }
}
