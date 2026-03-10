package p012;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: ʻʻ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1236 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static PackageInfo m3453(PackageManager r2, Context r3) {
        return r2.getPackageInfo(r3.getPackageName(), PackageManager.PackageInfoFlags.of(0));
    }
}
