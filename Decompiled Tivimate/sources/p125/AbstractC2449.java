package p125;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import p334.C4448;

/* JADX INFO: renamed from: ˆﹶ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2449 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final String f8759 = null;

    static {
        f8759 = C4448.m8843("PackageManagerHelper");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m5666(Context r7, Class r8, boolean r9) {
        String r0 = "disabled";
        String r2 = f8759;
        int r4 = r7.getPackageManager().getComponentEnabledSetting(new ComponentName(r7, r8.getName()));     // Catch: Exception -> L11
        boolean r5 = false;
        if (r4 == 0) goto L8;
        if (r4 != 1) goto L8;
        r5 = true;
    L8:
        if (r9 != r5) goto L13;
        C4448.m8842().m8848(r2, "Skipping component enablement for ".concat(r8.getName()));     // Catch: Exception -> L11
        return;
    L13:
        PackageManager r3 = r7.getPackageManager();     // Catch: Exception -> L11
        ComponentName r42 = new ComponentName(r7, r8.getName());     // Catch: Exception -> L11
        if (r9 == false) goto L16;
        int r72 = 1;
    L17:
        r3.setComponentEnabledSetting(r42, r72, 1);     // Catch: Exception -> L11
        C4448 r73 = C4448.m8842();     // Catch: Exception -> L11
        StringBuilder r32 = new StringBuilder();     // Catch: Exception -> L11
        r32.append(r8.getName());     // Catch: Exception -> L11
        r32.append(" ");     // Catch: Exception -> L11
        if (r9 == false) goto L20;
        String r43 = "enabled";
    L21:
        r32.append(r43);     // Catch: Exception -> L11
        r73.m8848(r2, r32.toString());     // Catch: Exception -> L11
        return;
    L20:
        r43 = "disabled";
        goto L21
    L16:
        r72 = 2;
    L11:
        e = move-exception;
        C4448 r33 = C4448.m8842();
        StringBuilder r44 = new StringBuilder();
        r44.append(r8.getName());
        r44.append("could not be ");
        if (r9 == false) goto L26;
        r0 = "enabled";
    L26:
        r44.append(r0);
        r33.m8847(r2, r44.toString(), e);
    }
}
