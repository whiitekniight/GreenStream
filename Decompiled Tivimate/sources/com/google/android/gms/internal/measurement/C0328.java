package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0026;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ˉʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C0328 extends AbstractMap {

    /* JADX INFO: renamed from: ʽʽ */
    public Map f1985;

    /* JADX INFO: renamed from: ʾˋ */
    public Object[] f1986;

    /* JADX INFO: renamed from: ˈٴ */
    public boolean f1987;

    /* JADX INFO: renamed from: ˊʻ */
    public Map f1988;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f1989;

    /* JADX INFO: renamed from: ᴵᵔ */
    public volatile C0026 f1990;

    public C0328() {
        Map r0 = Collections.EMPTY_MAP;
        this.f1985 = r0;
        this.f1988 = r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m1636();
        if (this.f1989 == 0) goto L6;
        this.f1986 = null;
        this.f1989 = 0;
    L6:
        if (this.f1985.isEmpty() == true) goto L9;
        this.f1985.clear();
        return;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object r2) {
        Comparable r22 = (Comparable) r2;
        if (m1632(r22) < 0) goto L5;
        return true;
    L5:
        if (this.f1985.containsKey(r22) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1990 != null) goto L6;
        this.f1990 = new C0026(this, 1);
    L6:
        return this.f1990;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object r7) {
        if (this != r7) goto L5;
        return true;
    L5:
        if ((r7 instanceof C0328) == false) goto L7;
        C0328 r72 = (C0328) r7;
        int r0 = size();
        if (r0 != r72.size()) goto L25;
        int r1 = this.f1989;
        if (r1 != r72.f1989) goto L24;
        int r3 = 0;
    L13:
        if (r3 >= r1) goto L18;
        if (m1635(r3).equals(r72.m1635(r3)) == false) goto L25;
        r3 = r3 + 1;
        goto L13
    L18:
        if (r1 != r0) goto L20;
        return true;
    L20:
        return this.f1985.equals(r72.f1985);
    L24:
        return entrySet().equals(r72.entrySet());
    L25:
        return false;
    L7:
        return super.equals(r7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object r2) {
        Comparable r22 = (Comparable) r2;
        int r0 = m1632(r22);
        if (r0 < 0) goto L7;
        return ((C0285) this.f1986[r0]).f1888;
    L7:
        return this.f1985.get(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int r0 = this.f1989;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L6;
        r2 = r2 + this.f1986[r1].hashCode();
        r1 = r1 + 1;
        goto L3
    L6:
        if (this.f1985.size() > 0) goto L8;
        return r2;
    L8:
        return this.f1985.hashCode() + r2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object r1, Object r2) {
        return m1630((Comparable) r1, r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object r2) {
        m1636();
        Comparable r22 = (Comparable) r2;
        int r0 = m1632(r22);
        if (r0 < 0) goto L7;
        return m1631(r0);
    L7:
        if (this.f1985.isEmpty() == false) goto L11;
        return null;
    L11:
        return this.f1985.remove(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        int r0 = this.f1989;
        return this.f1985.size() + r0;
    }

    /* JADX INFO: renamed from: ʽ */
    public final Object m1630(Comparable r5, Object r6) {
        m1636();
        int r0 = m1632(r5);
        if (r0 >= 0) goto L5;
        m1636();
        if (this.f1986 != null) goto L9;
        this.f1986 = new Object[16];
    L9:
        int r02 = -(r0 + 1);
        if (r02 < 16) goto L14;
        return m1633().put(r5, r6);
    L14:
        if (this.f1989 != 16) goto L16;
        C0285 r1 = (C0285) this.f1986[15];
        this.f1989 = 15;
        m1633().put(r1.f1887, r1.f1888);
    L16:
        Object[] r12 = this.f1986;
        int r3 = r12.length;
        System.arraycopy(r12, r02, r12, r02 + 1, 15 - r02);
        this.f1986[r02] = new C0285(this, r5, r6);
        this.f1989++;
        return null;
    L5:
        return ((C0285) this.f1986[r0]).setValue(r6);
    }

    /* JADX INFO: renamed from: ˈ */
    public final Object m1631(int r7) {
        m1636();
        Object[] r0 = this.f1986;
        Object r1 = ((C0285) r0[r7]).f1888;
        System.arraycopy(r0, r7 + 1, r0, r7, (this.f1989 - r7) - 1);
        this.f1989--;
        if (this.f1985.isEmpty() == true) goto L5;
        Iterator r72 = m1633().entrySet().iterator();
        Object[] r02 = this.f1986;
        int r2 = this.f1989;
        Map.Entry r4 = (Map.Entry) r72.next();
        r02[r2] = new C0285(this, (Comparable) r4.getKey(), r4.getValue());
        this.f1989++;
        r72.remove();
    L5:
        return r1;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final int m1632(Comparable r5) {
        int r0 = this.f1989;
        int r1 = r0 - 1;
        int r2 = 0;
        if (r1 < 0) goto L11;
        int r3 = r5.compareTo(((C0285) this.f1986[r1]).f1887);
        if (r3 > 0) goto L7;
        if (r3 != 0) goto L11;
        return r1;
    L7:
        return -(r0 + 1);
    L11:
        if (r2 > r1) goto L19;
        int r02 = (r2 + r1) / 2;
        int r32 = r5.compareTo(((C0285) this.f1986[r02]).f1887);
        if (r32 < 0) goto L14;
        if (r32 <= 0) goto L17;
        r2 = r02 + 1;
        goto L11
    L17:
        return r02;
    L14:
        r1 = r02 - 1;
        goto L11
    L19:
        return -(r2 + 1);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final SortedMap m1633() {
        m1636();
        if (this.f1985.isEmpty() == false) goto L8;
        if ((this.f1985 instanceof TreeMap) == true) goto L8;
        TreeMap r0 = new TreeMap();
        this.f1985 = r0;
        this.f1988 = r0.descendingMap();
    L8:
        return (SortedMap) this.f1985;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final Set m1634() {
        if (this.f1985.isEmpty() == false) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return this.f1985.entrySet();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C0285 m1635(int r2) {
        if (r2 >= this.f1989) goto L7;
        return (C0285) this.f1986[r2];
    L7:
        throw new ArrayIndexOutOfBoundsException(r2);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m1636() {
        if (this.f1987 == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }
}
