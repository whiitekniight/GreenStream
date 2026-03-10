package p029;

import com.google.android.gms.internal.measurement.ᵎ;
import java.util.Map;

/* JADX INFO: renamed from: ʼʻ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1447 implements Map.Entry {
    public AbstractC1447() {
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r4) {
        if ((r4 instanceof Map.Entry) == false) goto L10;
        Map.Entry r42 = (Map.Entry) r4;
        if (ᵎ.ᵎﹶ(getKey(), r42.getKey()) == false) goto L10;
        if (ᵎ.ᵎﹶ(getValue(), r42.getValue()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object r0 = getKey();
        Object r1 = getValue();
        int r2 = 0;
        if (r0 != null) goto L5;
        int r02 = 0;
    L6:
        if (r1 == null) goto L10;
        r2 = r1.hashCode();
    L10:
        return r02 ^ r2;
    L5:
        r02 = r0.hashCode();
        goto L6
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
