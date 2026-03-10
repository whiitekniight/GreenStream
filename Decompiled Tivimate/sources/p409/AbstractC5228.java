package p409;

import java.rmi.UnmarshalException;
import p005j$.util.Objects;
import p104.EnumC2335;
import p104.InterfaceC2334;
import p149.AbstractC2788;
import p222.C3458;
import p274.C3916;

/* JADX INFO: renamed from: ⁱᵔ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5228 implements InterfaceC2334 {

    /* JADX INFO: renamed from: ʽ */
    public int f18845;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f18846;

    /* JADX INFO: renamed from: ﹳٴ */
    public String f18847;

    /* JADX INFO: renamed from: ˈ */
    public static int m10198(String r4, C3916 r5) {
        long r0 = ((long) ((C3458) r5.f14398).readInt()) & 4294967295L;
        if (r0 > 2147483647L) goto L7;
        return (int) r0;
    L7:
        throw new UnmarshalException(String.format("%s %d > %d", new Object[]{r4, Long.valueOf(r0), Integer.MAX_VALUE}));
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof AbstractC5228) == true) goto L9;
        return false;
    L9:
        if (Objects.equals(this.f18847, ((AbstractC5228) r4).f18847) == false) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.TRUE, this.f18847});
    }

    public final String toString() {
        String r0 = this.f18847;
        if (r0 != null) goto L7;
        return "null";
    L7:
        return AbstractC2788.m6089("\"", r0, "\"");
    }

    @Override // p104.InterfaceC2334
    /* JADX INFO: renamed from: ʽ */
    public final void mo5495(C3916 r2) {
        r2.m8044(EnumC2335.f8385);
        r2.m8047(4);
    }

    @Override // p104.InterfaceC2334
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo5496(C3916 r7) {
        r7.m8044(EnumC2335.f8384);
        r7.m8047(this.f18846 * 2);
        int r0 = this.f18845;
        int r2 = 0;
        if (r0 <= 0) goto L5;
        r0 = r0 - 1;
        boolean r3 = true;
    L6:
        StringBuilder r4 = new StringBuilder(r0);
    L7:
        if (r2 >= r0) goto L9;
        r4.append((char) ((C3458) r7.f14398).readUnsignedShort());
        r2 = r2 + 1;
        goto L7
    L9:
        this.f18847 = r4.toString();
        if (r3 == false) goto L14;
        r7.m8047(2);
        return;
    L14:
        return;
    L5:
        r3 = false;
        goto L6
    }

    @Override // p104.InterfaceC2334
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5497(C3916 r2) {
        r2.m8044(EnumC2335.f8385);
        this.f18846 = m10198("Offset", r2);
        this.f18845 = m10198("ActualCount", r2);
    }
}
