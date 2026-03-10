package p245;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import p359.AbstractC4761;

/* JADX INFO: renamed from: ˑˊ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3675 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final Context f13153;

    public C3675(Context r1) {
        this.f13153 = r1;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean m7726() {
        int r0 = Binder.getCallingUid();
        int r1 = Process.myUid();
        Context r2 = this.f13153;
        if (r0 != r1) goto L7;
        return ﹳٴ.ﾞᴵ(r2);
    L7:
        if (AbstractC4761.m9372() == false) goto L12;
        String r02 = r2.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (r02 != null) goto L11;
        return false;
    L11:
        return r2.getPackageManager().isInstantApp(r02);
    L12:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final PackageInfo m7727(int r2, String r3) {
        return this.f13153.getPackageManager().getPackageInfo(r3, r2);
    }
}
