package p107;

/* JADX INFO: renamed from: ˆʽ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2360 extends AbstractC2369 {

    /* JADX INFO: renamed from: ʾˋ */
    public final char f8458;

    public C2360(char r1) {
        this.f8458 = r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("CharMatcher.is('");
        char[] r1 = new char[6];
        int r3 = 0;
        r1[0] = '\\';
        r1[1] = 'u';
        r1[2] = 0;
        r1[3] = 0;
        r1[4] = 0;
        r1[5] = 0;
        char r4 = this.f8458;
    L3:
        if (r3 >= 4) goto L5;
        r1[5 - r3] = "0123456789ABCDEF".charAt(r4 & 15);
        r4 = (char) (r4 >> 4);
        r3 = r3 + 1;
        goto L3
    L5:
        r0.append(String.copyValueOf(r1));
        r0.append("')");
        return r0.toString();
    }

    @Override // p107.AbstractC2369
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo5525(char r2) {
        if (r2 != this.f8458) goto L6;
        return true;
    L6:
        return false;
    }
}
