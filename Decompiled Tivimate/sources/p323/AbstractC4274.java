package p323;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᐧᵢ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4274 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static Constructor f15647;

    /* JADX INFO: renamed from: ﹳٴ */
    public static Object m8666(Method r6, Class r7, Object r8, Object[] r9) {
        Constructor r0 = f15647;
        if (r0 != null) goto L6;
        r0 = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
        r0.setAccessible(true);
        f15647 = r0;
    L6:
        return ((MethodHandles.Lookup) r0.newInstance(new Object[]{r7, -1})).unreflectSpecial(r6, r7).bindTo(r8).invokeWithArguments(r9);
    }
}
