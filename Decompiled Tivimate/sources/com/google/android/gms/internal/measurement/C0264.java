package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C0264 implements Iterator {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ Object f1775;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f1776;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f1777;

    public /* synthetic */ C0264(int r1, Object r2) {
        this.f1776 = r1;
        this.f1775 = r2;
        this.f1777 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.f1776) {
            case 0: goto L14;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        C0316 r0 = (C0316) this.f1775;
        if (this.f1777 >= r0.m1611()) goto L7;
        return true;
    L7:
        return false;
    L9:
        String r02 = ((C0467) this.f1775).f2238;
        if (this.f1777 >= r02.length()) goto L12;
        return true;
    L12:
        return false;
    L14:
        String r03 = ((C0467) this.f1775).f2238;
        if (this.f1777 >= r03.length()) goto L17;
        return true;
    L17:
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch(this.f1776) {
            case 0: goto L16;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        C0316 r0 = (C0316) this.f1775;
        if (this.f1777 >= r0.m1611()) goto L8;
        int r1 = this.f1777;
        this.f1777 = r1 + 1;
        return r0.m1616(r1);
    L8:
        int r12 = this.f1777;
        StringBuilder r3 = new StringBuilder(String.valueOf(r12).length() + 21);
        r3.append("Out of bounds index: ");
        r3.append(r12);
        throw new NoSuchElementException(r3.toString());
    L10:
        C0467 r02 = (C0467) this.f1775;
        String r13 = r02.f2238;
        int r2 = this.f1777;
        if (r2 >= r13.length()) goto L15;
        this.f1777 = r2 + 1;
        return new C0467(String.valueOf(r02.f2238.charAt(r2)));
    L15:
        throw new NoSuchElementException();
    L16:
        String r03 = ((C0467) this.f1775).f2238;
        int r14 = this.f1777;
        if (r14 >= r03.length()) goto L21;
        this.f1777 = r14 + 1;
        return new C0467(String.valueOf(r14));
    L21:
        throw new NoSuchElementException();
    }
}
