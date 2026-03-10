package p416;

import p289.AbstractC4011;
import p342.EnumC4633;

/* JADX INFO: renamed from: ﹳʽ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C5288 extends AbstractC4011 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final EnumC4633 f19007;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f19008;

    public C5288(String r1, EnumC4633 r2) {
        this.f19008 = r1;
        this.f19007 = r2;
    }

    public final String toString() {
        int r0 = this.f19007.ordinal();
        if (r0 != 1) goto L5;
        String r02 = "TINK";
    L16:
        return "(typeUrl=" + this.f19008 + ", outputPrefixType=" + r02 + ")";
    L5:
        if (r0 != 2) goto L7;
        r02 = "LEGACY";
        goto L16
    L7:
        if (r0 != 3) goto L9;
        r02 = "RAW";
        goto L16
    L9:
        if (r0 == 4) goto L11;
        r02 = "UNKNOWN";
        goto L16
    L11:
        r02 = "CRUNCHY";
        goto L16
    }

    @Override // p289.AbstractC4011
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo7257() {
        if (this.f19007 == EnumC4633.f16523) goto L6;
        return true;
    L6:
        return false;
    }
}
