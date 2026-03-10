package p191;

/* JADX INFO: renamed from: ˋˋ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3226 {

    /* JADX INFO: renamed from: ʽ */
    public Object f11406;

    /* JADX INFO: renamed from: ˈ */
    public int f11407;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f11408;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f11409;

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
    L35:
        return true;
    L6:
        if ((r4 instanceof C3226) == false) goto L36;
        C3226 r42 = (C3226) r4;
        int r1 = this.f11409;
        if (r1 == r42.f11409) goto L12;
        return false;
    L12:
        if (r1 != 8) goto L21;
        if (Math.abs(this.f11407 - this.f11408) != 1) goto L21;
        if (this.f11407 != r42.f11408) goto L21;
        if (this.f11408 == r42.f11407) goto L35;
    L21:
        if (this.f11407 == r42.f11407) goto L24;
        return false;
    L24:
        if (this.f11408 != r42.f11408) goto L39;
        Object r12 = this.f11406;
        if (r12 == null) goto L32;
        if (r12.equals(r42.f11406) == true) goto L35;
        return false;
    L32:
        if (r42.f11406 == null) goto L35;
        return false;
    L39:
        return false;
    L36:
        return false;
    }

    public final int hashCode() {
        return (((this.f11409 * 31) + this.f11408) * 31) + this.f11407;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("[");
        int r1 = this.f11409;
        if (r1 != 1) goto L5;
        String r12 = "add";
    L15:
        r0.append(r12);
        r0.append(",s:");
        r0.append(this.f11408);
        r0.append("c:");
        r0.append(this.f11407);
        r0.append(",p:");
        r0.append(this.f11406);
        r0.append("]");
        return r0.toString();
    L5:
        if (r1 != 2) goto L7;
        r12 = "rm";
        goto L15
    L7:
        if (r1 != 4) goto L9;
        r12 = "up";
        goto L15
    L9:
        if (r1 == 8) goto L11;
        r12 = "??";
        goto L15
    L11:
        r12 = "mv";
        goto L15
    }
}
