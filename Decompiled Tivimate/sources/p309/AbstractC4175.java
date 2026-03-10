package p309;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import p319.AbstractC4223;
import p330.EnumC4399;

/* JADX INFO: renamed from: ᐧ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4175 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final HashMap f15380 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final SparseArray f15381 = null;

    static {
        f15381 = new SparseArray();
        HashMap r0 = new HashMap();
        f15380 = r0;
        r0.put(EnumC4399.f16121, 0);
        r0.put(EnumC4399.f16123, 1);
        r0.put(EnumC4399.f16120, 2);
        Iterator r02 = r0.keySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        EnumC4399 r1 = (EnumC4399) r02.next();
        f15381.append(((Integer) f15380.get(r1)).intValue(), r1);
        goto L4
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static EnumC4399 m8439(int r2) {
        EnumC4399 r0 = (EnumC4399) f15381.get(r2);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalArgumentException(AbstractC4223.m8643(r2, "Unknown Priority for value "));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m8440(EnumC4399 r3) {
        Integer r0 = (Integer) f15380.get(r3);
        if (r0 == null) goto L7;
        return r0.intValue();
    L7:
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + r3);
    }
}
