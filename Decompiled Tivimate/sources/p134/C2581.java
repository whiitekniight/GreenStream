package p134;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ᴵᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C2581 extends AbstractC2582 {

    /* JADX INFO: renamed from: ʽ */
    public final String f9154;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9155;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f9156;

    public C2581(String r1, String r2, String r3) {
        this.f9156 = r1;
        this.f9155 = r2;
        this.f9154 = r3;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AbstractC2582) == false) goto L14;
        C2581 r52 = (C2581) ((AbstractC2582) r5);
        String r1 = r52.f9156;
        if (this.f9156.equals(r1) == false) goto L14;
        if (this.f9155.equals(r52.f9155) == false) goto L14;
        if (this.f9154.equals(r52.f9154) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return ((((this.f9156.hashCode() ^ 1000003) * 1000003) ^ this.f9155.hashCode()) * 1000003) ^ this.f9154.hashCode();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("BuildIdMappingForArch{arch=");
        r0.append(this.f9156);
        r0.append(", libraryName=");
        r0.append(this.f9155);
        r0.append(", buildId=");
        return AbstractC1703.m4486(r0, this.f9154, "}");
    }
}
