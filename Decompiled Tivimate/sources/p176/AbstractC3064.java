package p176;

/* JADX INFO: renamed from: ˊᐧ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3064 implements InterfaceC3071 {

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC3071 f10743;

    public AbstractC3064(InterfaceC3071 r1) {
        this.f10743 = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10743.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f10743 + ')';
    }

    @Override // p176.InterfaceC3071
    /* JADX INFO: renamed from: ˑﹳ */
    public final C3063 mo6473() {
        return this.f10743.mo6473();
    }
}
