package p328;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p025.C1405;
import p138.InterfaceC2619;
import p385.EnumC5015;
import ˑי.ʽ;

/* JADX INFO: renamed from: ᴵʾ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4391 implements InterfaceC2619, InterfaceC4386, Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC2619 f16111;

    public AbstractC4391(InterfaceC2619 r1) {
        this.f16111 = r1;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("Continuation at ");
        Object r1 = mo5435();
        if (r1 != null) goto L5;
        r1 = getClass().getName();
    L5:
        r0.append(r1);
        return r0.toString();
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public StackTraceElement mo5435() {
        InterfaceC4387 r0 = (InterfaceC4387) getClass().getAnnotation(InterfaceC4387.class);
        String r1 = null;
        if (r0 != null) goto L5;
        return null;
    L5:
        int r2 = r0.m8796v();
        if (r2 > 1) goto L51;
        int r22 = -1;
        Field r4 = getClass().getDeclaredField("label");     // Catch: Exception -> L17
        r4.setAccessible(true);     // Catch: Exception -> L17
        Object r42 = r4.get(this);     // Catch: Exception -> L17
        if ((r42 instanceof Integer) == false) goto L11;
        Integer r43 = (Integer) r42;     // Catch: Exception -> L17
    L12:
        if (r43 == null) goto L15;
        int r44 = r43.intValue();     // Catch: Exception -> L17
    L16:
        int r45 = r44 - 1;
    L18:
        if (r45 < 0) goto L21;
        r22 = r0.m8794l()[r45];
    L21:
        ʽ r3 = AbstractC4392.f16112;
        ʽ r46 = AbstractC4392.f16113;
        if (r3 == null) goto L54;
    L26:
        if (r3 == r46) goto L45;
        Method r47 = (Method) r3.ʾˋ;
        if (r47 == null) goto L45;
        Object r48 = r47.invoke(getClass(), null);
        if (r48 == null) goto L45;
        Method r5 = (Method) r3.ᴵˊ;
        if (r5 == null) goto L45;
        Object r49 = r5.invoke(r48, null);
        if (r49 == null) goto L45;
        Method r32 = (Method) r3.ʽʽ;
        if (r32 == null) goto L41;
        Object r33 = r32.invoke(r49, null);
    L43:
        if ((r33 instanceof String) == false) goto L45;
        r1 = (String) r33;
        goto L45
    L41:
        r33 = null;
    L45:
        if (r1 != null) goto L47;
        String r12 = r0.m8792c();
    L49:
        return new StackTraceElement(r12, r0.m8795m(), r0.m8793f(), r22);
    L47:
        r12 = r1 + '/' + r0.m8792c();
        goto L49
    L54:
        ʽ r7 = new ʽ(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));     // Catch: Exception -> L25
        AbstractC4392.f16112 = r7;     // Catch: Exception -> L25
        r3 = r7;
    L25:
        AbstractC4392.f16112 = r46;
        r3 = r46;
        goto L26
    L15:
        r44 = 0;
        goto L16
    L11:
        r43 = null;
    L17:
        r45 = -1;
        goto L18
    L51:
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + r2 + ". Please update the Kotlin standard library.").toString());
    }

    /* JADX INFO: renamed from: ˈ */
    public InterfaceC4386 mo5436() {
        InterfaceC2619 r0 = this.f16111;
        if ((r0 instanceof InterfaceC4386) == true) goto L5;
        return null;
    L5:
        return (InterfaceC4386) r0;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public InterfaceC2619 mo4461(Object r1, InterfaceC2619 r2) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // p138.InterfaceC2619
    /* JADX INFO: renamed from: ᵔᵢ */
    public final void mo4260(Object r4) {
        InterfaceC2619 r0 = this;
    L3:
        AbstractC4391 r02 = (AbstractC4391) r0;
        InterfaceC2619 r1 = r02.f16111;
        r4 = r02.mo4100(r4);     // Catch: Throwable -> L7
        if (r4 == EnumC5015.f17902) goto L6;
    L9:
        r02.mo8791();
        if ((r1 instanceof AbstractC4391) == false) goto L12;
        r0 = r1;
        goto L3
    L12:
        r1.mo4260(r4);
        return;
    L6:
        return;
    L7:
        th = move-exception;
        r4 = new C1405(th);
        goto L9
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public abstract Object mo4100(Object r1);

    /* JADX INFO: renamed from: ﹳᐧ */
    public void mo8791() {
    }
}
