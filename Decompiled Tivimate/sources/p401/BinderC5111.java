package p401;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ⁱˊ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5111 extends Binder implements InterfaceC5113 {

    /* JADX INFO: renamed from: ˑﹳ */
    public static final /* synthetic */ int f18243 = 0;

    /* JADX INFO: renamed from: ˈ */
    public final /* synthetic */ C5112 f18244;

    public BinderC5111(C5112 r1) {
        this.f18244 = r1;
        attachInterface(this, InterfaceC5113.f18246);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
        String r0 = InterfaceC5113.f18246;
        if (r4 < 1) goto L8;
        if (r4 > 16777215) goto L8;
        r5.enforceInterface(r0);
    L8:
        if (r4 != 1598968902) goto L11;
        r6.writeString(r0);
        return true;
    L11:
        if (r4 != 1) goto L13;
        int r42 = r5.readInt();
        Parcelable.Creator r62 = Bundle.CREATOR;
        if (r5.readInt() == 0) goto L17;
        Object r52 = r62.createFromParcel(r5);
    L18:
        C5112 r63 = this.f18244;
        r63.mo0(r42, (Bundle) r52);
        return true;
    L17:
        r52 = null;
        goto L18
    L13:
        return super.onTransact(r4, r5, r6, r7);
    }
}
