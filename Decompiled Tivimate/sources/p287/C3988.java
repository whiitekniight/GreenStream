package p287;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import ٴﾞ.ˆʾ;

/* JADX INFO: renamed from: ـﹶ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3988 extends ˆʾ {
    /* JADX INFO: renamed from: ـˆ */
    public final Signature[] m8161(PackageManager r2, String r3) {
        return r2.getPackageInfo(r3, 64).signatures;
    }
}
