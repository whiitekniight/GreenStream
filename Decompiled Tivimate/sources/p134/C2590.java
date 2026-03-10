package p134;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ᵔٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2590 extends AbstractC2525 {

    /* JADX INFO: renamed from: ʼˎ */
    public final String f9197;

    /* JADX INFO: renamed from: ʽ */
    public final int f9198;

    /* JADX INFO: renamed from: ˈ */
    public final long f9199;

    /* JADX INFO: renamed from: ˑﹳ */
    public final long f9200;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final int f9201;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final String f9202;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9203;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f9204;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final boolean f9205;

    public C2590(int r1, String r2, int r3, long r4, long r6, boolean r8, int r9, String r10, String r11) {
        this.f9204 = r1;
        this.f9203 = r2;
        this.f9198 = r3;
        this.f9199 = r4;
        this.f9200 = r6;
        this.f9205 = r8;
        this.f9201 = r9;
        this.f9202 = r10;
        this.f9197 = r11;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof AbstractC2525) == false) goto L26;
        C2590 r82 = (C2590) ((AbstractC2525) r8);
        int r1 = r82.f9204;
        if (this.f9204 != r1) goto L26;
        if (this.f9203.equals(r82.f9203) == false) goto L26;
        if (this.f9198 != r82.f9198) goto L26;
        if (this.f9199 != r82.f9199) goto L26;
        if (this.f9200 != r82.f9200) goto L26;
        if (this.f9205 != r82.f9205) goto L26;
        if (this.f9201 != r82.f9201) goto L26;
        if (this.f9202.equals(r82.f9202) == false) goto L26;
        if (this.f9197.equals(r82.f9197) == false) goto L26;
        return true;
    L26:
        return false;
    }

    public final int hashCode() {
        int r0 = (((((this.f9204 ^ 1000003) * 1000003) ^ this.f9203.hashCode()) * 1000003) ^ this.f9198) * 1000003;
        long r2 = this.f9199;
        int r02 = (r0 ^ ((int) (r2 ^ (r2 >>> 32)))) * 1000003;
        long r22 = this.f9200;
        int r03 = (r02 ^ ((int) (r22 ^ (r22 >>> 32)))) * 1000003;
        if (this.f9205 == false) goto L5;
        int r23 = 1231;
    L7:
        return ((((((r03 ^ r23) * 1000003) ^ this.f9201) * 1000003) ^ this.f9202.hashCode()) * 1000003) ^ this.f9197.hashCode();
    L5:
        r23 = 1237;
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Device{arch=");
        r0.append(this.f9204);
        r0.append(", model=");
        r0.append(this.f9203);
        r0.append(", cores=");
        r0.append(this.f9198);
        r0.append(", ram=");
        r0.append(this.f9199);
        r0.append(", diskSpace=");
        r0.append(this.f9200);
        r0.append(", simulator=");
        r0.append(this.f9205);
        r0.append(", state=");
        r0.append(this.f9201);
        r0.append(", manufacturer=");
        r0.append(this.f9202);
        r0.append(", modelClass=");
        return AbstractC1703.m4486(r0, this.f9197, "}");
    }
}
