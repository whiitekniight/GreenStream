package p412;

import java.rmi.UnmarshalException;
import java.util.Arrays;
import p104.EnumC2335;
import p104.InterfaceC2334;
import p222.C3458;
import p274.C3916;

/* JADX INFO: renamed from: ⁱﾞ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5241 implements InterfaceC2334 {

    /* JADX INFO: renamed from: ﹳٴ */
    public C5239[] f18913;

    /* JADX INFO: renamed from: ˈ */
    public static int m10238(C3916 r5) {
        long r0 = ((long) ((C3458) r5.f14398).readInt()) & 4294967295L;
        if (r0 > 2147483647L) goto L7;
        return (int) r0;
    L7:
        throw new UnmarshalException(String.format("%s %d > %d", new Object[]{"EntriesRead", Long.valueOf(r0), Integer.MAX_VALUE}));
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof AbstractC5241) == true) goto L10;
        return false;
    L10:
        return Arrays.equals(this.f18913, ((AbstractC5241) r2).f18913);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18913);
    }

    @Override // p104.InterfaceC2334
    /* JADX INFO: renamed from: ʽ */
    public final void mo5495(C3916 r1) {
    }

    @Override // p104.InterfaceC2334
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo5496(C3916 r6) {
        if (this.f18913 == null) goto L14;
        r6.m8044(EnumC2335.f8385);
        r6.m8047(4);
        int r0 = 0;
        int r1 = 0;
    L5:
        C5239[] r2 = this.f18913;
        if (r1 >= r2.length) goto L8;
        r2[r1] = new C5239();
        r1 = r1 + 1;
        goto L5
    L8:
        int r12 = r2.length;
        int r3 = 0;
    L9:
        if (r3 >= r12) goto L11;
        r2[r3].mo5497(r6);
        r3 = r3 + 1;
        goto L9
    L11:
        C5239[] r13 = this.f18913;
        int r22 = r13.length;
    L12:
        if (r0 >= r22) goto L18;
        r13[r0].mo5496(r6);
        r0 = r0 + 1;
        goto L12
    L18:
        return;
    }

    @Override // p104.InterfaceC2334
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5497(C3916 r4) {
        r4.m8044(EnumC2335.f8385);
        int r0 = m10238(r4);
        if (((C3458) r4.f14398).readInt() == 0) goto L9;
        if (r0 < 0) goto L8;
        this.f18913 = new C5239[r0];
        return;
    L8:
        throw new UnmarshalException(String.format("Expected entriesRead >= 0, got: %d", new Object[]{Integer.valueOf(r0)}));
    L9:
        this.f18913 = null;
    }
}
