package p081;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ʾـ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2108 implements InterfaceC2107, IInterface {

    /* JADX INFO: renamed from: ˈ */
    public final IBinder f7412;

    public C2108(IBinder r1) {
        this.f7412 = r1;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7412;
    }

    /* JADX INFO: renamed from: ʽ */
    public final Parcel m5117(Parcel r4, int r5) {
        Parcel r0 = Parcel.obtain();
        this.f7412.transact(r5, r4, r0, 0);     // Catch: Throwable -> L6 RuntimeException -> L8
        r0.readException();     // Catch: Throwable -> L6 RuntimeException -> L8
        r4.recycle();
        return r0;
    L6:
        th = move-exception;
        r4.recycle();
        throw th;
    L8:
        e = move-exception;
        r0.recycle();     // Catch: Throwable -> L6
        throw e;     // Catch: Throwable -> L6
    }
}
