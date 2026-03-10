package p319;

import p022.AbstractC1327;

/* JADX INFO: renamed from: ᐧـ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4226 {

    /* JADX INFO: renamed from: ʽ */
    public final String f15526;

    /* JADX INFO: renamed from: ˈ */
    public final C4225 f15527;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f15528;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f15529;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f15530;

    public C4226(String r1, String r2, String r3, C4225 r4, int r5) {
        this.f15530 = r1;
        this.f15529 = r2;
        this.f15526 = r3;
        this.f15527 = r4;
        this.f15528 = r5;
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
        return true;
    L5:
        if ((r6 instanceof C4226) == false) goto L38;
        C4226 r62 = (C4226) r6;
        int r0 = r62.f15528;
        C4225 r1 = r62.f15527;
        String r2 = r62.f15526;
        String r3 = r62.f15529;
        String r63 = r62.f15530;
        String r4 = this.f15530;
        if (r4 != null) goto L11;
        if (r63 != null) goto L42;
    L12:
        String r64 = this.f15529;
        if (r64 != null) goto L17;
        if (r3 != null) goto L44;
    L18:
        String r65 = this.f15526;
        if (r65 != null) goto L23;
        if (r2 != null) goto L46;
    L24:
        C4225 r66 = this.f15527;
        if (r66 != null) goto L29;
        if (r1 != null) goto L48;
    L30:
        int r67 = this.f15528;
        if (r67 != 0) goto L35;
        if (r0 != 0) goto L50;
        return true;
    L50:
        return false;
    L35:
        if (AbstractC1327.m3732(r67, r0) == false) goto L51;
        return true;
    L51:
        return false;
    L48:
        return false;
    L29:
        if (r66.equals(r1) == true) goto L30;
        return false;
    L46:
        return false;
    L23:
        if (r65.equals(r2) == true) goto L24;
        return false;
    L44:
        return false;
    L17:
        if (r64.equals(r3) == true) goto L18;
        return false;
    L42:
        return false;
    L11:
        if (r4.equals(r63) == true) goto L12;
        return false;
    L38:
        return false;
    }

    public final int hashCode() {
        int r0 = 0;
        String r1 = this.f15530;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = (r12 ^ 1000003) * 1000003;
        String r3 = this.f15529;
        if (r3 != null) goto L9;
        int r32 = 0;
    L10:
        int r14 = (r13 ^ r32) * 1000003;
        String r33 = this.f15526;
        if (r33 != null) goto L13;
        int r34 = 0;
    L14:
        int r15 = (r14 ^ r34) * 1000003;
        C4225 r35 = this.f15527;
        if (r35 != null) goto L17;
        int r36 = 0;
    L18:
        int r16 = (r15 ^ r36) * 1000003;
        int r2 = this.f15528;
        if (r2 == 0) goto L23;
        r0 = AbstractC1327.m3729(r2);
    L23:
        return r0 ^ r16;
    L17:
        r36 = r35.hashCode();
        goto L18
    L13:
        r34 = r33.hashCode();
        goto L14
    L9:
        r32 = r3.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("InstallationResponse{uri=");
        r0.append(this.f15530);
        r0.append(", fid=");
        r0.append(this.f15529);
        r0.append(", refreshToken=");
        r0.append(this.f15526);
        r0.append(", authToken=");
        r0.append(this.f15527);
        r0.append(", responseCode=");
        int r2 = this.f15528;
        if (r2 != 1) goto L5;
        String r1 = "OK";
    L9:
        r0.append(r1);
        r0.append("}");
        return r0.toString();
    L5:
        if (r2 == 2) goto L7;
        r1 = "null";
        goto L9
    L7:
        r1 = "BAD_CONFIG";
        goto L9
    }
}
