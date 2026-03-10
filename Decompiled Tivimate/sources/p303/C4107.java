package p303;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ٴᴵ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4107 {

    /* JADX INFO: renamed from: ʽ */
    public final int f15121;

    /* JADX INFO: renamed from: ˈ */
    public final int f15122;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f15123;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f15124;

    public C4107(int r1, int r2, String r3, String r4) {
        this.f15124 = r3;
        this.f15123 = r4;
        this.f15121 = r1;
        this.f15122 = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4107) == true) goto L8;
        return false;
    L8:
        C4107 r52 = (C4107) r5;
        if (this.f15121 == r52.f15121) goto L11;
    L17:
        return false;
    L11:
        if (this.f15122 != r52.f15122) goto L17;
        if (Objects.equals(this.f15124, r52.f15124) == false) goto L17;
        if (Objects.equals(this.f15123, r52.f15123) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f15124, this.f15123, Integer.valueOf(this.f15121), Integer.valueOf(this.f15122)});
    }
}
