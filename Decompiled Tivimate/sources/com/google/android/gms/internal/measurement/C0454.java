package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ᵎﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C0454 extends LinkedHashMap {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C0454 f2218 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f2219;

    static {
        C0454 r0 = new C0454();
        f2218 = r0;
        r0.f2219 = false;
    }

    public C0454() {
        this.f2219 = true;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int m1942(Object r4) {
        if ((r4 instanceof byte[]) == false) goto L12;
        byte[] r42 = (byte[]) r4;
        int r0 = r42.length;
        Charset r1 = AbstractC0405.f2148;
        int r12 = 0;
        int r2 = r0;
    L5:
        if (r12 >= r0) goto L7;
        r2 = (r2 * 31) + r42[r12];
        r12 = r12 + 1;
        goto L5
    L7:
        if (r2 != 0) goto L10;
        return 1;
    L10:
        return r2;
    L12:
        if ((r4 instanceof InterfaceC0361) == true) goto L16;
        return r4.hashCode();
    L16:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m1943();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty() == false) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object r5) {
        if ((r5 instanceof Map) == false) goto L25;
        Map r52 = (Map) r5;
        if (this != r52) goto L8;
        return true;
    L8:
        if (size() != r52.size()) goto L34;
        Iterator r0 = entrySet().iterator();
    L12:
        if (r0.hasNext() == false) goto L33;
        Map.Entry r1 = (Map.Entry) r0.next();
        if (r52.containsKey(r1.getKey()) == false) goto L36;
        Object r2 = r1.getValue();
        Object r12 = r52.get(r1.getKey());
        if ((r2 instanceof byte[]) == true) goto L18;
    L20:
        boolean r13 = r2.equals(r12);
    L21:
        if (r13 == true) goto L12;
        return false;
    L18:
        if ((r12 instanceof byte[]) == false) goto L20;
        r13 = Arrays.equals((byte[]) r2, (byte[]) r12);
        goto L21
    L36:
        return false;
    L33:
        return true;
    L34:
        return false;
    L25:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator r0 = entrySet().iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L6;
        Map.Entry r2 = (Map.Entry) r0.next();
        int r3 = m1942(r2.getKey());
        r1 = r1 + (m1942(r2.getValue()) ^ r3);
        goto L4
    L6:
        return r1;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object r2, Object r3) {
        m1943();
        Charset r0 = AbstractC0405.f2148;
        r2.getClass();
        r3.getClass();
        return super.put(r2, r3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map r4) {
        m1943();
        Iterator r0 = r4.keySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Object r1 = r0.next();
        Charset r2 = AbstractC0405.f2148;
        r1.getClass();
        r4.get(r1).getClass();
        goto L4
    L6:
        super.putAll(r4);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object r1) {
        m1943();
        return super.remove(r1);
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m1943() {
        if (this.f2219 == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C0454 m1944() {
        if (isEmpty() == true) goto L5;
        C0454 r0 = new C0454(this);
        r0.f2219 = true;
        return r0;
    L5:
        return new C0454();
    }
}
