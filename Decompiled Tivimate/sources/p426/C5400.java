package p426;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ﹳי.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5400 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f19282;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f19283;

    public C5400(String r1, String r2) {
        this.f19283 = r1;
        if (r2 == null) goto L7;
        this.f19282 = r2;
        return;
    L7:
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C5400) == false) goto L12;
        C5400 r52 = (C5400) r5;
        if (this.f19283.equals(r52.f19283) == false) goto L12;
        if (this.f19282.equals(r52.f19282) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        return ((this.f19283.hashCode() ^ 1000003) * 1000003) ^ this.f19282.hashCode();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("LibraryVersion{libraryName=");
        r0.append(this.f19283);
        r0.append(", version=");
        return AbstractC1703.m4486(r0, this.f19282, "}");
    }
}
