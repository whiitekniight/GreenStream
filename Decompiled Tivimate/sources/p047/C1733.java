package p047;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ʼﾞ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C1733 implements InterfaceC1721 {

    /* JADX INFO: renamed from: ˈ */
    public IBinder f5805;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5805;
    }

    @Override // p047.InterfaceC1721
    /* JADX INFO: renamed from: ʼᐧ */
    public final int mo4543(InterfaceC1707 r4, String r5) {
        Parcel r0 = Parcel.obtain();
        Parcel r1 = Parcel.obtain();
        r0.writeInterfaceToken(InterfaceC1721.f5757);     // Catch: Throwable -> L6
        r0.writeStrongInterface(r4);     // Catch: Throwable -> L6
        r0.writeString(r5);     // Catch: Throwable -> L6
        this.f5805.transact(1, r0, r1, 0);     // Catch: Throwable -> L6
        r1.readException();     // Catch: Throwable -> L6
        int r42 = r1.readInt();     // Catch: Throwable -> L6
        r1.recycle();
        r0.recycle();
        return r42;
    L6:
        th = move-exception;
        r1.recycle();
        r0.recycle();
        throw th;
    }

    @Override // p047.InterfaceC1721
    /* JADX INFO: renamed from: ˉٴ */
    public final void mo4544(InterfaceC1707 r4, int r5) {
        Parcel r0 = Parcel.obtain();
        Parcel r1 = Parcel.obtain();
        r0.writeInterfaceToken(InterfaceC1721.f5757);     // Catch: Throwable -> L6
        r0.writeStrongInterface(r4);     // Catch: Throwable -> L6
        r0.writeInt(r5);     // Catch: Throwable -> L6
        this.f5805.transact(2, r0, r1, 0);     // Catch: Throwable -> L6
        r1.readException();     // Catch: Throwable -> L6
        r1.recycle();
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r1.recycle();
        r0.recycle();
        throw th;
    }

    @Override // p047.InterfaceC1721
    /* JADX INFO: renamed from: ᵎⁱ */
    public final void mo4545(int r4, String[] r5) {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken(InterfaceC1721.f5757);     // Catch: Throwable -> L6
        r0.writeInt(r4);     // Catch: Throwable -> L6
        r0.writeStringArray(r5);     // Catch: Throwable -> L6
        this.f5805.transact(3, r0, null, 1);     // Catch: Throwable -> L6
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r0.recycle();
        throw th;
    }
}
