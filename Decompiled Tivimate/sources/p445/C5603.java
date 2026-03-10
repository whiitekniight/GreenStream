package p445;

import android.text.TextUtils;

/* JADX INFO: renamed from: ﹶˎ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C5603 {

    /* JADX INFO: renamed from: ʽ */
    public final String f20186;

    /* JADX INFO: renamed from: ˈ */
    public final String f20187;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f20188;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f20189;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f20190;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final String f20191;

    public C5603(int r1, int r2, String r3, String r4, String r5, String r6) {
        this.f20190 = r1;
        this.f20189 = r2;
        this.f20186 = r3;
        this.f20187 = r4;
        this.f20188 = r5;
        this.f20191 = r6;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (C5603.class != r5.getClass()) goto L23;
        C5603 r52 = (C5603) r5;
        if (this.f20190 != r52.f20190) goto L23;
        if (this.f20189 != r52.f20189) goto L23;
        if (TextUtils.equals(this.f20186, r52.f20186) == false) goto L23;
        if (TextUtils.equals(this.f20187, r52.f20187) == false) goto L23;
        if (TextUtils.equals(this.f20188, r52.f20188) == false) goto L23;
        if (TextUtils.equals(this.f20191, r52.f20191) == false) goto L23;
        return true;
    }

    public final int hashCode() {
        int r0 = ((this.f20190 * 31) + this.f20189) * 31;
        int r1 = 0;
        String r2 = this.f20186;
        if (r2 == null) goto L5;
        int r22 = r2.hashCode();
    L6:
        int r02 = (r0 + r22) * 31;
        String r23 = this.f20187;
        if (r23 == null) goto L9;
        int r24 = r23.hashCode();
    L10:
        int r03 = (r02 + r24) * 31;
        String r25 = this.f20188;
        if (r25 == null) goto L13;
        int r26 = r25.hashCode();
    L14:
        int r04 = (r03 + r26) * 31;
        String r27 = this.f20191;
        if (r27 == null) goto L18;
        r1 = r27.hashCode();
    L18:
        return r04 + r1;
    L13:
        r26 = 0;
        goto L14
    L9:
        r24 = 0;
        goto L10
    L5:
        r22 = 0;
        goto L6
    }
}
