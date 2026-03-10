package p133;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ˈˊ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C2502 implements PrivilegedExceptionAction {
    /* JADX INFO: renamed from: ﹳٴ */
    public static Unsafe m5715() {
        Field[] r1 = Unsafe.class.getDeclaredFields();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L10;
        Field r4 = r1[r3];
        r4.setAccessible(true);
        Object r42 = r4.get(null);
        if (Unsafe.class.isInstance(r42) == true) goto L7;
        r3 = r3 + 1;
        goto L3
    L7:
        return (Unsafe) Unsafe.class.cast(r42);
    L10:
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        return m5715();
    }
}
