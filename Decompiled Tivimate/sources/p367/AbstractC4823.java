package p367;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: ᵔˆ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4823 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Charset f17097 = null;

    static {
        f17097 = Charset.forName("US-ASCII");
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m9516(File r4) {
        File[] r0 = r4.listFiles();
        if (r0 == null) goto L16;
        int r42 = r0.length;
        int r1 = 0;
    L5:
        if (r1 >= r42) goto L14;
        File r2 = r0[r1];
        if (r2.isDirectory() == false) goto L10;
        m9516(r2);
    L10:
        if (r2.delete() == false) goto L13;
        r1 = r1 + 1;
        goto L5
    L13:
        throw new IOException("failed to delete file: " + r2);
    L14:
        return;
    L16:
        throw new IOException("not a readable directory: " + r4);
    }
}
