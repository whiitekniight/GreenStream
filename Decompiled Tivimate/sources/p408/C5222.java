package p408;

import p149.AbstractC2788;

/* JADX INFO: renamed from: ⁱᵎ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C5222 {

    /* JADX INFO: renamed from: ʽ */
    public final boolean f18831;

    /* JADX INFO: renamed from: ˈ */
    public final boolean f18832;

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean f18833;

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean f18834;

    public C5222(boolean r1, boolean r2, boolean r3, boolean r4) {
        this.f18834 = r1;
        this.f18833 = r2;
        this.f18831 = r3;
        this.f18832 = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C5222) == true) goto L8;
        return false;
    L8:
        C5222 r52 = (C5222) r5;
        if (this.f18834 == r52.f18834) goto L12;
        return false;
    L12:
        if (this.f18833 == r52.f18833) goto L15;
        return false;
    L15:
        if (this.f18831 == r52.f18831) goto L18;
        return false;
    L18:
        if (this.f18832 == r52.f18832) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r1 = 1237;
        if (this.f18834 == false) goto L5;
        int r0 = 1231;
    L6:
        int r02 = r0 * 31;
        if (this.f18833 == false) goto L9;
        int r3 = 1231;
    L10:
        int r03 = (r02 + r3) * 31;
        if (this.f18831 == false) goto L13;
        int r32 = 1231;
    L14:
        int r04 = (r03 + r32) * 31;
        if (this.f18832 == false) goto L18;
        r1 = 1231;
    L18:
        return r04 + r1;
    L13:
        r32 = 1237;
        goto L14
    L9:
        r3 = 1237;
        goto L10
    L5:
        r0 = 1237;
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("NetworkState(isConnected=");
        r0.append(this.f18834);
        r0.append(", isValidated=");
        r0.append(this.f18833);
        r0.append(", isMetered=");
        r0.append(this.f18831);
        r0.append(", isNotRoaming=");
        return AbstractC2788.m6088(r0, this.f18832, ')');
    }
}
