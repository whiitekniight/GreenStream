package p395;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p005j$.util.DesugarCollections;

/* JADX INFO: renamed from: ⁱʼ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5060 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Map f18010 = null;

    static {
        String r0 = System.getProperty("http.agent");
        if (TextUtils.isEmpty(r0) == true) goto L17;
        int r1 = r0.length();
        StringBuilder r2 = new StringBuilder(r0.length());
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L16;
        char r4 = r0.charAt(r3);
        if (r4 > 31) goto L12;
        if (r4 == '\t') goto L12;
    L14:
        r2.append('?');
    L15:
        r3 = r3 + 1;
    L12:
        if (r4 >= '\u007f') goto L14;
        r2.append(r4);
        goto L15
    L16:
        r0 = r2.toString();
    L17:
        HashMap r12 = new HashMap(2);
        if (TextUtils.isEmpty(r0) == true) goto L20;
        r12.put("User-Agent", Collections.singletonList(new C5066(r0)));
    L20:
        f18010 = DesugarCollections.unmodifiableMap(r12);
    }
}
