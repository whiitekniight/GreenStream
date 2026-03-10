package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ﹳـ */
/* JADX INFO: loaded from: classes.dex */
public final class C0063 extends AbstractMap {

    /* JADX INFO: renamed from: ˊʻ */
    public static final /* synthetic */ int f502 = 0;

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f503;

    /* JADX INFO: renamed from: ʾˋ */
    public List f504;

    /* JADX INFO: renamed from: ˈٴ */
    public volatile C0026 f505;

    /* JADX INFO: renamed from: ᴵˊ */
    public Map f506;

    /* JADX INFO: renamed from: ᴵᵔ */
    public Map f507;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static C0063 m371() {
        C0063 r0 = new C0063();
        r0.f504 = Collections.EMPTY_LIST;
        Map r1 = Collections.EMPTY_MAP;
        r0.f506 = r1;
        r0.f507 = r1;
        return r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m377();
        if (this.f504.isEmpty() == true) goto L6;
        this.f504.clear();
    L6:
        if (this.f506.isEmpty() == true) goto L9;
        this.f506.clear();
        return;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object r2) {
        Comparable r22 = (Comparable) r2;
        if (m378(r22) < 0) goto L5;
        return true;
    L5:
        if (this.f506.containsKey(r22) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f505 != null) goto L6;
        this.f505 = new C0026(this, 0);
    L6:
        return this.f505;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object r7) {
        if (this != r7) goto L5;
        return true;
    L5:
        if ((r7 instanceof C0063) == false) goto L7;
        C0063 r72 = (C0063) r7;
        int r0 = size();
        if (r0 != r72.size()) goto L19;
        int r1 = this.f504.size();
        if (r1 != r72.f504.size()) goto L14;
        int r3 = 0;
    L16:
        if (r3 >= r1) goto L21;
        if (m372(r3).equals(r72.m372(r3)) == false) goto L19;
        r3 = r3 + 1;
        goto L16
    L21:
        if (r1 != r0) goto L23;
        return true;
    L23:
        return this.f506.equals(r72.f506);
    L14:
        return ((AbstractSet) entrySet()).equals(r72.entrySet());
    L19:
        return false;
    L7:
        return super.equals(r7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object r2) {
        Comparable r22 = (Comparable) r2;
        int r0 = m378(r22);
        if (r0 < 0) goto L7;
        return ((C0023) this.f504.get(r0)).f408;
    L7:
        return this.f506.get(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int r0 = this.f504.size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L6;
        r2 = r2 + ((C0023) this.f504.get(r1)).hashCode();
        r1 = r1 + 1;
        goto L3
    L6:
        if (this.f506.size() > 0) goto L8;
        return r2;
    L8:
        return this.f506.hashCode() + r2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object r1, Object r2) {
        return m375((Comparable) r1, r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object r2) {
        m377();
        Comparable r22 = (Comparable) r2;
        int r0 = m378(r22);
        if (r0 < 0) goto L7;
        return m376(r0);
    L7:
        if (this.f506.isEmpty() == false) goto L11;
        return null;
    L11:
        return this.f506.remove(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        int r0 = this.f504.size();
        return this.f506.size() + r0;
    }

    /* JADX INFO: renamed from: ʽ */
    public final Map.Entry m372(int r2) {
        return (Map.Entry) this.f504.get(r2);
    }

    /* JADX INFO: renamed from: ˈ */
    public final Set m373() {
        if (this.f506.isEmpty() == false) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return this.f506.entrySet();
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final SortedMap m374() {
        m377();
        if (this.f506.isEmpty() == false) goto L8;
        if ((this.f506 instanceof TreeMap) == true) goto L8;
        TreeMap r0 = new TreeMap();
        this.f506 = r0;
        this.f507 = r0.descendingMap();
    L8:
        return (SortedMap) this.f506;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final Object m375(Comparable r5, Object r6) {
        m377();
        int r0 = m378(r5);
        if (r0 >= 0) goto L5;
        m377();
        if (this.f504.isEmpty() == true) goto L9;
    L11:
        int r02 = -(r0 + 1);
        if (r02 < 16) goto L16;
        return m374().put(r5, r6);
    L16:
        if (this.f504.size() != 16) goto L18;
        C0023 r1 = (C0023) this.f504.remove(15);
        m374().put(r1.f407, r1.f408);
    L18:
        this.f504.add(r02, new C0023(this, r5, r6));
        return null;
    L9:
        if ((this.f504 instanceof ArrayList) == true) goto L11;
        this.f504 = new ArrayList(16);
        goto L11
    L5:
        return ((C0023) this.f504.get(r0)).setValue(r6);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final Object m376(int r6) {
        m377();
        Object r62 = ((C0023) this.f504.remove(r6)).f408;
        if (this.f506.isEmpty() == true) goto L5;
        Iterator r0 = m374().entrySet().iterator();
        List r1 = this.f504;
        Map.Entry r3 = (Map.Entry) r0.next();
        r1.add(new C0023(this, (Comparable) r3.getKey(), r3.getValue()));
        r0.remove();
    L5:
        return r62;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m377() {
        if (this.f503 == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m378(Comparable r5) {
        int r0 = this.f504.size();
        int r1 = r0 - 1;
        if (r1 < 0) goto L11;
        int r2 = r5.compareTo(((C0023) this.f504.get(r1)).f407);
        if (r2 <= 0) goto L9;
        int r02 = r0 + 1;
    L8:
        return -r02;
    L9:
        if (r2 != 0) goto L11;
        return r1;
    L11:
        int r03 = 0;
    L12:
        if (r03 > r1) goto L19;
        int r22 = (r03 + r1) / 2;
        int r3 = r5.compareTo(((C0023) this.f504.get(r22)).f407);
        if (r3 < 0) goto L15;
        if (r3 <= 0) goto L18;
        r03 = r22 + 1;
        goto L12
    L18:
        return r22;
    L15:
        r1 = r22 - 1;
        goto L12
    L19:
        r02 = r03 + 1;
        goto L8
    }
}
