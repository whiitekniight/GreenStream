package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ˏי */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0032 implements Cloneable {

    /* JADX INFO: renamed from: ʾˋ */
    public final AbstractC0004 f424;

    /* JADX INFO: renamed from: ᴵˊ */
    public AbstractC0004 f425;

    public AbstractC0032(AbstractC0004 r2) {
        this.f424 = r2;
        if (r2.m151() == true) goto L7;
        this.f425 = r2.m148();
        return;
    L7:
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final Object clone() {
        AbstractC0032 r0 = (AbstractC0032) this.f424.mo149(5);
        r0.f425 = m243();
        return r0;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m242() {
        if (this.f425.m151() == true) goto L6;
        AbstractC0004 r0 = this.f424.m148();
        AbstractC0004 r1 = this.f425;
        C0035 r2 = C0035.f426;
        r2.getClass();
        r2.m254(r0.getClass()).mo177(r0, r1);
        this.f425 = r0;
        return;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final AbstractC0004 m243() {
        if (this.f425.m151() == false) goto L5;
        AbstractC0004 r0 = this.f425;
        r0.getClass();
        C0035 r1 = C0035.f426;
        r1.getClass();
        r1.m254(r0.getClass()).mo176(r0);
        r0.m152();
        return this.f425;
    L5:
        return this.f425;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC0004 m244() {
        AbstractC0004 r0 = m243();
        r0.getClass();
        if (AbstractC0004.m147(r0, true) == false) goto L6;
        return r0;
    L6:
        throw new UninitializedMessageException();
    }
}
