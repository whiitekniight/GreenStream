package androidx.leanback.widget;

/* JADX INFO: renamed from: androidx.leanback.widget.ʽⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class C0092 {

    /* JADX INFO: renamed from: ʼˎ */
    public int f848;

    /* JADX INFO: renamed from: ʽ */
    public int f849;

    /* JADX INFO: renamed from: ˆʾ */
    public int f850;

    /* JADX INFO: renamed from: ˈ */
    public int f851;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f852;

    /* JADX INFO: renamed from: ٴﹶ */
    public int f853;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f854;

    /* JADX INFO: renamed from: ᵔᵢ */
    public float f855;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f856;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f857;

    /* JADX INFO: renamed from: ﾞʻ */
    public boolean f858;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f859;

    public C0092() {
        this.f852 = 2;
        this.f859 = 3;
        this.f854 = 0;
        this.f855 = 50.0f;
        this.f856 = Integer.MIN_VALUE;
        this.f857 = Integer.MAX_VALUE;
    }

    public final String toString() {
        return " min:" + this.f856 + " " + this.f851 + " max:" + this.f857 + " " + this.f849;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m575(int r7, int r8, int r9, int r10) {
        this.f856 = r7;
        this.f857 = r8;
        int r72 = (this.f848 - this.f850) - this.f853;
        int r82 = m577();
        int r0 = this.f856;
        boolean r2 = false;
        if (r0 != Integer.MIN_VALUE) goto L5;
        boolean r1 = true;
    L6:
        int r4 = this.f857;
        if (r4 != Integer.MAX_VALUE) goto L9;
        r2 = true;
    L9:
        if (r1 == false) goto L11;
    L19:
        if (r2 == false) goto L21;
    L29:
        if (r2 == true) goto L61;
        if (r1 == false) goto L32;
        return;
    L32:
        if (this.f858 == true) goto L47;
        int r73 = this.f859;
        if ((r73 & 1) == 0) goto L41;
        if ((this.f852 & 1) == 0) goto L38;
        this.f851 = Math.min(this.f851, r10 - r82);
    L38:
        this.f849 = Math.max(this.f851, this.f849);
        return;
    L41:
        if ((r73 & 2) != 0) goto L43;
        return;
    L43:
        if ((this.f852 & 2) == 0) goto L45;
        this.f849 = Math.max(this.f849, r9 - r82);
    L45:
        this.f851 = Math.min(this.f851, this.f849);
        return;
    L47:
        int r74 = this.f859;
        if ((r74 & 1) == 0) goto L55;
        if ((this.f852 & 1) == 0) goto L52;
        this.f849 = Math.max(this.f849, r9 - r82);
    L52:
        this.f851 = Math.min(this.f851, this.f849);
        return;
    L55:
        if ((r74 & 2) != 0) goto L57;
        return;
    L57:
        if ((this.f852 & 2) == 0) goto L59;
        this.f851 = Math.min(this.f851, r10 - r82);
    L59:
        this.f849 = Math.max(this.f851, this.f849);
        return;
    L61:
        return;
    L21:
        if (this.f858 == true) goto L26;
        if ((this.f859 & 2) != 0) goto L27;
    L28:
        this.f849 = r10 - r82;
    L27:
        this.f849 = (r4 - this.f850) - r72;
        goto L29
    L26:
        if ((this.f859 & 1) == 0) goto L28;
    L11:
        if (this.f858 == true) goto L16;
        if ((this.f859 & 1) != 0) goto L17;
    L18:
        this.f851 = r9 - r82;
    L17:
        this.f851 = r0 - this.f850;
        goto L19
    L16:
        if ((this.f859 & 2) == 0) goto L18;
    L5:
        r1 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m576(int r11) {
        int r0 = this.f848;
        int r1 = m577();
        int r2 = this.f856;
        boolean r4 = false;
        if (r2 != Integer.MIN_VALUE) goto L5;
        boolean r3 = true;
    L6:
        int r6 = this.f857;
        if (r6 != Integer.MAX_VALUE) goto L9;
        r4 = true;
    L9:
        if (r3 == true) goto L25;
        int r7 = this.f850;
        int r8 = r1 - r7;
        if (this.f858 == true) goto L16;
        if ((this.f859 & 1) == 0) goto L25;
    L18:
        if ((r11 - r2) > r8) goto L25;
        int r22 = r2 - r7;
        if (r4 == true) goto L24;
        int r112 = this.f849;
        if (r22 <= r112) goto L24;
        return r112;
    L24:
        return r22;
    L16:
        if ((this.f859 & 2) != 0) goto L18;
    L25:
        if (r4 == true) goto L42;
        int r42 = this.f853;
        int r23 = (r0 - r1) - r42;
        if (this.f858 == true) goto L32;
        if ((this.f859 & 2) == 0) goto L42;
    L34:
        if ((r6 - r11) > r23) goto L42;
        int r62 = r6 - (r0 - r42);
        if (r3 == true) goto L40;
        int r113 = this.f851;
        if (r62 >= r113) goto L40;
        return r113;
    L40:
        return r62;
    L32:
        if ((1 & this.f859) != 0) goto L34;
    L42:
        return r11 - r1;
    L5:
        r3 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m577() {
        if (this.f858 == true) goto L12;
        int r0 = this.f854;
        if (r0 >= 0) goto L8;
        r0 = r0 + this.f848;
    L8:
        float r3 = this.f855;
        if (r3 != (-1.0f)) goto L11;
        return r0;
    L11:
        return r0 + ((int) ((this.f848 * r3) / 100.0f));
    L12:
        int r02 = this.f854;
        if (r02 < 0) goto L15;
        int r32 = this.f848 - r02;
    L16:
        float r03 = this.f855;
        if (r03 != (-1.0f)) goto L19;
        return r32;
    L19:
        return r32 - ((int) ((this.f848 * r03) / 100.0f));
    L15:
        r32 = -r02;
        goto L16
    }
}
