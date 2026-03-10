package p419;

import java.io.EOFException;
import java.rmi.UnmarshalException;
import p104.EnumC2335;
import p222.C3458;
import p226.C3490;
import p274.C3916;
import p412.C5243;
import ʽٴ.ˈ;

/* JADX INFO: renamed from: ﹳˈ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5318 extends ˈ {

    /* JADX INFO: renamed from: ʽ */
    public int f19077;

    /* JADX INFO: renamed from: ᵎⁱ */
    public final void m10349(C3916 r8) {
        C3490 r0 = (C3490) this;
        C5243 r1 = new C5243();
        r0.f12425 = r1;
        r8.m8035(r1);
        EnumC2335 r12 = EnumC2335.f8385;
        r8.m8044(r12);
        C3458 r2 = (C3458) r8.f14398;
        r2.readInt();
        if (r2.readInt() == 0) goto L5;
        r0.f12426 = Long.valueOf(((long) r2.readInt()) & 4294967295L);
    L6:
        r8.m8044(r12);
        this.f19077 = r2.readInt();
        r8.m8038();     // Catch: EOFException -> L10
        throw new UnmarshalException("At least one byte remained after reading the return code. Is this response aligned properly?");
    L10:
        return;
    L5:
        r0.f12426 = null;
        goto L6
    }
}
