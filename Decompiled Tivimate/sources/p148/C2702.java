package p148;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import ar.tvplayer.p002tv.R;

/* JADX INFO: renamed from: ˉʿ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2702 extends ContextWrapper {

    /* JADX INFO: renamed from: ﾞᴵ */
    public static Configuration f9636;

    /* JADX INFO: renamed from: ʽ */
    public LayoutInflater f9637;

    /* JADX INFO: renamed from: ˈ */
    public Configuration f9638;

    /* JADX INFO: renamed from: ˑﹳ */
    public Resources f9639;

    /* JADX INFO: renamed from: ⁱˊ */
    public Resources.Theme f9640;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f9641;

    public C2702(Context r1, int r2) {
        super(r1);
        this.f9641 = r2;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context r1) {
        super.attachBaseContext(r1);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f9639 != null) goto L17;
        Configuration r0 = this.f9638;
        if (r0 != null) goto L7;
    L15:
        this.f9639 = super.getResources();
        goto L17
    L7:
        if (Build.VERSION.SDK_INT >= 26) goto L9;
    L14:
        this.f9639 = createConfigurationContext(this.f9638).getResources();
        goto L17
    L9:
        if (f9636 != null) goto L12;
        Configuration r1 = new Configuration();
        r1.fontScale = 0.0f;
        f9636 = r1;
    L12:
        if (r0.equals(f9636) == false) goto L14;
    L17:
        return this.f9639;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String r2) {
        if ("layout_inflater".equals(r2) == false) goto L10;
        if (this.f9637 != null) goto L8;
        this.f9637 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
    L8:
        return this.f9637;
    L10:
        return getBaseContext().getSystemService(r2);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme r0 = this.f9640;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (this.f9641 != 0) goto L8;
        this.f9641 = R.style.u;
    L8:
        m5917();
        return this.f9640;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
        if (this.f9641 == r2) goto L6;
        this.f9641 = r2;
        m5917();
        return;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m5917() {
        if (this.f9640 != null) goto L7;
        this.f9640 = getResources().newTheme();
        Resources.Theme r0 = getBaseContext().getTheme();
        if (r0 == null) goto L7;
        this.f9640.setTo(r0);
    L7:
        this.f9640.applyStyle(this.f9641, true);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m5918(Configuration r2) {
        if (this.f9639 != null) goto L11;
        if (this.f9638 != null) goto L9;
        this.f9638 = new Configuration(r2);
        return;
    L9:
        throw new IllegalStateException("Override configuration has already been set");
    L11:
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }
}
