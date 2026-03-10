package p093;

import com.google.android.gms.internal.measurement.ˏʻ;
import java.util.Iterator;
import p398.InterfaceC5098;

/* JADX INFO: renamed from: ʿˈ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public class C2201 implements Iterable, InterfaceC5098 {

    /* JADX INFO: renamed from: ʽʽ */
    public final int f7961;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f7962;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f7963;

    public C2201(int r2, int r3, int r4) {
        if (r4 == 0) goto L11;
        if (r4 == Integer.MIN_VALUE) goto L9;
        this.f7962 = r2;
        this.f7963 = ˏʻ.ᵔﹳ(r2, r3, r4);
        this.f7961 = r4;
        return;
    L9:
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    L11:
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof C2201) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        C2201 r32 = (C2201) r3;
        int r0 = r32.f7962;
        if (this.f7962 == r0) goto L11;
        return false;
    L11:
        if (this.f7963 == r32.f7963) goto L13;
        return false;
    L13:
        if (this.f7961 != r32.f7961) goto L21;
        return true;
    L21:
        return false;
    L7:
        if (((C2201) r3).isEmpty() == false) goto L8;
        return true;
    }

    public int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (((this.f7962 * 31) + this.f7963) * 31) + this.f7961;
    }

    public boolean isEmpty() {
        int r0 = this.f7961;
        int r3 = this.f7963;
        int r4 = this.f7962;
        if (r0 <= 0) goto L7;
        if (r4 <= r3) goto L6;
        return true;
    L6:
        return false;
    L7:
        if (r4 >= r3) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int r1 = this.f7963;
        int r2 = this.f7961;
        return new C2200(this.f7962, r1, r2);
    }

    public String toString() {
        int r1 = this.f7963;
        int r2 = this.f7962;
        int r3 = this.f7961;
        if (r3 <= 0) goto L7;
        StringBuilder r4 = new StringBuilder();
        r4.append(r2);
        r4.append("..");
        r4.append(r1);
        r4.append(" step ");
        r4.append(r3);
    L6:
        return r4.toString();
    L7:
        r4 = new StringBuilder();
        r4.append(r2);
        r4.append(" downTo ");
        r4.append(r1);
        r4.append(" step ");
        r4.append(-r3);
        goto L6
    }
}
