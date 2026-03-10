package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import p005j$.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.יـ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0592 extends AbstractC0530 implements List, RandomAccess, p005j$.util.List {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C0628 f2409 = null;

    static {
        f2409 = new C0628(C0526.f2305, 0);
    }

    /* JADX INFO: renamed from: ʼˎ */
    public static C0526 m2243(int r1, Object[] r2) {
        if (r1 != 0) goto L6;
        return C0526.f2305;
    L6:
        return new C0526(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ˆʾ */
    public static AbstractC0592 m2244(List r1) {
        if ((r1 instanceof AbstractC0530) == false) goto L8;
        AbstractC0592 r12 = ((AbstractC0530) r1).mo2108();
        if (r12.mo2095() == false) goto L10;
        Object[] r13 = r12.toArray(AbstractC0530.f2311);
        return m2243(r13.length, r13);
    L10:
        return r12;
    L8:
        Object[] r14 = r1.toArray();
        int r0 = r14.length;
        ʼ.ᵎﹶ.ٴᵢ(r0, r14);
        return m2243(r0, r14);
    }

    @Override // java.util.List
    public final void add(int r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int r1, Collection r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r1) {
        if (indexOf(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
        return true;
    L5:
        if ((r6 instanceof List) == false) goto L36;
        List r62 = (List) r6;
        int r0 = size();
        if (r0 != r62.size()) goto L36;
        if ((r62 instanceof RandomAccess) == false) goto L20;
        int r2 = 0;
    L13:
        if (r2 >= r0) goto L51;
        Object r3 = get(r2);
        Object r4 = r62.get(r2);
        if (r3 == r4) goto L19;
        if (r3 == null) goto L36;
        if (r3.equals(r4) == false) goto L36;
    L19:
        r2 = r2 + 1;
        goto L13
    L51:
        return true;
    L20:
        C0628 r02 = m2245(0);
        Iterator r63 = r62.iterator();
    L22:
        if (r02.hasNext() == false) goto L33;
        if (r63.hasNext() == false) goto L36;
        Object r22 = r02.next();
        Object r32 = r63.next();
        if (r22 == r32) goto L22;
        if (r22 == null) goto L36;
        if (r22.equals(r32) == false) goto L36;
    L33:
        if (r63.hasNext() == true) goto L36;
        return true;
    L36:
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = size();
        int r1 = 0;
        int r2 = 1;
    L3:
        if (r1 >= r0) goto L5;
        r2 = (r2 * 31) + get(r1).hashCode();
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // java.util.List
    public final int indexOf(Object r5) {
        if (r5 != null) goto L5;
        return -1;
    L5:
        int r1 = size();
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L11;
        if (r5.equals(get(r2)) == true) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r2;
    L11:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return m2245(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r4) {
        if (r4 != null) goto L5;
        return -1;
    L5:
        int r1 = size() - 1;
    L6:
        if (r1 < 0) goto L11;
        if (r4.equals(get(r1)) == true) goto L9;
        r1 = r1 - 1;
        goto L6
    L9:
        return r1;
    L11:
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return m2245(0);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int r1) {
        return m2245(r1);
    }

    @Override // java.util.List
    public final Object remove(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p005j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator r1) {
        List.CC.$default$replaceAll(this, r1);
    }

    @Override // java.util.List
    public final Object set(int r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p005j$.util.List
    public /* synthetic */ void sort(Comparator r1) {
        List.CC.$default$sort(this, r1);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
        return mo2246(r1, r2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0530
    /* JADX INFO: renamed from: ˑﹳ */
    public final AbstractC0592 mo2108() {
        return this;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final C0628 m2245(int r2) {
        com.bumptech.glide.ˈ.ˆﾞ(r2, size());
        if (isEmpty() == false) goto L7;
        return f2409;
    L7:
        return new C0628(this, r2);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public AbstractC0592 mo2246(int r2, int r3) {
        com.bumptech.glide.ˈ.ᵔٴ(r2, r3, size());
        int r32 = r3 - r2;
        if (r32 != size()) goto L5;
        return this;
    L5:
        if (r32 != 0) goto L9;
        return C0526.f2305;
    L9:
        return new C0640(this, r2, r32);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0530
    /* JADX INFO: renamed from: ﹳٴ */
    public int mo2094(Object[] r4) {
        int r0 = size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r4[r1] = get(r1);
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }
}
