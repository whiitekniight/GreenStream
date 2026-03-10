package p110;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: ˆˆ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2383 implements IInterface {

    /* JADX INFO: renamed from: ˈ */
    public final IBinder f8544;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f8545;

    public C2383(IBinder r1, String r2) {
        this.f8544 = r1;
        this.f8545 = r2;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8544;
    }
}
