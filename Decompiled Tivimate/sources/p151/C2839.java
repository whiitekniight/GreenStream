package p151;

import android.util.Base64;
import java.util.Arrays;
import p047.AbstractC1703;
import p330.EnumC4399;
import ˑי.ʽ;

/* JADX INFO: renamed from: ˉˋ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C2839 {

    /* JADX INFO: renamed from: ʽ */
    public final EnumC4399 f10052;

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] f10053;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f10054;

    public C2839(String r1, byte[] r2, EnumC4399 r3) {
        this.f10054 = r1;
        this.f10053 = r2;
        this.f10052 = r3;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static ʽ m6152() {
        ʽ r0 = new ʽ();
        r0.ʽʽ = EnumC4399.f16121;
        return r0;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2839) == false) goto L14;
        C2839 r52 = (C2839) r5;
        if (this.f10054.equals(r52.f10054) == false) goto L14;
        if (Arrays.equals(this.f10053, r52.f10053) == false) goto L14;
        if (this.f10052.equals(r52.f10052) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return ((((this.f10054.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10053)) * 1000003) ^ this.f10052.hashCode();
    }

    public final String toString() {
        byte[] r0 = this.f10053;
        if (r0 != null) goto L5;
        String r02 = "";
    L6:
        StringBuilder r1 = new StringBuilder("TransportContext(");
        r1.append(this.f10054);
        r1.append(", ");
        r1.append(this.f10052);
        r1.append(", ");
        return AbstractC1703.m4486(r1, r02, ")");
    L5:
        r02 = Base64.encodeToString(r0, 2);
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C2839 m6153(EnumC4399 r3) {
        ʽ r0 = m6152();
        r0.ʽʽ(this.f10054);
        if (r3 == null) goto L7;
        r0.ʽʽ = r3;
        r0.ᴵˊ = this.f10053;
        return r0.ᵔﹳ();
    L7:
        throw new NullPointerException("Null priority");
    }
}
