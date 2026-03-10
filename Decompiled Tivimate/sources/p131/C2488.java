package p131;

/* JADX INFO: renamed from: ˈʿ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2488 {

    /* JADX INFO: renamed from: ˑﹳ */
    public static final byte[] f8822 = null;

    /* JADX INFO: renamed from: ʽ */
    public int f8823;

    /* JADX INFO: renamed from: ˈ */
    public char f8824;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f8825;

    /* JADX INFO: renamed from: ﹳٴ */
    public final CharSequence f8826;

    static {
        f8822 = new byte[1792];
        int r1 = 0;
    L3:
        if (r1 >= 1792) goto L5;
        f8822[r1] = Character.getDirectionality(r1);
        r1 = r1 + 1;
        goto L3
    }

    public C2488(CharSequence r1) {
        this.f8826 = r1;
        this.f8825 = r1.length();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final byte m5694() {
        int r0 = this.f8823 - 1;
        CharSequence r1 = this.f8826;
        char r02 = r1.charAt(r0);
        this.f8824 = r02;
        if (Character.isLowSurrogate(r02) == false) goto L6;
        int r03 = Character.codePointBefore(r1, this.f8823);
        this.f8823 -= Character.charCount(r03);
        return Character.getDirectionality(r03);
    L6:
        this.f8823--;
        char r04 = this.f8824;
        if (r04 >= '\u0700') goto L10;
        return f8822[r04];
    L10:
        return Character.getDirectionality(r04);
    }
}
