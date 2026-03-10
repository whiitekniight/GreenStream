package p432;

import p029.AbstractC1476;
import p029.C1439;
import p067.C1957;
import p317.AbstractC4195;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ﹳᵢ.ʻᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5419 {

    /* JADX INFO: renamed from: ˈ */
    public static final C5419 f19326 = null;

    /* JADX INFO: renamed from: ʽ */
    public int f19327;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C1439 f19328;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f19329;

    static {
        f19326 = new C5419(new C1957[0]);
        AbstractC4195.m8513(0);
    }

    public C5419(C1957... r7) {
        C1439 r0 = AbstractC1476.m3978(r7);
        this.f19328 = r0;
        this.f19329 = r7.length;
        int r72 = 0;
    L4:
        if (r72 >= r0.f4845) goto L13;
        int r1 = r72 + 1;
        int r2 = r1;
    L7:
        if (r2 >= r0.f4845) goto L12;
        if (((C1957) r0.get(r72)).equals(r0.get(r2)) == false) goto L11;
        AbstractC4214.m8574("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
    L11:
        r2 = r2 + 1;
        goto L7
    L12:
        r72 = r1;
        goto L4
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L16;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C5419.class != r3.getClass()) goto L19;
        C5419 r32 = (C5419) r3;
        if (this.f19329 == r32.f19329) goto L11;
        return false;
    L11:
        if (this.f19328.equals(r32.f19328) == false) goto L18;
        return true;
    L18:
        return false;
    L19:
        return false;
    L16:
        return true;
    }

    public final int hashCode() {
        if (this.f19327 != 0) goto L6;
        this.f19327 = this.f19328.hashCode();
    L6:
        return this.f19327;
    }

    public final String toString() {
        return this.f19328.toString();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m10455(C1957 r2) {
        int r22 = this.f19328.indexOf(r2);
        if (r22 < 0) goto L5;
        return r22;
    L5:
        return -1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C1957 m10456(int r2) {
        return (C1957) this.f19328.get(r2);
    }
}
