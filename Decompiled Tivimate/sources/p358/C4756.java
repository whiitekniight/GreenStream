package p358;

import com.google.android.gms.internal.play_billing.י;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import ˈˊ.ˉˆ;

/* JADX INFO: renamed from: ᵎᐧ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4756 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: ʽʽ */
    public final int f16789;

    /* JADX INFO: renamed from: ʾˋ */
    public final int[] f16790;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f16791;

    public C4756(int[] r1, int r2, int r3) {
        this.f16790 = r1;
        this.f16791 = r2;
        this.f16789 = r3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r4) {
        if ((r4 instanceof Integer) == false) goto L8;
        int r42 = ((Integer) r4).intValue();
        int r0 = this.f16791;
        int r1 = this.f16789;
        if (ˉˆ.ʽﹳ(this.f16790, r42, r0, r1) == (-1)) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof C4756) == false) goto L18;
        C4756 r82 = (C4756) r8;
        int r1 = size();
        if (r82.size() == r1) goto L10;
        return false;
    L10:
        int r2 = 0;
    L11:
        if (r2 >= r1) goto L16;
        if (this.f16790[this.f16791 + r2] != r82.f16790[r82.f16791 + r2]) goto L14;
        r2 = r2 + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    L18:
        return super.equals(r8);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r2) {
        י.ᵎﹶ(r2, size());
        int r0 = this.f16791 + r2;
        return Integer.valueOf(this.f16790[r0]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = 1;
        int r1 = this.f16791;
    L4:
        if (r1 >= this.f16789) goto L6;
        r0 = (r0 * 31) + this.f16790[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r4) {
        if ((r4 instanceof Integer) == false) goto L8;
        int r42 = ((Integer) r4).intValue();
        int r0 = this.f16789;
        int[] r1 = this.f16790;
        int r2 = this.f16791;
        int r43 = ˉˆ.ʽﹳ(r1, r42, r2, r0);
        if (r43 >= 0) goto L7;
        return -1;
    L7:
        return r43 - r2;
    L8:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r5) {
        if ((r5 instanceof Integer) == false) goto L15;
        int r52 = ((Integer) r5).intValue();
        int r0 = this.f16789;
    L5:
        r0 = r0 - 1;
        int r2 = this.f16791;
        if (r0 < r2) goto L11;
        if (this.f16790[r0] != r52) goto L5;
    L12:
        if (r0 < 0) goto L15;
        return r0 - r2;
    L11:
        r0 = -1;
    L15:
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r3, Object r4) {
        Integer r42 = (Integer) r4;
        י.ᵎﹶ(r3, size());
        int r0 = this.f16791 + r3;
        int[] r32 = this.f16790;
        int r1 = r32[r0];
        r42.getClass();
        r32[r0] = r42.intValue();
        return Integer.valueOf(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16789 - this.f16791;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int r3, int r4) {
        י.ˆʾ(r3, r4, size());
        if (r3 == r4) goto L5;
        int r1 = this.f16791;
        int r32 = r3 + r1;
        int r12 = r1 + r4;
        return new C4756(this.f16790, r32, r12);
    L5:
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder r0 = new StringBuilder(size() * 5);
        r0.append('[');
        int[] r1 = this.f16790;
        int r2 = this.f16791;
        r0.append(r1[r2]);
    L3:
        r2 = r2 + 1;
        if (r2 >= this.f16789) goto L6;
        r0.append(", ");
        r0.append(r1[r2]);
        goto L3
    L6:
        r0.append(']');
        return r0.toString();
    }
}
