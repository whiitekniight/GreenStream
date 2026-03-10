package p331;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.AbstractBinderC0554;
import java.util.Arrays;
import p100.BinderC2236;
import p100.InterfaceC2237;
import p207.AbstractC3371;
import p308.AbstractC4142;
import p308.InterfaceC4168;

/* JADX INFO: renamed from: ᴵˈ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4416 extends AbstractBinderC0554 implements InterfaceC4168 {

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f16155;

    public AbstractBinderC4416(byte[] r3) {
        super("com.google.android.gms.common.internal.ICertData");
        if (r3.length != 25) goto L5;
        boolean r0 = true;
    L6:
        AbstractC4142.m8397(r0);
        this.f16155 = Arrays.hashCode(r3);
        return;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ˆﾞ */
    public static byte[] m8816(String r1) {
        return r1.getBytes("ISO-8859-1");
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    public final boolean equals(Object r4) {
        if (r4 != null) goto L5;
    L16:
        return false;
    L5:
        if ((r4 instanceof InterfaceC4168) == false) goto L16;
        InterfaceC4168 r42 = (InterfaceC4168) r4;     // Catch: RemoteException -> L14
        if (r42.mo8434() != this.f16155) goto L16;
        InterfaceC2237 r43 = r42.mo8435();     // Catch: RemoteException -> L14
        if (r43 == null) goto L16;
        byte[] r44 = (byte[]) BinderC2236.m5426(r43);     // Catch: RemoteException -> L14
        return Arrays.equals(mo8808(), r44);
    }

    public final int hashCode() {
        return this.f16155;
    }

    @Override // p308.InterfaceC4168
    /* JADX INFO: renamed from: ᵎﹶ */
    public final int mo8434() {
        return this.f16155;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC0554
    /* JADX INFO: renamed from: ᵔי */
    public final boolean mo2188(int r2, Parcel r3, Parcel r4) {
        if (r2 != 1) goto L5;
        InterfaceC2237 r22 = mo8435();
        r4.writeNoException();
        AbstractC3371.m7099(r4, r22);
        return true;
    L5:
        if (r2 == 2) goto L8;
        return false;
    L8:
        r4.writeNoException();
        r4.writeInt(this.f16155);
        return true;
    }

    /* JADX INFO: renamed from: ᵔٴ */
    public abstract byte[] mo8808();

    @Override // p308.InterfaceC4168
    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceC2237 mo8435() {
        return new BinderC2236(mo8808());
    }
}
