package p028;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p220.C3420;
import p373.AbstractC4881;
import p442.AbstractC5586;
import p447.AbstractC5626;
import p464.C5848;

/* JADX INFO: renamed from: ʼ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1413 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Map f4792 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final CopyOnWriteArraySet f4793 = null;

    static {
        f4793 = new CopyOnWriteArraySet();
        LinkedHashMap r0 = new LinkedHashMap();
        Package r2 = C3420.class.getPackage();
        if (r2 == null) goto L5;
        String r22 = r2.getName();
    L6:
        if (r22 == null) goto L8;
        r0.put(r22, "OkHttp");
    L8:
        r0.put(C3420.class.getName(), "okhttp.OkHttpClient");
        r0.put(AbstractC4881.class.getName(), "okhttp.Http2");
        r0.put(C5848.class.getName(), "okhttp.TaskRunner");
        r0.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f4792 = AbstractC5586.m10759(r0);
        return;
    L5:
        r22 = null;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m3908(String r4, int r5, String r6, Throwable r7) {
        String r0 = (String) f4792.get(r4);
        if (r0 != null) goto L6;
        r0 = AbstractC5626.m10821(23, r4);
    L6:
        if (Log.isLoggable(r0, r5) == true) goto L8;
        return;
    L8:
        if (r7 == null) goto L10;
        r6 = r6 + '\n' + Log.getStackTraceString(r7);
    L10:
        int r72 = r6.length();
        int r1 = 0;
    L11:
        if (r1 >= r72) goto L24;
        int r2 = AbstractC5626.m10833(r6, '\n', r1, 4);
        if (r2 != (-1)) goto L16;
        r2 = r72;
    L16:
        int r3 = Math.min(r2, r1 + 4000);
        r6.substring(r1, r3);
        if (r3 >= r2) goto L18;
        r1 = r3;
        goto L16
    L18:
        r1 = r3 + 1;
        goto L11
    }
}
