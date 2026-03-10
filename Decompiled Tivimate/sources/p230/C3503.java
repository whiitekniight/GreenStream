package p230;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import p289.InterfaceC4018;
import p416.C5259;

/* JADX INFO: renamed from: ˏˑ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C3503 implements InterfaceC4018 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final C5259 f12471;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3502 f12472;

    public C3503(C3502 r1, C5259 r2) {
        this.f12472 = r1;
        this.f12471 = r2;
    }

    @Override // p289.InterfaceC4018
    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] mo7258(byte[] r3, byte[] r4) {
        Iterator r0 = this.f12471.m10262(r3).iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        return ((C3502) r0.next()).f12470.mo7258(r3, r4);
    L9:
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // p289.InterfaceC4018
    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] mo7259(byte[] r2, byte[] r3) {
        byte[] r32 = this.f12472.f12470.mo7259(r2, r3);
        int r22 = r2.length;
        return r32;
    }
}
