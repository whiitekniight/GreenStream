package p234;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ˏᵔ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3532 implements Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final ArrayList f12544;

    public C3532() {
        this.f12544 = new ArrayList();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final String m7292(String r3) {
        StringBuilder r0 = new StringBuilder(256);
        if (r3 == null) goto L5;
        r0.append(r3);
    L5:
        ArrayList r32 = this.f12544;
        if (r32.size() <= 0) goto L20;
        if (r0.length() <= 0) goto L10;
        r0.append('\n');
    L10:
        r0.append("Exception Context:\n");
        Iterator r33 = r32.iterator();
        if (r33.hasNext() == true) goto L14;
        r0.append("---------------------------------");
        goto L20
    L14:
        if (r33.next() != null) goto L18;
        r0.append("\t[");
        r0.append(1);
        r0.append(':');
        throw null;
    L18:
        throw new ClassCastException();
    L20:
        return r0.toString();
    }
}
