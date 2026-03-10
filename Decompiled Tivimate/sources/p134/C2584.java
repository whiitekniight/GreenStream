package p134;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ᵎˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2584 extends AbstractC2556 {

    /* JADX INFO: renamed from: ʽ */
    public final String f9157;

    /* JADX INFO: renamed from: ˈ */
    public final String f9158;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f9159;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9160;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f9161;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final String f9162;

    public C2584(String r1, String r2, String r3, String r4, String r5, String r6) {
        this.f9161 = r1;
        this.f9160 = r2;
        this.f9157 = r3;
        this.f9158 = r4;
        this.f9159 = r5;
        this.f9162 = r6;
    }

    public final boolean equals(Object r9) {
        if (r9 != this) goto L6;
        return true;
    L6:
        if ((r9 instanceof AbstractC2556) == false) goto L36;
        C2584 r92 = (C2584) ((AbstractC2556) r9);
        String r1 = r92.f9162;
        String r3 = r92.f9159;
        String r4 = r92.f9158;
        String r5 = r92.f9157;
        String r6 = r92.f9161;
        if (this.f9161.equals(r6) == false) goto L36;
        if (this.f9160.equals(r92.f9160) == false) goto L36;
        String r93 = this.f9157;
        if (r93 != null) goto L16;
        if (r5 != null) goto L36;
    L17:
        String r94 = this.f9158;
        if (r94 != null) goto L22;
        if (r4 != null) goto L36;
    L23:
        String r95 = this.f9159;
        if (r95 != null) goto L28;
        if (r3 != null) goto L36;
    L29:
        String r96 = this.f9162;
        if (r96 != null) goto L34;
        if (r1 != null) goto L36;
    L35:
        return true;
    L34:
        if (r96.equals(r1) == false) goto L36;
    L28:
        if (r95.equals(r3) == false) goto L36;
    L22:
        if (r94.equals(r4) == false) goto L36;
    L16:
        if (r93.equals(r5) == true) goto L17;
    L36:
        return false;
    }

    public final int hashCode() {
        int r0 = (((this.f9161.hashCode() ^ 1000003) * 1000003) ^ this.f9160.hashCode()) * 1000003;
        int r2 = 0;
        String r3 = this.f9157;
        if (r3 != null) goto L5;
        int r32 = 0;
    L6:
        int r02 = (r0 ^ r32) * (-721379959);
        String r33 = this.f9158;
        if (r33 != null) goto L9;
        int r34 = 0;
    L10:
        int r03 = (r02 ^ r34) * 1000003;
        String r35 = this.f9159;
        if (r35 != null) goto L13;
        int r36 = 0;
    L14:
        int r04 = (r03 ^ r36) * 1000003;
        String r1 = this.f9162;
        if (r1 == null) goto L19;
        r2 = r1.hashCode();
    L19:
        return r04 ^ r2;
    L13:
        r36 = r35.hashCode();
        goto L14
    L9:
        r34 = r33.hashCode();
        goto L10
    L5:
        r32 = r3.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Application{identifier=");
        r0.append(this.f9161);
        r0.append(", version=");
        r0.append(this.f9160);
        r0.append(", displayVersion=");
        r0.append(this.f9157);
        r0.append(", organization=null, installationUuid=");
        r0.append(this.f9158);
        r0.append(", developmentPlatform=");
        r0.append(this.f9159);
        r0.append(", developmentPlatformVersion=");
        return AbstractC1703.m4486(r0, this.f9162, "}");
    }
}
