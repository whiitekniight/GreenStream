package p029;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ʼʻ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1448 {

    /* JADX INFO: renamed from: ʽʽ */
    public transient Map f4860;

    /* JADX INFO: renamed from: ʾˋ */
    public transient Set f4861;

    /* JADX INFO: renamed from: ᴵˊ */
    public transient Collection f4862;

    public AbstractC1448() {
    }

    public boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof AbstractC1448) == true) goto L8;
        return false;
    L8:
        return mo3958().equals(((AbstractC1448) r2).mo3958());
    }

    public final int hashCode() {
        return mo3958().hashCode();
    }

    public final String toString() {
        return mo3958().toString();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public boolean mo3957(Object r3) {
        Iterator r0 = mo3958().values().iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        if (((Collection) r0.next()).contains(r3) == false) goto L4;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract Map mo3958();
}
