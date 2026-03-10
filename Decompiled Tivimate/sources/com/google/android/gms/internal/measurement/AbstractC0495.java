package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ﹳᴵ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0495 implements Cloneable {

    /* JADX INFO: renamed from: ʾˋ */
    public final AbstractC0269 f2272;

    /* JADX INFO: renamed from: ᴵˊ */
    public AbstractC0269 f2273;

    public AbstractC0495(AbstractC0269 r2) {
        this.f2272 = r2;
        if (r2.m1287() == true) goto L7;
        this.f2273 = (AbstractC0269) r2.mo1251(4);
        return;
    L7:
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m1999(int r3, List r4) {
        int r0 = r4.size() - r3;
        StringBuilder r2 = new StringBuilder(String.valueOf(r0).length() + 26);
        r2.append("Element at index ");
        r2.append(r0);
        r2.append(" is null.");
        String r02 = r2.toString();
        int r1 = r4.size();
    L3:
        r1 = r1 - 1;
        if (r1 < r3) goto L7;
        r4.remove(r1);
        goto L3
    L7:
        throw new NullPointerException(r02);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m2001();
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final void m2000(byte[] r9, int r10, C0343 r11) {
        if (this.f2273.m1287() == true) goto L16;
        AbstractC0269 r0 = (AbstractC0269) this.f2272.mo1251(4);
        AbstractC0269 r1 = this.f2273;
        C0464.f2233.m1946(r0.getClass()).mo1607(r0, r1);
        this.f2273 = r0;
    L16:
        InterfaceC0363 r2 = C0464.f2233.m1946(this.f2273.getClass());     // Catch: IOException -> L7 zzmr -> L9 IndexOutOfBoundsException -> L13
        AbstractC0269 r3 = this.f2273;     // Catch: IOException -> L7 zzmr -> L9 IndexOutOfBoundsException -> L13
        C0317 r7 = new C0317();     // Catch: IOException -> L7 zzmr -> L9 IndexOutOfBoundsException -> L13
        r11.getClass();     // Catch: IOException -> L7 zzmr -> L9 IndexOutOfBoundsException -> L13
        r2.mo1596(r3, r9, 0, r10, r7);     // Catch: IOException -> L7 zzmr -> L9 IndexOutOfBoundsException -> L13
        return;
    L9:
        e = move-exception;
        throw e;
    L7:
        e = move-exception;
        throw new RuntimeException("Reading from byte array should not throw IOException.", e);
    L14:
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: ˈ */
    public final AbstractC0495 m2001() {
        AbstractC0495 r0 = (AbstractC0495) this.f2272.mo1251(5);
        r0.f2273 = m2002();
        return r0;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final AbstractC0269 m2002() {
        if (this.f2273.m1287() == false) goto L5;
        this.f2273.m1289();
        return this.f2273;
    L5:
        return this.f2273;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final void m2003(AbstractC0269 r5) {
        AbstractC0269 r0 = this.f2272;
        if (r0.equals(r5) == false) goto L5;
        return;
    L5:
        if (this.f2273.m1287() == true) goto L7;
        AbstractC0269 r02 = (AbstractC0269) r0.mo1251(4);
        AbstractC0269 r1 = this.f2273;
        C0464.f2233.m1946(r02.getClass()).mo1607(r02, r1);
        this.f2273 = r02;
    L7:
        AbstractC0269 r03 = this.f2273;
        C0464.f2233.m1946(r03.getClass()).mo1607(r03, r5);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m2004() {
        if (this.f2273.m1287() == true) goto L6;
        AbstractC0269 r0 = (AbstractC0269) this.f2272.mo1251(4);
        AbstractC0269 r1 = this.f2273;
        C0464.f2233.m1946(r0.getClass()).mo1607(r0, r1);
        this.f2273 = r0;
        return;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final AbstractC0269 m2005() {
        AbstractC0269 r0 = m2002();
        r0.getClass();
        boolean r1 = true;
        byte r2 = ((Byte) r0.mo1251(1)).byteValue();
        if (r2 == 1) goto L8;
        if (r2 != 0) goto L7;
        r1 = false;
        goto L8
    L7:
        r1 = C0464.f2233.m1946(r0.getClass()).mo1586(r0);
        r0.mo1251(2);
    L8:
        if (r1 == false) goto L11;
        return r0;
    L11:
        throw new zzoh("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
