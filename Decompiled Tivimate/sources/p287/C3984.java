package p287;

import java.nio.ByteBuffer;
import p136.C2612;
import p136.C2613;
import ˏˆ.ﹳٴ;

/* JADX INFO: renamed from: ـﹶ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3984 {

    /* JADX INFO: renamed from: ˈ */
    public static final ThreadLocal f14755 = null;

    /* JADX INFO: renamed from: ʽ */
    public volatile int f14756;

    /* JADX INFO: renamed from: ⁱˊ */
    public final ﹳٴ f14757;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f14758;

    static {
        f14755 = new ThreadLocal();
    }

    public C3984(ﹳٴ r2, int r3) {
        this.f14756 = 0;
        this.f14757 = r2;
        this.f14758 = r3;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append(", id:");
        C2613 r1 = m8155();
        int r2 = r1.m5803(4);
        int r3 = 0;
        if (r2 == 0) goto L5;
        int r12 = ((ByteBuffer) r1.f9256).getInt(r2 + r1.f9255);
    L6:
        r0.append(Integer.toHexString(r12));
        r0.append(", codepoints:");
        C2613 r13 = m8155();
        int r22 = r13.m5803(16);
        if (r22 == 0) goto L9;
        int r23 = r22 + r13.f9255;
        int r14 = ((ByteBuffer) r13.f9256).getInt(((ByteBuffer) r13.f9256).getInt(r23) + r23);
    L10:
        if (r3 >= r14) goto L13;
        r0.append(Integer.toHexString(m8156(r3)));
        r0.append(" ");
        r3 = r3 + 1;
        goto L10
    L13:
        return r0.toString();
    L9:
        r14 = 0;
        goto L10
    L5:
        r12 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C2613 m8155() {
        ThreadLocal r0 = f14755;
        C2613 r1 = (C2613) r0.get();
        if (r1 != null) goto L5;
        r1 = new C2613();
        r0.set(r1);
    L5:
        C2612 r02 = (C2612) this.f14757.ᴵˊ;
        int r2 = r02.m5803(6);
        if (r2 == 0) goto L12;
        int r22 = r2 + r02.f9255;
        int r3 = (((ByteBuffer) r02.f9256).getInt(r22) + r22) + 4;
        int r23 = (this.f14758 * 4) + r3;
        int r32 = ((ByteBuffer) r02.f9256).getInt(r23) + r23;
        ByteBuffer r03 = (ByteBuffer) r02.f9256;
        r1.f9256 = r03;
        if (r03 == null) goto L11;
        r1.f9255 = r32;
        int r33 = r32 - r03.getInt(r32);
        r1.f9257 = r33;
        r1.f9254 = ((ByteBuffer) r1.f9256).getShort(r33);
        return r1;
    L11:
        r1.f9255 = 0;
        r1.f9257 = 0;
        r1.f9254 = 0;
    L12:
        return r1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m8156(int r4) {
        C2613 r0 = m8155();
        int r1 = r0.m5803(16);
        if (r1 == 0) goto L6;
        ByteBuffer r2 = (ByteBuffer) r0.f9256;
        int r12 = r1 + r0.f9255;
        int r42 = r4 * 4;
        return r2.getInt(r42 + ((r2.getInt(r12) + r12) + 4));
    L6:
        return 0;
    }
}
