package p412;

import java.rmi.UnmarshalException;
import p104.EnumC2335;
import p104.InterfaceC2334;
import p222.C3458;
import p274.C3916;

/* JADX INFO: renamed from: ⁱﾞ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5242 implements InterfaceC2334 {

    /* JADX INFO: renamed from: ﹳٴ */
    public C5240 f18914;

    @Override // p104.InterfaceC2334
    /* JADX INFO: renamed from: ʽ */
    public final void mo5495(C3916 r1) {
    }

    @Override // p104.InterfaceC2334
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo5496(C3916 r2) {
        C5240 r0 = this.f18914;
        if (r0 == null) goto L6;
        r2.m8035(r0);
        return;
    }

    @Override // p104.InterfaceC2334
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5497(C3916 r6) {
        r6.m8044(EnumC2335.f8385);
        C3458 r62 = (C3458) r6.f14398;
        int r0 = r62.readInt();
        if (r0 != 1) goto L15;
        int r4 = r62.readInt();
        if (r4 != r0) goto L13;
        if (r62.readInt() == 0) goto L10;
        this.f18914 = new C5240();
        return;
    L10:
        this.f18914 = null;
        return;
    L13:
        throw new UnmarshalException(String.format("Expected info level %d to match enum level, got: %d", new Object[]{Integer.valueOf(r0), Integer.valueOf(r4)}));
    L15:
        throw new UnmarshalException(String.format("Expected info level %d, got: %d", new Object[]{1, Integer.valueOf(r0)}));
    }
}
