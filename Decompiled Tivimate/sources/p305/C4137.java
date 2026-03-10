package p305;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: ٴᵢ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4137 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final HashMap f15257;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f15258;

    public C4137(String r2) {
        this.f15257 = new HashMap();
        this.f15258 = r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final File m8383(Uri r6) {
        String r0 = r6.getEncodedPath();
        int r3 = r0.indexOf(47, 1);
        if (r3 == (-1)) goto L18;
        String r4 = Uri.decode(r0.substring(1, r3));
        String r02 = Uri.decode(r0.substring(r3 + 1));
        File r2 = (File) this.f15257.get(r4);
        if (r2 == null) goto L16;
        File r62 = new File(r2, r02);
        File r63 = r62.getCanonicalFile();     // Catch: IOException -> L13
        String r03 = r63.getPath();
        String r22 = r2.getPath();
        if (FileProvider.m115(r03).startsWith(FileProvider.m115(r22) + '/') == false) goto L12;
        return r63;
    L12:
        throw new SecurityException("Resolved path jumped beyond configured root");
    L14:
        throw new IllegalArgumentException("Failed to resolve canonical path for " + r62);
    L16:
        throw new IllegalArgumentException("Unable to find configured root for " + r6);
    L18:
        throw new IllegalArgumentException("Unable to find path from root: " + r6);
    }
}
