package p126;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: ˆﾞ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C2470 implements InterfaceC2466 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final LocaleList f8790;

    public C2470(Object r1) {
        this.f8790 = (LocaleList) r1;
    }

    public final boolean equals(Object r2) {
        return this.f8790.equals(((InterfaceC2466) r2).mo5679());
    }

    @Override // p126.InterfaceC2466
    public final Locale get(int r2) {
        return this.f8790.get(r2);
    }

    public final int hashCode() {
        return this.f8790.hashCode();
    }

    @Override // p126.InterfaceC2466
    public final boolean isEmpty() {
        return this.f8790.isEmpty();
    }

    @Override // p126.InterfaceC2466
    public final int size() {
        return this.f8790.size();
    }

    public final String toString() {
        return this.f8790.toString();
    }

    @Override // p126.InterfaceC2466
    /* JADX INFO: renamed from: ⁱˊ */
    public final Object mo5679() {
        return this.f8790;
    }

    @Override // p126.InterfaceC2466
    /* JADX INFO: renamed from: ﹳٴ */
    public final String mo5680() {
        return this.f8790.toLanguageTags();
    }
}
