package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C0628 implements ListIterator, Iterator {

    /* JADX INFO: renamed from: ʽʽ */
    public final AbstractC0592 f2478;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f2479;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f2480;

    public C0628(AbstractC0592 r2, int r3) {
        int r0 = r2.size();
        com.bumptech.glide.ˈ.ˆﾞ(r3, r0);
        this.f2479 = r0;
        this.f2480 = r3;
        this.f2478 = r2;
    }

    @Override // java.util.ListIterator
    public final void add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f2480 >= this.f2479) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f2480 <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        int r0 = this.f2480;
        this.f2480 = r0 + 1;
        return m2300(r0);
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2480;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious() == false) goto L7;
        int r0 = this.f2480 - 1;
        this.f2480 = r0;
        return m2300(r0);
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2480 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object r1) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object m2300(int r2) {
        return this.f2478.get(r2);
    }
}
