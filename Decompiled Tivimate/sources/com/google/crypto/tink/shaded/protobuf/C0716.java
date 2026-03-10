package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ˉٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C0716 extends LinkedHashMap {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C0716 f3015 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f3016;

    static {
        C0716 r0 = new C0716();
        f3015 = r0;
        r0.f3016 = false;
    }

    public C0716() {
        this.f3016 = true;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m2585(Object r4) {
        if ((r4 instanceof byte[]) == false) goto L12;
        byte[] r42 = (byte[]) r4;
        int r0 = r42.length;
        Charset r1 = AbstractC0703.f2992;
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
        if ((r4 instanceof InterfaceC0696) == true) goto L16;
        return r4.hashCode();
    L16:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m2587();
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
    public final boolean equals(Object r7) {
        if ((r7 instanceof Map) == false) goto L26;
        Map r72 = (Map) r7;
        if (this != r72) goto L8;
    L6:
        boolean r73 = true;
    L24:
        if (r73 == false) goto L26;
        return true;
    L8:
        if (size() == r72.size()) goto L10;
    L9:
        r73 = false;
        goto L24
    L10:
        Iterator r2 = entrySet().iterator();
    L12:
        if (r2.hasNext() == false) goto L6;
        Map.Entry r3 = (Map.Entry) r2.next();
        if (r72.containsKey(r3.getKey()) == false) goto L9;
        Object r4 = r3.getValue();
        Object r32 = r72.get(r3.getKey());
        if ((r4 instanceof byte[]) == true) goto L19;
    L21:
        boolean r33 = r4.equals(r32);
    L22:
        if (r33 == true) goto L12;
    L19:
        if ((r32 instanceof byte[]) == false) goto L21;
        r33 = Arrays.equals((byte[]) r4, (byte[]) r32);
    L26:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator r0 = entrySet().iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L6;
        Map.Entry r2 = (Map.Entry) r0.next();
        int r3 = m2585(r2.getKey());
        r1 = r1 + (m2585(r2.getValue()) ^ r3);
        goto L4
    L6:
        return r1;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object r2, Object r3) {
        m2587();
        Charset r0 = AbstractC0703.f2992;
        r2.getClass();
        r3.getClass();
        return super.put(r2, r3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map r4) {
        m2587();
        Iterator r0 = r4.keySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Object r1 = r0.next();
        Charset r2 = AbstractC0703.f2992;
        r1.getClass();
        r4.get(r1).getClass();
        goto L4
    L6:
        super.putAll(r4);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object r1) {
        m2587();
        return super.remove(r1);
    }

    /* JADX INFO: renamed from: ˈ */
    public final C0716 m2586() {
        if (isEmpty() == true) goto L5;
        C0716 r0 = new C0716(this);
        r0.f3016 = true;
        return r0;
    L5:
        return new C0716();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m2587() {
        if (this.f3016 == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }
}
