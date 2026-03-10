package p074;

import p149.AbstractC2788;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ʾˈ.ᴵᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C2059 {

    /* JADX INFO: renamed from: ʽ */
    public final int f7104;

    /* JADX INFO: renamed from: ˈ */
    public final boolean f7105;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f7106;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f7107;

    public C2059(int r1, int r2, String r3, boolean r4) {
        this.f7107 = r3;
        this.f7106 = r1;
        this.f7104 = r2;
        this.f7105 = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2059) == true) goto L8;
        return false;
    L8:
        C2059 r52 = (C2059) r5;
        if (AbstractC2927.m6273(this.f7107, r52.f7107) == true) goto L12;
        return false;
    L12:
        if (this.f7106 == r52.f7106) goto L15;
        return false;
    L15:
        if (this.f7104 == r52.f7104) goto L18;
        return false;
    L18:
        if (this.f7105 == r52.f7105) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r0 = ((((this.f7107.hashCode() * 31) + this.f7106) * 31) + this.f7104) * 31;
        if (this.f7105 == false) goto L5;
        int r1 = 1231;
    L7:
        return r0 + r1;
    L5:
        r1 = 1237;
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ProcessDetails(processName=");
        r0.append(this.f7107);
        r0.append(", pid=");
        r0.append(this.f7106);
        r0.append(", importance=");
        r0.append(this.f7104);
        r0.append(", isDefaultProcess=");
        return AbstractC2788.m6088(r0, this.f7105, ')');
    }
}
