package p047;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ʼﾞ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C1694 implements InterfaceC1707 {

    /* JADX INFO: renamed from: ˈ */
    public IBinder f5630;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5630;
    }

    @Override // p047.InterfaceC1707
    /* JADX INFO: renamed from: ﹳᐧ */
    public final void mo4462(String[] r4) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken(InterfaceC1707.f5677);     // Catch: Throwable -> L6
        r0.writeStringArray(r4);     // Catch: Throwable -> L6
        this.f5630.transact(1, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }
}
