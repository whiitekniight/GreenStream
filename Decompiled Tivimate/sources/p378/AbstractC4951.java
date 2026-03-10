package p378;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p269.InterfaceC3879;

/* JADX INFO: renamed from: ᵔﹶ.ʾˋ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4951 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Lock f17663 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Paint f17664 = null;

    static {
        f17664 = new Paint(6);
        new Paint(7);
        if (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL) == false) goto L5;
        Lock r0 = new ReentrantLock();
    L6:
        f17663 = r0;
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        return;
    L5:
        r0 = new LockC4972();
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static Bitmap m9741(InterfaceC3879 r6, Bitmap r7, int r8, int r9) {
        if (r7.getWidth() == r8) goto L5;
    L10:
        float r0 = Math.min(r8 / r7.getWidth(), r9 / r7.getHeight());
        int r3 = Math.round(r7.getWidth() * r0);
        int r4 = Math.round(r7.getHeight() * r0);
        if (r7.getWidth() == r3) goto L13;
    L18:
        int r32 = (int) (r7.getWidth() * r0);
        int r42 = (int) (r7.getHeight() * r0);
        if (r7.getConfig() == null) goto L21;
        Bitmap.Config r5 = r7.getConfig();
    L22:
        Bitmap r62 = r6.mo7991(r32, r42, r5);
        r62.setHasAlpha(r7.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L25;
        String r02 = "request: " + r8 + "x" + r9;
        String r03 = "toFit:   " + r7.getWidth() + "x" + r7.getHeight();
        String r04 = "toReuse: " + r62.getWidth() + "x" + r62.getHeight();
        String r05 = "minPct:   " + r0;
    L25:
        Matrix r82 = new Matrix();
        r82.setScale(r0, r0);
        m9742(r7, r62, r82);
        return r62;
    L21:
        r5 = Bitmap.Config.ARGB_8888;
        goto L22
    L13:
        if (r7.getHeight() != r4) goto L18;
        if (Log.isLoggable("TransformationUtils", 2) == true) goto L17;
    L17:
        return r7;
    L5:
        if (r7.getHeight() != r9) goto L10;
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L17;
        return r7;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m9742(Bitmap r2, Bitmap r3, Matrix r4) {
        Lock r0 = f17663;
        r0.lock();
        Canvas r1 = new Canvas(r3);     // Catch: Throwable -> L6
        r1.drawBitmap(r2, r4, f17664);     // Catch: Throwable -> L6
        r1.setBitmap(null);     // Catch: Throwable -> L6
        r0.unlock();
        return;
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }
}
