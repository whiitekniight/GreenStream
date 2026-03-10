package p320;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ᐧٴ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C4261 extends AbstractC4259 {

    /* JADX INFO: renamed from: ʼˎ */
    public final String f15612;

    /* JADX INFO: renamed from: ʽ */
    public final String f15613;

    /* JADX INFO: renamed from: ˆʾ */
    public final String f15614;

    /* JADX INFO: renamed from: ˈ */
    public final String f15615;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f15616;

    /* JADX INFO: renamed from: ٴﹶ */
    public final String f15617;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final String f15618;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final String f15619;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f15620;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Integer f15621;

    /* JADX INFO: renamed from: ﾞʻ */
    public final String f15622;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final String f15623;

    public C4261(Integer r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12) {
        this.f15621 = r1;
        this.f15620 = r2;
        this.f15613 = r3;
        this.f15615 = r4;
        this.f15616 = r5;
        this.f15623 = r6;
        this.f15618 = r7;
        this.f15619 = r8;
        this.f15612 = r9;
        this.f15614 = r10;
        this.f15617 = r11;
        this.f15622 = r12;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC4259) == false) goto L92;
        AbstractC4259 r52 = (AbstractC4259) r5;
        Integer r1 = this.f15621;
        if (r1 != null) goto L13;
        if (((C4261) r52).f15621 != null) goto L92;
    L14:
        String r12 = this.f15620;
        if (r12 != null) goto L20;
        if (((C4261) r52).f15620 != null) goto L92;
    L21:
        String r13 = this.f15613;
        if (r13 != null) goto L27;
        if (((C4261) r52).f15613 != null) goto L92;
    L28:
        String r14 = this.f15615;
        if (r14 != null) goto L34;
        if (((C4261) r52).f15615 != null) goto L92;
    L35:
        String r15 = this.f15616;
        if (r15 != null) goto L41;
        if (((C4261) r52).f15616 != null) goto L92;
    L42:
        String r16 = this.f15623;
        if (r16 != null) goto L48;
        if (((C4261) r52).f15623 != null) goto L92;
    L49:
        String r17 = this.f15618;
        if (r17 != null) goto L55;
        if (((C4261) r52).f15618 != null) goto L92;
    L56:
        String r18 = this.f15619;
        if (r18 != null) goto L62;
        if (((C4261) r52).f15619 != null) goto L92;
    L63:
        String r19 = this.f15612;
        if (r19 != null) goto L69;
        if (((C4261) r52).f15612 != null) goto L92;
    L70:
        String r110 = this.f15614;
        if (r110 != null) goto L76;
        if (((C4261) r52).f15614 != null) goto L92;
    L77:
        String r111 = this.f15617;
        if (r111 != null) goto L83;
        if (((C4261) r52).f15617 != null) goto L92;
    L84:
        String r112 = this.f15622;
        if (r112 != null) goto L90;
        if (((C4261) r52).f15622 != null) goto L92;
    L91:
        return true;
    L90:
        if (r112.equals(((C4261) r52).f15622) == false) goto L92;
    L83:
        if (r111.equals(((C4261) r52).f15617) == false) goto L92;
    L76:
        if (r110.equals(((C4261) r52).f15614) == false) goto L92;
    L69:
        if (r19.equals(((C4261) r52).f15612) == false) goto L92;
    L62:
        if (r18.equals(((C4261) r52).f15619) == false) goto L92;
    L55:
        if (r17.equals(((C4261) r52).f15618) == false) goto L92;
    L48:
        if (r16.equals(((C4261) r52).f15623) == false) goto L92;
    L41:
        if (r15.equals(((C4261) r52).f15616) == false) goto L92;
    L34:
        if (r14.equals(((C4261) r52).f15615) == false) goto L92;
    L27:
        if (r13.equals(((C4261) r52).f15613) == false) goto L92;
    L20:
        if (r12.equals(((C4261) r52).f15620) == false) goto L92;
    L13:
        if (r1.equals(((C4261) r52).f15621) == true) goto L14;
    L92:
        return false;
    }

    public final int hashCode() {
        int r0 = 0;
        Integer r1 = this.f15621;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = (r12 ^ 1000003) * 1000003;
        String r3 = this.f15620;
        if (r3 != null) goto L9;
        int r32 = 0;
    L10:
        int r14 = (r13 ^ r32) * 1000003;
        String r33 = this.f15613;
        if (r33 != null) goto L13;
        int r34 = 0;
    L14:
        int r15 = (r14 ^ r34) * 1000003;
        String r35 = this.f15615;
        if (r35 != null) goto L17;
        int r36 = 0;
    L18:
        int r16 = (r15 ^ r36) * 1000003;
        String r37 = this.f15616;
        if (r37 != null) goto L21;
        int r38 = 0;
    L22:
        int r17 = (r16 ^ r38) * 1000003;
        String r39 = this.f15623;
        if (r39 != null) goto L25;
        int r310 = 0;
    L26:
        int r18 = (r17 ^ r310) * 1000003;
        String r311 = this.f15618;
        if (r311 != null) goto L29;
        int r312 = 0;
    L30:
        int r19 = (r18 ^ r312) * 1000003;
        String r313 = this.f15619;
        if (r313 != null) goto L33;
        int r314 = 0;
    L34:
        int r110 = (r19 ^ r314) * 1000003;
        String r315 = this.f15612;
        if (r315 != null) goto L37;
        int r316 = 0;
    L38:
        int r111 = (r110 ^ r316) * 1000003;
        String r317 = this.f15614;
        if (r317 != null) goto L41;
        int r318 = 0;
    L42:
        int r112 = (r111 ^ r318) * 1000003;
        String r319 = this.f15617;
        if (r319 != null) goto L45;
        int r320 = 0;
    L46:
        int r113 = (r112 ^ r320) * 1000003;
        String r2 = this.f15622;
        if (r2 == null) goto L51;
        r0 = r2.hashCode();
    L51:
        return r0 ^ r113;
    L45:
        r320 = r319.hashCode();
        goto L46
    L41:
        r318 = r317.hashCode();
        goto L42
    L37:
        r316 = r315.hashCode();
        goto L38
    L33:
        r314 = r313.hashCode();
        goto L34
    L29:
        r312 = r311.hashCode();
        goto L30
    L25:
        r310 = r39.hashCode();
        goto L26
    L21:
        r38 = r37.hashCode();
        goto L22
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
        StringBuilder r0 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        r0.append(this.f15621);
        r0.append(", model=");
        r0.append(this.f15620);
        r0.append(", hardware=");
        r0.append(this.f15613);
        r0.append(", device=");
        r0.append(this.f15615);
        r0.append(", product=");
        r0.append(this.f15616);
        r0.append(", osBuild=");
        r0.append(this.f15623);
        r0.append(", manufacturer=");
        r0.append(this.f15618);
        r0.append(", fingerprint=");
        r0.append(this.f15619);
        r0.append(", locale=");
        r0.append(this.f15612);
        r0.append(", country=");
        r0.append(this.f15614);
        r0.append(", mccMnc=");
        r0.append(this.f15617);
        r0.append(", applicationBuild=");
        return AbstractC1703.m4486(r0, this.f15622, "}");
    }
}
