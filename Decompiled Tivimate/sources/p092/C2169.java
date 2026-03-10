package p092;

/* JADX INFO: renamed from: ʿʾ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2169 implements Appendable {

    /* JADX INFO: renamed from: ʾˋ */
    public final Appendable f7790;

    /* JADX INFO: renamed from: ᴵˊ */
    public boolean f7791;

    public C2169(Appendable r2) {
        this.f7791 = true;
        this.f7790 = r2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char r4) {
        boolean r0 = this.f7791;
        Appendable r1 = this.f7790;
        boolean r2 = false;
        if (r0 == false) goto L6;
        this.f7791 = false;
        r1.append("  ");
    L6:
        if (r4 != '\n') goto L8;
        r2 = true;
    L8:
        this.f7791 = r2;
        r1.append(r4);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence r3) {
        if (r3 != null) goto L4;
        r3 = "";
    L4:
        append(r3, 0, r3.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence r5, int r6, int r7) {
        if (r5 != null) goto L4;
        r5 = "";
    L4:
        boolean r0 = this.f7791;
        Appendable r1 = this.f7790;
        boolean r2 = false;
        if (r0 == false) goto L8;
        this.f7791 = false;
        r1.append("  ");
    L8:
        if (r5.length() > 0) goto L10;
    L12:
        this.f7791 = r2;
        r1.append(r5, r6, r7);
        return this;
    L10:
        if (r5.charAt(r7 - 1) != '\n') goto L12;
        r2 = true;
        goto L12
    }
}
