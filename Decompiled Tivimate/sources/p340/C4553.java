package p340;

import java.util.Arrays;
import java.util.List;
import p022.AbstractC1327;

/* JADX INFO: renamed from: ᴵᵔ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C4553 implements Cloneable {

    /* JADX INFO: renamed from: ʽʽ */
    public InterfaceC4545 f16449;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f16450;

    /* JADX INFO: renamed from: ᴵˊ */
    public final List f16451;

    public C4553(C4562... r3) {
        int r0 = r3.length;
        this.f16450 = r0;
        this.f16451 = Arrays.asList(r3);
        C4562 r1 = r3[0];
        r3[r0 - 1].getClass();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m9027();
    }

    public final String toString() {
        String r0 = " ";
        int r1 = 0;
    L4:
        if (r1 >= this.f16450) goto L6;
        StringBuilder r02 = AbstractC1327.m3731(r0);
        r02.append(Float.valueOf(((C4562) this.f16451.get(r1)).f16489));
        r02.append("  ");
        r0 = r02.toString();
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4553 m9027() {
        List r0 = this.f16451;
        int r1 = r0.size();
        C4562[] r2 = new C4562[r1];
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L6;
        r2[r3] = ((C4562) r0.get(r3)).m9052();
        r3 = r3 + 1;
        goto L3
    L6:
        return new C4553(r2);
    }
}
