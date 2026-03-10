package p423;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/* JADX INFO: renamed from: ﹳˎ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5384 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final char[] f19223 = null;

    static {
        f19223 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    /* JADX INFO: renamed from: ʼˎ */
    public static String m10413(FileInputStream r1) {
        Scanner r12 = new Scanner(r1).useDelimiter("\\A");
    L6:
        th = move-exception;
        if (r12 != null) goto L17;
    L16:
        throw th;
    L17:
        r12.close();     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    L4:
        if (r12.hasNext() == false) goto L8;
        String r0 = r12.next();     // Catch: Throwable -> L6
    L9:
        r12.close();
        return r0;
    L8:
        r0 = "";
        goto L9
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: ʽ */
    public static int m10414() {
        boolean r0 = m10421();
        ?? r02 = r0;
        if (m10417() == false) goto L6;
        r02 = (r0 ? 1 : 0) | 2;
    L6:
        if (Debug.isDebuggerConnected() == true) goto L12;
        if (Debug.waitingForDebugger() == true) goto L12;
        return r02;
    L12:
        return r02 | 4;
    }

    /* JADX INFO: renamed from: ˈ */
    public static int m10415(Context r3, String r4, String r5) {
        Resources r0 = r3.getResources();
        int r1 = r3.getApplicationContext().getApplicationInfo().icon;
        if (r1 > 0) goto L12;
        String r12 = r3.getPackageName();
    L11:
        return r0.getIdentifier(r4, r5, r12);
    L12:
        r12 = r3.getResources().getResourcePackageName(r1);     // Catch: Resources.NotFoundException -> L8
        if ("android".equals(r12) == false) goto L11;
        r12 = r3.getPackageName();     // Catch: Resources.NotFoundException -> L8
    L8:
        r12 = r3.getPackageName();
        goto L11
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static String m10416(byte[] r6) {
        char[] r0 = new char[r6.length * 2];
        int r1 = 0;
    L4:
        if (r1 >= r6.length) goto L7;
        byte r2 = r6[r1];
        int r4 = r1 * 2;
        char[] r5 = f19223;
        r0[r4] = r5[(r2 & 255) >>> 4];
        r0[r4 + 1] = r5[r2 & 15];
        r1 = r1 + 1;
        goto L4
    L7:
        return new String(r0);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static boolean m10417() {
        boolean r0 = m10421();
        String r1 = Build.TAGS;
        if (r0 == true) goto L9;
        if (r1 == null) goto L9;
        if (r1.contains("test-keys") == false) goto L9;
        return true;
    L9:
        if (new File("/system/app/Superuser.apk").exists() == false) goto L11;
        return true;
    L11:
        File r12 = new File("/system/xbin/su");
        if (r0 == false) goto L14;
        return false;
    L14:
        if (r12.exists() == false) goto L18;
        return true;
    L18:
        return false;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static String m10418(String r2) {
        byte[] r22 = r2.getBytes();
        MessageDigest r0 = MessageDigest.getInstance("SHA-1");     // Catch: NoSuchAlgorithmException -> L6
        r0.update(r22);
        return m10416(r0.digest());
    L8:
        return "";
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m10419(Closeable r1, String r2) {
        if (r1 == null) goto L10;
        r1.close();     // Catch: IOException -> L5
        return;
    L7:
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static synchronized long m10420(Context r3) {
        monitor-enter(AbstractC5384.class);
        ActivityManager.MemoryInfo r1 = new ActivityManager.MemoryInfo();     // Catch: Throwable -> L7
        ((ActivityManager) r3.getSystemService("activity")).getMemoryInfo(r1);     // Catch: Throwable -> L7
        long r12 = r1.totalMem;     // Catch: Throwable -> L7
        monitor-exit(AbstractC5384.class);
        return r12;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static boolean m10421() {
        if (Build.PRODUCT.contains("sdk") == true) goto L11;
        String r0 = Build.HARDWARE;
        if (r0.contains("goldfish") == false) goto L7;
        return true;
    L7:
        if (r0.contains("ranchu") == true) goto L14;
        return false;
    L14:
        return true;
    L11:
        return true;
    }
}
