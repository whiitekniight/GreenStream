package p279;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p267.C3842;

/* JADX INFO: renamed from: ـˋ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3948 {

    /* JADX INFO: renamed from: ʽ */
    public final C3842 f14558;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C3842 f14559;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3842 f14560;

    public AbstractC3948(C3842 r1, C3842 r2, C3842 r3) {
        this.f14560 = r1;
        this.f14559 = r2;
        this.f14558 = r3;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public abstract void mo8083(int r1);

    /* JADX INFO: renamed from: ʽ */
    public final Method m8086(String r6) {
        C3842 r0 = this.f14560;
        Method r1 = (Method) r0.get(r6);
        if (r1 != null) goto L6;
        System.currentTimeMillis();
        Method r12 = Class.forName(r6, true, AbstractC3948.class.getClassLoader()).getDeclaredMethod("read", new Class[]{AbstractC3948.class});
        r0.put(r6, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final void m8087(int r1, int r2) {
        mo8083(r2);
        ((C3947) this).f14553.writeInt(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ˈ */
    public final Method m8088(Class r6) {
        String r0 = r6.getName();
        C3842 r1 = this.f14559;
        Method r02 = (Method) r1.get(r0);
        if (r02 != null) goto L6;
        Class r03 = m8092(r6);
        System.currentTimeMillis();
        Method r04 = r03.getDeclaredMethod("write", new Class[]{r6, AbstractC3948.class});
        r1.put(r6.getName(), r04);
        return r04;
    L6:
        return r02;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public abstract boolean mo8084(int r1);

    /* JADX INFO: renamed from: ٴﹶ */
    public final void m8089(InterfaceC3946 r6) {
        if (r6 != null) goto L36;
        ((C3947) this).f14553.writeString(null);
        return;
    L36:
        ((C3947) this).f14553.writeString(m8092(r6.getClass()).getName());
        C3947 r1 = mo8085();
        m8088(r6.getClass()).invoke(null, new Object[]{r6, r1});     // Catch: ClassNotFoundException -> L13 NoSuchMethodException -> L15 InvocationTargetException -> L17 IllegalAccessException -> L19
        Parcel r62 = r1.f14553;
        int r0 = r1.f14550;
        if (r0 < 0) goto L40;
        int r02 = r1.f14552.get(r0);
        int r12 = r62.dataPosition();
        r62.setDataPosition(r02);
        r62.writeInt(r12 - r02);
        r62.setDataPosition(r12);
        return;
    L40:
        return;
    L13:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
    L19:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
    L15:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e);
    L17:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == false) goto L30;
        throw ((RuntimeException) e.getCause());
    L30:
        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e);
    L33:
        e = move-exception;
        throw new RuntimeException(r6.getClass().getSimpleName().concat(" does not have a Parcelizer"), e);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final Parcelable m8090(Parcelable r1, int r2) {
        if (mo8084(r2) == true) goto L5;
        return r1;
    L5:
        ClassLoader r22 = C3947.class.getClassLoader();
        return ((C3947) this).f14553.readParcelable(r22);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final InterfaceC3946 m8091() {
        String r0 = ((C3947) this).f14553.readString();
        if (r0 != null) goto L5;
        return null;
    L5:
        C3947 r2 = mo8085();
        return (InterfaceC3946) m8086(r0).invoke(null, new Object[]{r2});
    L8:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
    L14:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
    L10:
        e = move-exception;
        throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e);
    L12:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == false) goto L25;
        throw ((RuntimeException) e.getCause());
    L25:
        throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final Class m8092(Class r5) {
        String r0 = r5.getName();
        C3842 r1 = this.f14558;
        Class r02 = (Class) r1.get(r0);
        if (r02 != null) goto L6;
        Class<?> r03 = Class.forName(r5.getPackage().getName() + "." + r5.getSimpleName() + "Parcelizer", false, r5.getClassLoader());
        r1.put(r5.getName(), r03);
        return r03;
    L6:
        return r02;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract C3947 mo8085();

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int m8093(int r1, int r2) {
        if (mo8084(r2) == true) goto L6;
        return r1;
    L6:
        return ((C3947) this).f14553.readInt();
    }
}
