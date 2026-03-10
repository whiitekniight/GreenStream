package p378;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ᵔﹶ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4944 {

    /* JADX INFO: renamed from: ˑﹳ */
    public static final boolean f17631 = false;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final File f17632 = null;

    /* JADX INFO: renamed from: ᵔᵢ */
    public static volatile C4944 f17633;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final boolean f17634 = false;

    /* JADX INFO: renamed from: ʽ */
    public boolean f17635;

    /* JADX INFO: renamed from: ˈ */
    public final AtomicBoolean f17636;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f17637;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f17638;

    static {
        int r0 = Build.VERSION.SDK_INT;
        boolean r2 = false;
        if (r0 >= 29) goto L5;
        boolean r1 = true;
    L6:
        f17631 = r1;
        if (r0 < 28) goto L9;
        r2 = true;
    L9:
        f17634 = r2;
        f17632 = new File("/proc/self/fd");
        return;
    L5:
        r1 = false;
        goto L6
    }

    public C4944() {
        this.f17635 = true;
        this.f17636 = new AtomicBoolean(false);
        this.f17638 = 20000;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C4944 m9724() {
        if (f17633 != null) goto L16;
        monitor-enter(C4944.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f17633 != null) goto L11;
        f17633 = new C4944();     // Catch: Throwable -> L9
    L11:
        monitor-exit(C4944.class);     // Catch: Throwable -> L9
    L16:
        return f17633;
    }

    /* JADX INFO: renamed from: ʽ */
    public final boolean m9725(int r7, int r8, boolean r9, boolean r10) {
        if (r9 == true) goto L9;
        if (Log.isLoggable("HardwareConfig", 2) == true) goto L7;
    L58:
        return false;
    L7:
        return false;
    L9:
        if (f17634 == true) goto L15;
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        return false;
    L15:
        if (f17631 == true) goto L17;
    L22:
        if (r10 == true) goto L24;
        if (r7 < 0) goto L56;
        if (r8 < 0) goto L56;
        monitor-enter(this);
        int r82 = this.f17637 + 1;     // Catch: Throwable -> L43
        this.f17637 = r82;     // Catch: Throwable -> L43
        if (r82 < 50) goto L45;
        this.f17637 = 0;     // Catch: Throwable -> L43
        int r83 = f17632.list().length;     // Catch: Throwable -> L43
        long r2 = m9726();     // Catch: Throwable -> L43
        if (r83 >= r2) goto L37;
        boolean r102 = true;
    L38:
        this.f17635 = r102;     // Catch: Throwable -> L43
        if (r102 == true) goto L45;
        if (Log.isLoggable("Downsampler", 5) == false) goto L45;
        String r0 = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + r83 + ", limit " + r2;     // Catch: Throwable -> L43
        goto L45
    L37:
        r102 = false;
    L45:
        boolean r72 = this.f17635;     // Catch: Throwable -> L43
        monitor-exit(this);
        if (r72 == false) goto L49;
        return true;
    L49:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        return false;
    L43:
        th = move-exception;
        throw th;
    L56:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        goto L58
    L24:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        return false;
    L17:
        if (this.f17636.get() == true) goto L22;
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        return false;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m9726() {
        if (Build.VERSION.SDK_INT != 28) goto L13;
        Iterator r0 = Arrays.asList(new String[]{"GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013"}).iterator();
    L7:
        if (r0.hasNext() == false) goto L13;
        String r1 = (String) r0.next();
        if (Build.MODEL.startsWith(r1) == false) goto L7;
        return 500;
    L13:
        return this.f17638;
    }
}
