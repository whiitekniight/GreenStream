package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ˊʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C0028 extends LinkedHashMap {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C0028 f414 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f415;

    static {
        C0028 r0 = new C0028();
        f414 = r0;
        r0.f415 = false;
    }

    public C0028() {
        this.f415 = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m236();
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
        int r2 = 0;
    L4:
        if (r0.hasNext() == false) goto L23;
        Map.Entry r3 = (Map.Entry) r0.next();
        Object r4 = r3.getKey();
        int r6 = 1;
        if ((r4 instanceof byte[]) == false) goto L12;
        byte[] r42 = (byte[]) r4;
        int r5 = r42.length;
        Charset r7 = AbstractC0014.f389;
        int r72 = 0;
        int r8 = r5;
    L8:
        if (r72 >= r5) goto L10;
        r8 = (r8 * 31) + r42[r72];
        r72 = r72 + 1;
        goto L8
    L10:
        if (r8 != 0) goto L13;
        r8 = 1;
    L13:
        Object r32 = r3.getValue();
        if ((r32 instanceof byte[]) == false) goto L21;
        byte[] r33 = (byte[]) r32;
        int r43 = r33.length;
        Charset r52 = AbstractC0014.f389;
        int r53 = 0;
        int r73 = r43;
    L16:
        if (r53 >= r43) goto L18;
        r73 = (r73 * 31) + r33[r53];
        r53 = r53 + 1;
        goto L16
    L18:
        if (r73 == 0) goto L22;
        r6 = r73;
    L22:
        r2 = r2 + (r8 ^ r6);
        goto L4
    L21:
        r6 = r32.hashCode();
        goto L22
    L12:
        r8 = r4.hashCode();
        goto L13
    L23:
        return r2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object r2, Object r3) {
        m236();
        Charset r0 = AbstractC0014.f389;
        r2.getClass();
        r3.getClass();
        return super.put(r2, r3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map r4) {
        m236();
        Iterator r0 = r4.keySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Object r1 = r0.next();
        Charset r2 = AbstractC0014.f389;
        r1.getClass();
        r4.get(r1).getClass();
        goto L4
    L6:
        super.putAll(r4);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object r1) {
        m236();
        return super.remove(r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C0028 m235() {
        if (isEmpty() == true) goto L5;
        C0028 r0 = new C0028(this);
        r0.f415 = true;
        return r0;
    L5:
        return new C0028();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m236() {
        if (this.f415 == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }
}
