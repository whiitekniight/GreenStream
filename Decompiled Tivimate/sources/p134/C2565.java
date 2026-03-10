package p134;

import java.util.List;
import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ـˏ */
/* JADX INFO: loaded from: classes.dex */
public final class C2565 extends AbstractC2562 {

    /* JADX INFO: renamed from: ʽ */
    public final List f9092;

    /* JADX INFO: renamed from: ˈ */
    public final AbstractC2562 f9093;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f9094;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9095;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f9096;

    public C2565(String r1, String r2, List r3, AbstractC2562 r4, int r5) {
        this.f9096 = r1;
        this.f9095 = r2;
        this.f9092 = r3;
        this.f9093 = r4;
        this.f9094 = r5;
    }

    public final boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof AbstractC2562) == false) goto L26;
        C2565 r72 = (C2565) ((AbstractC2562) r7);
        AbstractC2562 r1 = r72.f9093;
        String r3 = r72.f9095;
        String r4 = r72.f9096;
        if (this.f9096.equals(r4) == false) goto L26;
        String r42 = this.f9095;
        if (r42 != null) goto L14;
        if (r3 != null) goto L26;
    L16:
        if (this.f9092.equals(r72.f9092) == false) goto L26;
        AbstractC2562 r32 = this.f9093;
        if (r32 != null) goto L22;
        if (r1 != null) goto L26;
    L24:
        if (this.f9094 != r72.f9094) goto L26;
        return true;
    L22:
        if (r32.equals(r1) == false) goto L26;
    L14:
        if (r42.equals(r3) == true) goto L16;
    L26:
        return false;
    }

    public final int hashCode() {
        int r0 = (this.f9096.hashCode() ^ 1000003) * 1000003;
        int r2 = 0;
        String r3 = this.f9095;
        if (r3 != null) goto L5;
        int r32 = 0;
    L6:
        int r02 = (((r0 ^ r32) * 1000003) ^ this.f9092.hashCode()) * 1000003;
        AbstractC2562 r33 = this.f9093;
        if (r33 == null) goto L11;
        r2 = r33.hashCode();
    L11:
        return ((r02 ^ r2) * 1000003) ^ this.f9094;
    L5:
        r32 = r3.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Exception{type=");
        r0.append(this.f9096);
        r0.append(", reason=");
        r0.append(this.f9095);
        r0.append(", frames=");
        r0.append(this.f9092);
        r0.append(", causedBy=");
        r0.append(this.f9093);
        r0.append(", overflowCount=");
        return AbstractC1703.m4493(r0, this.f9094, "}");
    }
}
