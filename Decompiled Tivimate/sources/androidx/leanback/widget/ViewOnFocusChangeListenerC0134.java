package androidx.leanback.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.leanback.widget.ᴵʼ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0134 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ SearchBar f978;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f979;

    public /* synthetic */ ViewOnFocusChangeListenerC0134(SearchBar r1, int r2) {
        this.f979 = r2;
        this.f978 = r1;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View r4, boolean r5) {
        switch(this.f979) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        SearchBar r42 = this.f978;
        if (r5 == false) goto L9;
        r42.m551();
        if (r42.f737 == false) goto L10;
        r42.m548();
        r42.f737 = false;
    L10:
        r42.m550(r5);
        return;
    L9:
        r42.m552();
        goto L10
    L12:
        SearchBar r43 = this.f978;
        if (r5 == false) goto L15;
        r43.f738.post(new RunnableC0083(r43, 1));
    L16:
        r43.m550(r5);
        return;
    L15:
        r43.m551();
        goto L16
    }
}
