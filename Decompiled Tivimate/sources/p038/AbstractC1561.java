package p038;

import java.util.LinkedHashMap;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ʼـ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1561 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final LinkedHashMap f5176;

    public AbstractC1561() {
        this.f5176 = new LinkedHashMap();
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof AbstractC1561) == false) goto L8;
        LinkedHashMap r22 = ((AbstractC1561) r2).f5176;
        if (AbstractC2927.m6273(this.f5176, r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.f5176.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f5176 + ')';
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract Object mo4135(InterfaceC1563 r1);
}
