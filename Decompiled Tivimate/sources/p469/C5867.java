package p469;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p230.C3500;
import p230.C3501;

/* JADX INFO: renamed from: ﾞˏ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C5867 {

    /* JADX INFO: renamed from: ⁱˊ */
    public Object f21447;

    /* JADX INFO: renamed from: ﹳٴ */
    public Object f21448;

    /* JADX INFO: renamed from: ⁱˊ */
    public void m11497(int r4) {
        if (r4 != 32) goto L5;
    L11:
        this.f21448 = Integer.valueOf(r4);
        return;
    L5:
        if (r4 == 48) goto L11;
        if (r4 == 64) goto L11;
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[]{Integer.valueOf(r4)}));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public C3501 m11498() {
        Integer r0 = (Integer) this.f21448;
        if (r0 == null) goto L11;
        if (((C3500) this.f21447) == null) goto L9;
        return new C3501(r0.intValue(), (C3500) this.f21447);
    L9:
        throw new GeneralSecurityException("Variant is not set");
    L11:
        throw new GeneralSecurityException("Key size is not set");
    }
}
